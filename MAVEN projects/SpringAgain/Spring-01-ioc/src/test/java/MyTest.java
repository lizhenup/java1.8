import com.lz.dao.GoDaoImpl;
import com.lz.dao.UserDao;
import com.lz.service.UserService;
import com.lz.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/29 23:32
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest {
    public static void main(String[] args) {
        /*UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new GoDaoImpl());
        userService.getUser();*/
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }

}
