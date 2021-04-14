package 泛型;

import java.security.PublicKey;

//泛型方法
public class Test3 {
    //泛型方法1 无返回值
    public <T> void fun1(T t) {

    }

    //泛型方法2 有返回值
    public <T> T fun2(T t) {

        return t;
    }
}
