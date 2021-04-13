package 泛型;

public class Test {
    public static void main(String[] args) {
        //泛型类使用
        A<String> a1=new A<String>("我是一个泛型");
        System.out.println(a1.getKey());

        A<Integer> a2=new A<Integer>(5);
        System.out.println(a2.getKey());
        //不同的泛型类之间不可以互相复制

    }
}

class A<T>{
    private T key;
    public A(){

    }
    public A(T key) {
        this.key=key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}