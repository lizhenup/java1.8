import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static com.sun.activation.registries.LogSupport.log;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/31 20:08
 * @description：
 * @modified By：
 * @version: $
 */
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Object object;
    public void setObject(Object object) {
        this.object = object;
    }
    //生成代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                object.getClass().getInterfaces(),this);
    }
    //处理代理类实例，返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object ret = method.invoke(object,args);
        return ret;
    }

    public void log(String msg) {
        System.out.println("执行了"+ msg);
    }
}
