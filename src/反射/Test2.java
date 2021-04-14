package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) {
        //反射练习
        try {
            //1.创建class类
            Class clazz = Class.forName("反射.Student");
            //2获取构造方法
            Constructor c = clazz.getDeclaredConstructor(String.class, Boolean.class, String.class);//获取三个参数的构造方法
            c.setAccessible(true);//解除封装
            //3.用对应的构造方法进行实例化
            Object stu = c.newInstance("小明", true, "小红花幼儿园");//获取对应生成对象
            stu.toString();//利用变量。的方法调用方法
            //调用方法，利用反射
            Method fun = clazz.getDeclaredMethod("Prifun", String.class);//获取方法
            fun.setAccessible(true);
            fun.invoke(stu, "hh");//使用stu的prifun方法，参数为hh
            //调用其中属性
            Field f = clazz.getDeclaredField("num");
            f.setAccessible(true);//解封对应私有属性
            f.set(stu, 110);//对对应的类的对应属性进行赋值，第一个参数是类变量名，第二个是对应属性值
            int x = (int) f.get(stu);//将值取出来
            System.out.println("stu的私有属性num的值为： " + x);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
