package �߳�.�߳�ͬ��;

public class Test {
    public static void main(String[] args) {
        Account a1 = new Account("С��", 10000);
        //AccoutThread ac=new AccoutThread(a1);

        //t0 t1����ͬһ������a1
        Thread t0 = new AccoutThread(a1);
        Thread t1 = new AccoutThread(a1);
        t0.setName("t0");
        t1.setName("t1");

        //���������߳�
        t0.start();
        t1.start();

    }
}
