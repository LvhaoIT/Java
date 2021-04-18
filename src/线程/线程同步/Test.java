package 线程.线程同步;

public class Test {
    public static void main(String[] args) {
        Account a1 = new Account("小白", 10000);
        //AccoutThread ac=new AccoutThread(a1);

        //t0 t1共享同一个对象a1
        Thread t0 = new AccoutThread(a1);
        Thread t1 = new AccoutThread(a1);
        t0.setName("t0");
        t1.setName("t1");

        //运行两个线程
        t0.start();
        t1.start();

    }
}
