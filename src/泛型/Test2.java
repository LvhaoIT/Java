package 泛型;

public class Test2 {
    public static void main(String[] args) {
        //C的用法
        C <Object> c1 = new C<Object>();
        C <String> c2 = new C<String>();

        //D的用法,不需要指定泛型
        D d1 = new D();
    }
}

//泛型接口
interface B <T>{
    public T test (T t);
}

//第一种情况，实现类未定义,这种情况类后面必须也要加上泛型
class C<T> implements B<T>{

    @Override
    public T test(T t) {
        return t;
    }
}

//第二种，定义时已经指定，则后续使用的地方都会自动变成指定类型
class D<T> implements B<String>{

    @Override
    public String test(String s) {
        return s;
    }
}