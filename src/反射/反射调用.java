package ����;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ������� {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("����.Student");
            //���������ķ���
            //����һ����������
            Constructor con = clazz.getConstructor();//��ȡ�޲ι���
            Object obj2 = con.newInstance();//ʹ���޲ι�����ʵ��������
            Method m = clazz.getMethod("fun1", String.class);//�õ�����fun������Ϊstring����
            m.invoke(obj2,"");//���÷���

            //����һ��˽�з���
            Constructor co = clazz.getDeclaredConstructor();//��ȡ�޲ι���
            Object obj3 = co.newInstance();//ʹ���޲ι�����ʵ��������
            Method m1 = clazz.getDeclaredMethod("Prifun", String.class);//�õ�˽�з������м�һ����Declaredȫ��
            m1.setAccessible(true);//�����װ
            m1.invoke(obj3,"��");

            Constructor co2 = clazz.getConstructor(String.class);
            Object obj4 = co2.newInstance("��̫��Сѧ");
            //�����з���ֵ�ķ���
            Method m2 = clazz.getMethod("getSchool");
            String school = (String) m2.invoke(obj4);
            System.out.println(school);//�ϴ���ȡ obj4


            //������������
            //Class clazz = Class.forName("����.Student");//���䴴��һ��class����
            Constructor obj = clazz.getConstructor();//��ȡһ���޲ι��췽��
            Student stu = (Student) obj.newInstance();//ʵ����
            Field f = clazz.getField("school");//��ȡstu�����school���� ,f���
            f.set(stu,"С�컨�׶�԰");//��ֵ����stu�����У�������f����ȡ������
            String str = (String)f.get(stu);//���õ���ֵ����ǿת
            System.out.println(str);

            //�����˽������
            f = clazz.getDeclaredField("num");//��ȡnum����
            f.setAccessible(true);//���˽�з�װ
            f.set(stu,123);//����ֵ
            int num =(int)f.get(stu);
            System.out.println(num);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
