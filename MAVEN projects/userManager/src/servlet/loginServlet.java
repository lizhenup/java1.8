package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import entiy.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：lizhen
 * @date ：Created in 2020/7/19 19:13
 * @description：
 * @modified By：
 * @version: $
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        //System.out.println(1111);
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //System.out.println(2222);
        System.out.println("username" + username);
        System.out.println("password" + password);

        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);

        UserService userService = new UserService();
        //userService.login(loginUser);
        User user = userService.login(loginUser);

        Map<String, Object> returnMap = new HashMap<>();
        if(user != null) {
            System.out.println(username + "登陆成功");
            //写入session
            req.getSession().setAttribute("user",user);
            returnMap.put("msg",true);

        }else {
            System.out.println(username + "登陆失败");
            returnMap.put("msg",false);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        //returnMap转换为json字符串
        objectMapper.writeValue(resp.getWriter(), returnMap);
    }
}
