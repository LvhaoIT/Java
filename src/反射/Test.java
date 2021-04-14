package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("反射.Student"); //获取指定的class对象
            Class superClass =  clazz.getSuperclass(); //获取父类class对象
            System.out.println("当前类为:”"+clazz.getName());
            System.out.println("父类为: "+ superClass.getName());//获取父类名称

            Class[] interfaces = clazz.getInterfaces();//获取所有接口
            for(Class a : interfaces){
                System.out.println("接口"+a.getName());//读取他的接口
            }


            //获取类的公有构造方法
            //Constructor[] cons = clazz.getConstructors(); //获取类的所有构造方法
            Constructor[] cons = clazz.getDeclaredConstructors(); //获取所有类的构造方法，包括公有私有
            for(Constructor b : cons){
                System.out.println("----------------------------------------------");
                //getModifiers()获取修饰符，1=public 2=private
                System.out.println("构造方法名称: " + b.getName() + "修饰符为:" + (b.getModifiers()==1?"public":"private") );
                //获取参数类型

                Class[] per = b.getParameterTypes();//getParameterTypes获取b方法的参数·
                for(Class a : per){
                    System.out.println("  " + a.getName());
                }
                System.out.println("----------------------------------------------");
            }


            //获取类中方法
            //Method[] met = clazz.getMethods();//getMethods获取类中公有方法
            Method[] met = clazz.getDeclaredMethods();//getDeclaredMethods获取类中公有和私有方法
            for(Method a:met){
                System.out.println("方法的名称：" + a.getName());//获取方法名称
                System.out.println("方法的返回值类型：" + a.getReturnType());//获取方法返回值类型
                System.out.println("方法的修饰符：" +  (a.getModifiers()==1?"public":"private"));//获取方法修饰符
                Class[] par = a.getParameterTypes();//获取方法的参数类型
                for(Class b : par){
                    System.out.println("参数类型有：" + b.getName());
                }
                System.out.println("================================================");
            }


            //获取属性
            Field[] fs = clazz.getFields();//获取类的公有属性,所有公开的属性以及父类公开的属性
            //Field[] fs = clazz.getDeclaredFields();//获取类的公有属性和私有属性，不包含父类的属性
            for(Field f : fs){
                System.out.println("属性的修饰符: " +(f.getModifiers()==1?"public":"private"));
                System.out.println("属性的类型: " + f.getType());
                System.out.println("属性的名称： " + f.getName());
                System.out.println("---------------------------------------------------");
            }

            Package p = clazz.getPackage();
            System.out.println("类所在的包：" + p.getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
