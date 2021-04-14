package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        ITestDemo test = new TestDemo();//利用接口类型去接收一个实现类的类型，这样叫向上转型，java多态
        /**
         * 注意：如果一个对象想要通过Proxy.newProxyInstance方法被代理，
         * 那么这个对象的类一定要有相应的接口
         * 就像本类中的ITestDemo接口和实现类TestDemoImpl
         */
        test.test1();
        test.test2();
        System.out.println("==============================");


        /**
         * 使用代理类在前与后各加一个流程
         */
        InvocationHandler handler = new ProxyDemo(test);//多态，将要代理的test传入进去，这时候handler变成了代理对线的
        /**
         * Proxy.newProxyInstance有三个参数
         * 1是你当前代理类的类加载器,classLoader
         * 2被代理对象的接口
         * 3代理的对象
         * 返回值即成功被代理后的对象
         * 因为返回值为一个obj类型，所以必须要用接口进行强转
         */
        ITestDemo t = (ITestDemo) Proxy.newProxyInstance(handler.getClass().getClassLoader(), test.getClass().getInterfaces(), handler);
        t.test1();
        System.out.println("=========================================");
        t.test2();


    }
}
