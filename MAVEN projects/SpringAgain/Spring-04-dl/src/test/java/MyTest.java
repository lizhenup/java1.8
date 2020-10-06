import com.lz.pojo.Address;
import com.lz.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/30 17:32
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = context.getBean("student",Student.class);
        System.out.println(student.toString());
    }

}
