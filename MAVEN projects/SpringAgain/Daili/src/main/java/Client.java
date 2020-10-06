

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/31 20:15
 * @description：
 * @modified By：
 * @version: $
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService  = new UserServiceImpl();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //设置代理对象
        pih.setObject(userService);

        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.ZuFang();
        proxy.UserSe();

    }
}
