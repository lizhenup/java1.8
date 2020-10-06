package servlet;

import entiy.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ：lizhen
 * @date ：Created in 2020/7/24 19:05
 * @description：
 * @modified By：
 * @version: $
 */
@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String idString = req.getParameter("id");
        int id = Integer.parseInt(idString);

        UserService userService = new UserService();
        User user = userService.find(id);

        if(user == null) {
            System.out.println("没有要修改的对象！ ");
        }else {
            req.getSession().setAttribute("updateUser", user);
            resp.sendRedirect("/update.html");
        }
    }
}
