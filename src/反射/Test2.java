package ����;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) {
        //������ϰ
        try {
            //1.����class��
            Class clazz = Class.forName("����.Student");
            //2��ȡ���췽��
            Constructor c = clazz.getDeclaredConstructor(String.class, Boolean.class, String.class);//��ȡ���������Ĺ��췽��
            c.setAccessible(true);//�����װ
            //3.�ö�Ӧ�Ĺ��췽������ʵ����
            Object stu = c.newInstance("С��", true, "С�컨�׶�԰");//��ȡ��Ӧ���ɶ���
            stu.toString();//���ñ������ķ������÷���
            //���÷��������÷���
            Method fun = clazz.getDeclaredMethod("Prifun", String.class);//��ȡ����
            fun.setAccessible(true);
            fun.invoke(stu, "hh");//ʹ��stu��prifun����������Ϊhh
            //������������
            Field f = clazz.getDeclaredField("num");
            f.setAccessible(true);//����Ӧ˽������
            f.set(stu, 110);//�Զ�Ӧ����Ķ�Ӧ���Խ��и�ֵ����һ������������������ڶ����Ƕ�Ӧ����ֵ
            int x = (int) f.get(stu);//��ֵȡ����
            System.out.println("stu��˽������num��ֵΪ�� " + x);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
