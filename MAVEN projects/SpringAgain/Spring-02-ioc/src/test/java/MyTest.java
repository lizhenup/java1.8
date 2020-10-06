import com.lz.pojo.User;
import com.lz.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/30 15:28
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserT user = (UserT) context.getBean("u2");
        user.show();
    }
}
