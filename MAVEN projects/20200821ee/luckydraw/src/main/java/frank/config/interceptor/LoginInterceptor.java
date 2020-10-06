package frank.config.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import frank.base.ResponseResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/23 22:10
 * @description：
 * @modified By：
 * @version: $
 */
public class LoginInterceptor implements HandlerInterceptor {

    private ObjectMapper objectMapper;

    /**
     * create by: lizhen
     * description:
     * if(session != null && session.getAttribute("user") != null)
     * return true;==>继续执行
     * else 返回一个带错误码信息的JSON
    */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(false);
        if(session != null && session.getAttribute("user") != null) {
            //登录，继续执行Controller中的方法
            return true;
        }
        response.setStatus(HttpStatus.UNAUTHORIZED.value());

        //前端已经通过状态码处理过了，可以不返回响应体内容
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);//浏览器用来解析的数据和编码
        response.setCharacterEncoding("UTF-8");//设置响应体编码
        ResponseResult r = ResponseResult.error("SES000","用户没有登录");
        PrintWriter pw = response.getWriter();
        pw.println(objectMapper.writeValueAsString(r));
        pw.flush();
        return false;
    }

    public LoginInterceptor(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
}
