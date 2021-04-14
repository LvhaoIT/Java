package ��̬����;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        ITestDemo test = new TestDemo();//���ýӿ�����ȥ����һ��ʵ��������ͣ�����������ת�ͣ�java��̬
        /**
         * ע�⣺���һ��������Ҫͨ��Proxy.newProxyInstance����������
         * ��ô����������һ��Ҫ����Ӧ�Ľӿ�
         * �������е�ITestDemo�ӿں�ʵ����TestDemoImpl
         */
        test.test1();
        test.test2();
        System.out.println("==============================");


        /**
         * ʹ�ô�������ǰ������һ������
         */
        InvocationHandler handler = new ProxyDemo(test);//��̬����Ҫ�����test�����ȥ����ʱ��handler����˴�����ߵ�
        /**
         * Proxy.newProxyInstance����������
         * 1���㵱ǰ��������������,classLoader
         * 2���������Ľӿ�
         * 3����Ķ���
         * ����ֵ���ɹ��������Ķ���
         * ��Ϊ����ֵΪһ��obj���ͣ����Ա���Ҫ�ýӿڽ���ǿת
         */
        ITestDemo t = (ITestDemo) Proxy.newProxyInstance(handler.getClass().getClassLoader(), test.getClass().getInterfaces(), handler);
        t.test1();
        System.out.println("=========================================");
        t.test2();


    }
}
