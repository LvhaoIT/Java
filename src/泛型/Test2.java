package ����;

public class Test2 {
    public static void main(String[] args) {
        //C���÷�
        C <Object> c1 = new C<Object>();
        C <String> c2 = new C<String>();

        //D���÷�,����Ҫָ������
        D d1 = new D();
    }
}

//���ͽӿ�
interface B <T>{
    public T test (T t);
}

//��һ�������ʵ����δ����,���������������ҲҪ���Ϸ���
class C<T> implements B<T>{

    @Override
    public T test(T t) {
        return t;
    }
}

//�ڶ��֣�����ʱ�Ѿ�ָ���������ʹ�õĵط������Զ����ָ������
class D<T> implements B<String>{

    @Override
    public String test(String s) {
        return s;
    }
}