package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */
public class ProxyDemo implements InvocationHandler {
    Object obj;

    public ProxyDemo(Object obj) {//构造
        this.obj = obj;
    }

    @Override
    /**
     *  public Object invoke(Object proxy, Method method, Object[] args)
     *  这个方法一共三个参数
     *
     *  method是方法对象
     *  args是方法参数
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理方法： " + method.getName() + "方法开始执行");
        Object result = method.invoke(this.obj, args);//invoke中第一个obj是这个对象类，第二个是方法参数，method传过来的时候已经知道是什么方法,这边已经调用对应方法
        System.out.println("代理方法： " + method.getName() + "方法执行完毕");
        return result;
    }
}
