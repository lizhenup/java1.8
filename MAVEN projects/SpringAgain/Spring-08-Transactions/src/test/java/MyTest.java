import com.lz.mapper.UserMapper;
import com.lz.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


/**
 * @author ：lizhen
 * @date ：Created in 2020/9/1 0:04
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-dao.xml");
        UserMapper bean = context.getBean("userMapper", UserMapper.class);

        for (User user : bean.selectUser()) {
            System.out.println(user.toString());
        }


    }
}
