//import com.mysql.jdbc.Driver;
import java.sql.*;
public class Go {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.注册driver
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
       //cmd mysql - uroot -p<数据库的密码>
        String url = "jdbc:mysql://127.0.0.1:3306/java20_20191218?useSSL=false";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(
                url,
                username,
                password
        );
        System.out.println(connection);
        //3.获取语句Statement
        Statement statement = connection.createStatement();
        //4.执行一条SELECT DATABASE()
        String sql = "SELECT DATABASE()";
        ResultSet resultSet= statement.executeQuery(sql);
        //5.事先知道结果只有一行+一列
        resultSet.next();//调一次next 才到第一行
        String name = resultSet.getString(1);//第一列是从1开始的
        System.out.println(name);
        //-3关闭结果集(resultSet)
        resultSet.close();
        sql = "SELECT id, username FROM  users ORDER BY id";
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String user = resultSet.getString(2);
            System.out.println(id + ", " + user);
        }
        resultSet.close();
        //-2关闭语句
        statement.close();
        //-1最后一步 关闭连接
        connection.close();
    }
}
