package ����;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("����.Student"); //��ȡָ����class����
            Class superClass =  clazz.getSuperclass(); //��ȡ����class����
            System.out.println("��ǰ��Ϊ:��"+clazz.getName());
            System.out.println("����Ϊ: "+ superClass.getName());//��ȡ��������

            Class[] interfaces = clazz.getInterfaces();//��ȡ���нӿ�
            for(Class a : interfaces){
                System.out.println("�ӿ�"+a.getName());//��ȡ���Ľӿ�
            }


            //��ȡ��Ĺ��й��췽��
            //Constructor[] cons = clazz.getConstructors(); //��ȡ������й��췽��
            Constructor[] cons = clazz.getDeclaredConstructors(); //��ȡ������Ĺ��췽������������˽��
            for(Constructor b : cons){
                System.out.println("----------------------------------------------");
                //getModifiers()��ȡ���η���1=public 2=private
                System.out.println("���췽������: " + b.getName() + "���η�Ϊ:" + (b.getModifiers()==1?"public":"private") );
                //��ȡ��������

                Class[] per = b.getParameterTypes();//getParameterTypes��ȡb�����Ĳ�����
                for(Class a : per){
                    System.out.println("  " + a.getName());
                }
                System.out.println("----------------------------------------------");
            }


            //��ȡ���з���
            //Method[] met = clazz.getMethods();//getMethods��ȡ���й��з���
            Method[] met = clazz.getDeclaredMethods();//getDeclaredMethods��ȡ���й��к�˽�з���
            for(Method a:met){
                System.out.println("���������ƣ�" + a.getName());//��ȡ��������
                System.out.println("�����ķ���ֵ���ͣ�" + a.getReturnType());//��ȡ��������ֵ����
                System.out.println("���������η���" +  (a.getModifiers()==1?"public":"private"));//��ȡ�������η�
                Class[] par = a.getParameterTypes();//��ȡ�����Ĳ�������
                for(Class b : par){
                    System.out.println("���������У�" + b.getName());
                }
                System.out.println("================================================");
            }


            //��ȡ����
            Field[] fs = clazz.getFields();//��ȡ��Ĺ�������,���й����������Լ����๫��������
            //Field[] fs = clazz.getDeclaredFields();//��ȡ��Ĺ������Ժ�˽�����ԣ����������������
            for(Field f : fs){
                System.out.println("���Ե����η�: " +(f.getModifiers()==1?"public":"private"));
                System.out.println("���Ե�����: " + f.getType());
                System.out.println("���Ե����ƣ� " + f.getName());
                System.out.println("---------------------------------------------------");
            }

            Package p = clazz.getPackage();
            System.out.println("�����ڵİ���" + p.getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
