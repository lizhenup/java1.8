package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Goods;
import util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/goods")
public class GoodsBrowseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset = utf-8");
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Goods> goodsList = new ArrayList<>();
        //1.从mysql中找到商品信息
        try {
            String sql = "select id, name,introduce,stock,unit,price,discount from goods";
            connection = DBUtil.getConnection(true);
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Goods goods = new Goods();
                goods.setId(rs.getInt("id"));
                goods.setName(rs.getString("name"));
                goods.setIntroduce(rs.getString("introduce"));
                goods.setStock(rs.getInt("stock"));
                goods.setUnit(rs.getString("unit"));
                goods.setPrice(rs.getInt("price"));
                goods.setDiscount(rs.getInt("discount"));
                goodsList.add(goods);
            }
            System.out.println("商品列表");
            System.out.println(goodsList);
            ObjectMapper objectMapper = new ObjectMapper();
            //将list转换为json字符串，并将该字符串写入流中
            Writer writer = resp.getWriter();
            objectMapper.writeValue(writer,goodsList);
            //推到前端
            writer.write(writer.toString());

        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,ps,rs);
        }
    }
}
