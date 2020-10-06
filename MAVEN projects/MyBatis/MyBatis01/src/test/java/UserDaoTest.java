import com.lz.dao.UserMapper;
import com.lz.pojo.User;
import com.lz.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/10 18:56
 * @description：
 * @modified By：
 * @version: $
 */
public class UserDaoTest {
    @Test
    public void test() {
        //1.获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        //方式一：getMapper
        //UseDao useDao = sqlSession.getMapper(UseDao.class);
        //List<User> userList = useDao.getUserList();
        /*List<User> userList = sqlSession.selectList("com.lz.dao.UserMapper.getUserList");
        for (User user : userList) {
            System.out.println(user);
        }*/
        //关闭SqlSession
        sqlSession.close();
    }
    @Test
    public void getUserById() {
        //1.获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        //方式一：getMapper
        //UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //System.out.println(mapper.getUserById(3));
        //List<User> userList = useDao.getUserList();
        /*List<User> userList = sqlSession.selectList("com.lz.dao.UserMapper.getUserList");
        for (User user : userList) {
            System.out.println(user);
        }*/
        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void getUserById2() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String,Object> map = new HashMap<String,Object>();

        map.put("id",12);

        System.out.println(mapper.getUserById2(map));


        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void addUser2() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<String, Object>();

        map.put("name","map");
        map.put("_class","一年级二班");
        int ret = mapper.addUser2(map);

        if(ret > 0) {
            System.out.println("success");
        }else {
            System.out.println("fail");
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void addUser() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int ret = mapper.addUser(new User("kdcbj", "三年级一班"));
        if(ret > 0) {
            System.out.println("success");
        }else {
            System.out.println("fail");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void update() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int ret = mapper.upDateUser(new User(10,"东风知我意", "六年级六班"));
        if(ret > 0) {
            System.out.println("success");
        }else {
            System.out.println("fail");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession  = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int ret = mapper.deleteUser(5);
        if(ret > 0) {
            System.out.println("success");
        }else {
            System.out.println("fail");
        }

        sqlSession.commit();
        sqlSession.close();
    }

    public void isSuccess(int ret) {
        if(ret > 0) {
            System.out.println("success");
        }else {
            System.out.println("fail");
        }
    }

    @Test
    public  void  getUserLike() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> list = mapper.getUserLike("%小%");

        for (User user : list) {
            System.out.println(user);
        }

        sqlSession.close();
    }

}
