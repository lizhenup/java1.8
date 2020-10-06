
import java.util.ArrayList;
import java.util.List;

public class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private static List<User> userList = new ArrayList<>();
    static {
        userList.add(new User("a1", "a"));
        userList.add(new User("b2", "bb"));
        userList.add(new User("c3", "ccc"));
    }

    public static User login(String username, String password) {
        for (User user : userList) {
            if (user.username.equals(username)
                    && user.password.equals(password)) {
                return user;
            }
        }

        return null;
    }
}
