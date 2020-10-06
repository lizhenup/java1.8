import java.util.*;
import java.sql.*;
public class To {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");//注册驱动
        //获取一条MySQL的网络连接对象（TCP连接）
        //配置连接URL
        String url = "jdbc:mysql://127.0.0.1:3306/java20_0210?useSSL=false&characterEncoding=utf8";
        String user = "root";//连接mysql的用户名
        String password = "";//连接mysql的密码
        Connection connection = DriverManager.getConnection(
                url,user,password
        );
        //DriverManager是驱动的管理类
        //1）通过重载的getConnection()方法获取数据库连接，较为方便
        //2）通过DriverManager可以注册并同时管理多个驱动程序：
        // 如果注册了多个数据库连接，则调用getConnection()方法时传入不同参数，
        // 返回不同的数据库连接
        /*
        //Statement 对象用于将 SQL 语句发送到数据库中。
        // Statement 对象将由 Java 垃圾收集程序自动关闭。而作为一种好的编程风格，
        // 应在不需要 Statement对象时显式地关闭它们。这将立即释放 DBMS 资源，
        // 有助于避免潜在的内存问题。
        Statement statement = connection.createStatement();
        String sql = "delete from users where id = 1";
        statement.executeUpdate(sql);
        statement.close();
        Statement statement1 = connection.createStatement();
        String sql1 = "delete from users where id = 2";
        statement1.executeUpdate(sql1);
        statement1.close();
        Statement statement2 = connection.createStatement();
        String sql2 = "delete from users where id = 3";
        statement2.executeUpdate(sql2);
        statement2.close();
        */
        /*
        Statement statement = connection.createStatement();
        String sql = "insert into Users (id,name,age,higth) values (1,'蔡徐坤',19,178),(2,'唐国强',66,186),(3,'范冰冰',40,166)";
        statement.executeUpdate(sql);
        statement.close();
        */
        /*
        Statement statement = connection.createStatement();
        String sql = "update Users SET higth = 230 where id = 3";
        statement.executeUpdate(sql);
        statement.close();
        Statement statement1 = connection.createStatement();
        String sql1 = "update Users SET higth = higth * 2";
        statement1.executeUpdate(sql1);
        statement1.close();
        */
        /*
        Statement statement = connection.createStatement();
        String sql = "delete from Users where name = '蔡徐坤'";
        statement.executeUpdate(sql);
        statement.close();
        */
        /*Statement statement = connection.createStatement();
        String sql = "insert into Users (id,name,age,higth) values (4,'蔡徐坤',19,178)";
        statement.executeUpdate(sql);
        statement.close();*/
        Statement statement1 = connection.createStatement();
        String sql1 = "select id,name,age,higth from Users";
        ResultSet resultSet = statement1.executeQuery(sql1);
        List<String> nameList = new ArrayList<>();
        List<Integer> ageList = new ArrayList<>();
        List<Integer> higthList = new ArrayList<>();
        while(resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            int higth = resultSet.getInt("higth");
            nameList.add(name);
            ageList.add(age);
            higthList.add(higth);
            System.out.println(id + "," + name + ',' + age + ',' + higth);
        }
        resultSet.close();
        statement1.close();
    }
}
