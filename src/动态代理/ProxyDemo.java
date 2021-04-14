package ��̬����;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��̬������
 */
public class ProxyDemo implements InvocationHandler {
    Object obj;

    public ProxyDemo(Object obj) {//����
        this.obj = obj;
    }

    @Override
    /**
     *  public Object invoke(Object proxy, Method method, Object[] args)
     *  �������һ����������
     *
     *  method�Ƿ�������
     *  args�Ƿ�������
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("�������� " + method.getName() + "������ʼִ��");
        Object result = method.invoke(this.obj, args);//invoke�е�һ��obj����������࣬�ڶ����Ƿ���������method��������ʱ���Ѿ�֪����ʲô����,����Ѿ����ö�Ӧ����
        System.out.println("�������� " + method.getName() + "����ִ�����");
        return result;
    }
}
