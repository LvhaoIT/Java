package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class 反射调用 {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("反射.Student");
            //反射调用类的方法
            //调用一个公共方法
            Constructor con = clazz.getConstructor();//获取无参构造
            Object obj2 = con.newInstance();//使用无参构造来实例化对象
            Method m = clazz.getMethod("fun1", String.class);//得到方法fun，参数为string类型
            m.invoke(obj2,"");//调用方法

            //调用一个私有方法
            Constructor co = clazz.getDeclaredConstructor();//获取无参构造
            Object obj3 = co.newInstance();//使用无参构造来实例化对象
            Method m1 = clazz.getDeclaredMethod("Prifun", String.class);//得到私有方法，中间一定是Declared全部
            m1.setAccessible(true);//解除封装
            m1.invoke(obj3,"猪");

            Constructor co2 = clazz.getConstructor(String.class);
            Object obj4 = co2.newInstance("红太阳小学");
            //调用有返回值的方法
            Method m2 = clazz.getMethod("getSchool");
            String school = (String) m2.invoke(obj4);
            System.out.println(school);//上存下取 obj4


            //调用类中属性
            //Class clazz = Class.forName("反射.Student");//反射创建一个class对象
            Constructor obj = clazz.getConstructor();//获取一个无参构造方法
            Student stu = (Student) obj.newInstance();//实例化
            Field f = clazz.getField("school");//获取stu对象的school属性 ,f存放
            f.set(stu,"小红花幼儿园");//将值传入stu对象中，属性是f所获取的属性
            String str = (String)f.get(stu);//将得到的值进行强转
            System.out.println(str);

            //如果是私有属性
            f = clazz.getDeclaredField("num");//获取num属性
            f.setAccessible(true);//解除私有封装
            f.set(stu,123);//传入值
            int num =(int)f.get(stu);
            System.out.println(num);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
