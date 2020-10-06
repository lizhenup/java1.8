import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;


public class Go {
    private  static  final String url = "jdbc:mysql://127.0.0.1:3306/java20_0211?useSSL=false&characterEncoding=utf8";
    private  static  final String mysqlUsername = "root";
    private  static  final String mysqlPassword = "";
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.jdbc.Driver");
        /*MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setServerName("127.0.0.1");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("");
        mysqlDataSource.setDatabaseName("java20_0211");
        mysqlDataSource.setUseSSL(false);
        mysqlDataSource.setCharacterEncoding("utf8");
        DataSource dataSource = mysqlDataSource;*/
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    register();
                    break;
                case 2 :
                    login();
                    break;
                case 3:
                    write();
            }
        }
    }

    private static void write() {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
    }

    private static void login() throws SQLException {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setServerName("127.0.0.1");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("");
        mysqlDataSource.setDatabaseName("java20_0211");
        mysqlDataSource.setUseSSL(false);
        mysqlDataSource.setCharacterEncoding("utf8");
        DataSource dataSource = mysqlDataSource;
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        try(Connection con = dataSource.getConnection()) {
            String sql = "select id, username from users where username = ? and password = ?";
            try(PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setString(1, username);
                statement.setString(2, password);
                com.mysql.jdbc.PreparedStatement mysqlStatement = (com.mysql.jdbc.PreparedStatement) statement;
                System.out.println(mysqlStatement.asSql());
                try(ResultSet resultSet = statement.executeQuery()) {
                    if(!resultSet.next()) {
                        System.out.println("登录失败");
                    } else {
                        int id = resultSet.getInt("id");
                        String usernameInTable = resultSet.getString("username");
                        System.out.println("登录成功："+ id +"," + usernameInTable);
                    }
                }
            }
        }
    }

    private static void register() throws SQLException {
        //String sql = "insert into users (username, password) values (?, ？) ";
        Scanner scanner = new Scanner(System.in);
        String  username = scanner.nextLine();
        String  password = scanner.nextLine();
        try(Connection con = DriverManager.getConnection(url,mysqlUsername,mysqlPassword)) {
            try (Statement statement = con.createStatement()) {
                String sql = String.format(
                        "insert into users (username, password) values ('%s', '%s')",
                        username, password
                );
                System.out.println(sql);
                statement.executeUpdate(sql);
            }
            System.out.println("用户注册成功");
        }
    }

    private static void menu() {
        System.out.println("=====================");
        System.out.println("1.用户注册");
        System.out.println("2.用户登陆");
        System.out.println("3.发表文章");
        System.out.println("4.文章列表页");
        System.out.println("5.文章详情页");
        System.out.println("=====================");
    }
}
