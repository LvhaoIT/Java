package �߳�;

public class Test {
    public static void main(String[] args) {
        //ͨ���̳�Thread�������߳�
        Thread t = new TestThread();
        t.start();//�����߳�
        System.out.println("============================");
        System.out.println("============================");
        System.out.println("============================");

        Runnable t0 = new TestRunnable();

//        Thread t1 = new Thread(new TestRunnable());//ͨ��Runnable��ʵ��
//        t1.start();

        Thread t1 = new Thread(t0, "t-1");//ͨ��Runnable��ʵ��,����t0�߳�
        t1.start();

        Thread t2 = new Thread(t0, "t-2");//ͨ��Runnable��ʵ��,���߳�����Ϊt-2
        t2.start();
    }
}
