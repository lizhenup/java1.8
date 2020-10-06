package servlet;


import commen.OrderStatus;
import entity.Account;
import entity.Goods;
import entity.Order;
import entity.OrderItem;
import util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet("/pay")
public class ReadyBuyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset = utf-8");
        List<Goods> goodsList = new ArrayList<>();
        String goodsIDandNum = req.getParameter("goodsIDandNum");

        String[] strings1 = goodsIDandNum.split(",");
        for (String s1 : strings1) {
            String[] strings2 = s1.split("-");
            Goods goods = getGoods(Integer.valueOf(strings2[0]));
            if (goods != null) {
                goods.setBuyGoodsNum(Integer.valueOf(strings2[1]));
                goodsList.add(goods);
            }
        }
        System.out.println("购买的商品列表");
        System.out.println(goodsList);
        //创建订单
        Order order = new Order();
        order.setId(String.valueOf(System.currentTimeMillis()));
        HttpSession session = req.getSession();
        Account account = (Account) session.getAttribute("user");
        order.setAccount_id(account.getId());
        order.setAccount_name(account.getUsername());
        /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        order.setCreate_time(LocalDateTime.now().format(formatter));*/

        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat format = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss"
        );

        String createTime = format.format(date);
        order.setCreate_time(createTime);
        int totalMoney = 0;
        int actualMoney = 0;
        for (Goods goods : goodsList) {
            //订单项
            OrderItem orderItem = new OrderItem();
            orderItem.setOrderId(order.getId());
            orderItem.setGoodsId(goods.getId());
            orderItem.setGoodsName(goods.getName());
            orderItem.setGoodsIntroduce(goods.getIntroduce());
            orderItem.setGoodsNum(goods.getBuyGoodsNum());
            orderItem.setGoodsUnit(goods.getUnit());
            orderItem.setGoodsPrice(goods.getPriceInt());
            orderItem.setGoodsDiscount(goods.getDiscount());

            order.orderItemList.add(orderItem);
            int currentMoney = goods.getBuyGoodsNum() * goods.getPriceInt();
            totalMoney += currentMoney;
            actualMoney += currentMoney * goods.getDiscount() / 100;

        }
        order.setTotal_money(totalMoney);
        order.setActual_amount(actualMoney);
        order.setOrder_status(OrderStatus.PLAYING);

        System.out.println("订单表：");
        System.out.println(order);

        HttpSession session2 = req.getSession();
        session2.setAttribute("order",order);

        HttpSession session3 = req.getSession();
        session3.setAttribute("goodsList",goodsList);

        resp.getWriter().println("<html>");
        resp.getWriter().println("<p>" + "【用户名称】:" + order.getAccount_name() + "</p>");
        resp.getWriter().println("<p>" + "【订单编号】:" + order.getId() + "</p>");
        resp.getWriter().println("<p>" + "【订单状态】:" + order.getOrder_statusDesc() + "</p>");
        resp.getWriter().println("<p>" + "【创建时间】:" + order.getCreate_time() + "</p>");
        resp.getWriter().println("<p>" + "编号  " + "名称  " + "数量  " + "单位  " + "单价(元)  " + "</p>");
        resp.getWriter().println("<ol>");
        for (OrderItem orderIt : order.orderItemList) {
            resp.getWriter().println("<li>" + orderIt.getGoodsName() + " " + orderIt.getGoodsNum() + " " +
                    orderIt.getGoodsUnit() + " " + orderIt.getGoodsPrice() + "</li>");
        }
        resp.getWriter().println("</ol>");
        resp.getWriter().println("<p>" + "【总金额】:" + order.getTotal_money() + "</p>");
        resp.getWriter().println("<p>" + "【优惠金额】:" + order.getDiscount() + "</p>");
        resp.getWriter().println("<p>" + "【应支付金额】:" + order.getActual_amount() + "</p>");
        //a标签只会以get方法请求servlet
        resp.getWriter().println("<a href=\" buyGoodsServlet\" >确认</a>");
        //resp.getWriter().println(" <form action=\" buyGoodsServlet\”method=\" post\ ><button type=\"submit\" >确认</button></form>
        resp.getWriter().println("<a href=\" index.html\">取消</a>");
        resp.getWriter().println("</html>");
    }

    public Goods getGoods(int goodsId) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Goods goods = null;

        try {
            String sql = "select * from goods where id = ?";
            connection =DBUtil.getConnection(true);
            ps = connection.prepareStatement(sql);
            ps.setInt(1,goodsId);
            rs = ps.executeQuery();
            if(rs.next()) {
                goods = new Goods();
                goods.setId(rs.getInt("id"));
                goods.setName(rs.getString("name"));
                goods.setIntroduce(rs.getString("introduce"));
                goods.setStock(rs.getInt("stock"));
                goods.setUnit(rs.getString("unit"));
                goods.setPrice(rs.getInt("price"));
                goods.setDiscount(rs.getInt("discount"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,ps,rs);
        }
        return goods;
    }
}
