import com.lz.pojo.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/30 0:20
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld hello = (HelloWorld) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
