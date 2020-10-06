package dao;

import entiy.User;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class UserDao {
    //登陆
     public User login(User loginUser) {
         Connection connection = null;
         PreparedStatement ps = null;
         ResultSet rs = null;
         User user = null;
         try {
             String sql = "select * from usermessage where username=? and password=?";
             connection = DBUtil.getConnection();
             ps = connection.prepareStatement(sql);
             ps.setString(1,loginUser.getUsername());
             ps.setString(2,loginUser.getPassword());
             rs = ps.executeQuery();

             if(rs.next()) {
                 user = new User();
                 user.setId(rs.getInt("id"));
                 user.setName(rs.getString("name"));
                 user.setUsername(rs.getString("username"));
                 user.setPassword(rs.getString("password"));
                 user.setAddress(rs.getString("address"));
                 user.setAge(rs.getInt("age"));
                 user.setGender(rs.getString("gender"));
                 user.setQq(rs.getString("qq"));
                 user.setEmail(rs.getString("email"));
             }

         } catch (SQLException e) {
            e.printStackTrace();
         }finally {
             DBUtil.close(connection, ps, rs);
         }
         return user;
     }

    //添加用户
    public int add(User user) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "insert into usermessage(name, username, password, gender, age, address, qq, email) values (?,?,?,?,?,?,?,?)";
            connection = DBUtil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1,user.getName());
            ps.setString(2,user.getUsername());
            ps.setString(3,user.getPassword());
            ps.setString(4,user.getGender());
            ps.setInt(5,user.getAge());
            ps.setString(6,user.getAddress());
            ps.setString(7,user.getQq());
            ps.setString(8,user.getEmail());

            int ret = ps.executeUpdate();
            return ret;


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,ps,rs);
        }
        return 0;

    }

    //通过ID删
    public int delete(int id) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql ="delete from usermessage where  id=?";
            connection = DBUtil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1,id);

            int ret = ps.executeUpdate();
            return ret;
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,ps,rs);
        }
        return 0;
    }

    //通过ID查
    public User find(int id) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;
        try {
            String sql ="select * from usermessage where  id=?";
            connection = DBUtil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            if(rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setAddress(rs.getString("address"));
                user.setAge(rs.getInt("age"));
                user.setGender(rs.getString("gender"));
                user.setQq(rs.getString("qq"));
                user.setEmail(rs.getString("email"));
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,ps,rs);
        }
        return user;
    }

    public int update(User upUser) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql ="update usermessage set gender=?,age=?,address=?,qq=?,email=? where id=?";
            connection = DBUtil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1,upUser.getGender());
            ps.setInt(2,upUser.getAge());
            ps.setString(3,upUser.getAddress());
            ps.setString(4,upUser.getQq());
            ps.setString(5,upUser.getEmail());
            ps.setInt(6,upUser.getId());
            int ret = ps.executeUpdate();
            return ret;

        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,ps,rs);
        }
        return 0;
    }

    public List<User> findByPage(int start, int rows, Map<String, String[]> map) {
        List<User> userList = new LinkedList<>();

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        //name=? and address=? and email=? limit ?,?
        String sql = "select * from usermessage where 1=1";
        StringBuffer sb = new StringBuffer(sql);
        Set<String> keySet = map.keySet();
        List<Object> list = new ArrayList<>();
        for (String key : keySet) {
            String value = map.get(key)[0];
            if(value != null && !"".equals(value)) {
                sb.append(" and ").append(key).append(" like ? ");
                list.add("%"+value+"%");
            }
        }
        sb.append(" limit ?, ? ");
        list.add(start);
        list.add(rows);

        System.out.println("sql" + sb);
        System.out.println("list" + list);

        try {
            connection = DBUtil.getConnection();
            ps = connection.prepareStatement(sb.toString());
            setValues(ps,list.toArray());
            rs = ps.executeQuery();

            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setAddress(rs.getString("address"));
                user.setAge(rs.getInt("age"));
                user.setGender(rs.getString("gender"));
                user.setQq(rs.getString("qq"));
                user.setEmail(rs.getString("email"));
                userList.add(user);

            }

        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,ps,rs);
        }
        return userList;
    }

    private static void setValues(PreparedStatement ps,Object[] arrays) throws SQLException {
        for (int i = 0; i < arrays.length; i++) {
            ps.setObject(i + 1, arrays[i]);
        }
    }

    public int findAllRecord(Map<String, String []> map) {
         int count = 0;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select count(*) from usermessage where 1=1";
        StringBuffer sb = new StringBuffer(sql);
        Set<String> keySet = map.keySet();
        List<Object> list = new ArrayList<>();
        for (String key : keySet) {
            String value = map.get(key)[0];
            if(value != null && !"".equals(value)) {
                sb.append(" and ").append(key).append(" like ? ");
                list.add("%"+value+"%");
            }
        }
        try {
            connection = DBUtil.getConnection();
            ps = connection.prepareStatement(sb.toString());
            setValues(ps,list.toArray());
            rs = ps.executeQuery();

            if(rs.next()) {
                count = rs.getInt(1);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,ps,rs);
        }
        return count;
    }

    /*public static void main(String[] args) {
         Map<String, String[]> map = new HashMap<>();
         String[] names = {""};
         map.put("name", names);
         String[] address = {""};
         map.put("address", address);
        String[] emails = {""};
        map.put("emails", emails);
         List<User> userList = findByPage(2,5,map);
         for (User user : userList) {
             System.out.println(user);
         }
        /*User user = new User();
        user.setId(4);
        user.setGender("女");
        user.setQq("123564");
        user.setAddress("本地");
        user.setEmail("123@q");
        user.setAge(10);
        int ret = update(user);
        if(ret == 0) {
            System.out.println("fail");
        }else {
            System.out.println("success");
        }
            System.out.println(user);*/


        /*if (login(user) == null) {
            System.out.println("登录失败");
        }else {
            System.out.println("登录成功");
        }*/
        /*int ret = delete(8);
        if(ret == 0) {
            System.out.println("delete fail");
        }else {
            System.out.println("delete success");
        }*/
        /*user.setName("张小飞");
        user.setUsername("忘了爱");
        user.setPassword("123");
        user.setGender("女");
        user.setQq("123564");
        user.setAddress("本地");
        user.setEmail("123@q");
        user.setAge(10);
        int ret = add(user);
        if(ret == 0) {
            System.out.println("fail");
        }else {
            System.out.println("success");
        }*/
    /*}*/
}
