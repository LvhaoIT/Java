package ����;

//import com.sun.org.apache.xpath.internal.objects.XObject;

import java.lang.reflect.Constructor;

public class ���䴴�� {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("����.Student");
            //���÷����������������
            Object obj = clazz.newInstance();//�൱�ڵ���Student����޲ι��еĹ��췽��
            Student stu = (Student) obj;//����ǿת

            Constructor c = clazz.getConstructor(String.class);//ָ����ȡһ����������ΪString���͵Ĺ��й��췽��
            Student stu1 = (Student) c.newInstance("����Сѧ");//newInstanceʵ���������൱�ڵ��ö�Ӧ���췽��
            System.out.println(stu1.school);

            Constructor d = clazz.getDeclaredConstructor(String.class, Boolean.class, String.class);//��ȡ���������Ĺ��췽��
            d.setAccessible(true);//�����װ
            Student stu2 = (Student) d.newInstance("��˼��", false, "�����׶�԰");
            stu2.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
