package ����;

public class Test {
    public static void main(String[] args) {
        //������ʹ��
        A<String> a1=new A<String>("����һ������");
        System.out.println(a1.getKey());

        A<Integer> a2=new A<Integer>(5);
        System.out.println(a2.getKey());
        //��ͬ�ķ�����֮�䲻���Ի��ิ��

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