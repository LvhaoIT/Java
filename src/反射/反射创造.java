package 反射;

//import com.sun.org.apache.xpath.internal.objects.XObject;

import java.lang.reflect.Constructor;

public class 反射创造 {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("反射.Student");
            //利用反射机制来建立对象
            Object obj = clazz.newInstance();//相当于调用Student类的无参公有的构造方法
            Student stu = (Student) obj;//类型强转

            Constructor c = clazz.getConstructor(String.class);//指定获取一个参数并且为String类型的公有构造方法
            Student stu1 = (Student) c.newInstance("阳光小学");//newInstance实例化对象，相当于调用对应构造方法
            System.out.println(stu1.school);

            Constructor d = clazz.getDeclaredConstructor(String.class, Boolean.class, String.class);//获取三个参数的构造方法
            d.setAccessible(true);//解除封装
            Student stu2 = (Student) d.newInstance("华思烨", false, "阳光幼儿园");
            stu2.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
