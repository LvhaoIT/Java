package �߳�;

public class Test1 {
    public static void main(String[] args) {
        TestRun run0 = new TestRun();
        TestRun run1 = new TestRun();//��̬��ʵ����ʵ����

        Thread t0 = new Thread(run0);//�����߳�

        Thread t1 = new Thread(run1, "t-1");
        t0.setName("t-0");//�޸�t0�߳�����
        t0.setPriority(5);//�޸����ȼ�Ϊ1
        t1.setPriority(5);
        System.out.println("t0�����ȼ�Ϊ:" + t0.getPriority());
        System.out.println(t0.getName());
        System.out.println(t1.getName());
        System.out.println("t0�Ƿ��" + t0.isAlive());

        t0.start();
        System.out.println("t0�Ƿ��" + t0.isAlive());
        t1.start();
        try {
            t0.join();//����t0����
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("t0�Ƿ��" + t0.isAlive());
        t0.stop();//
        System.out.println("t0�Ƿ��" + t0.isAlive());
        System.out.println("============================");
        System.out.println("============================");
        System.out.println("============================");

    }
}

class TestRun implements Runnable {
    int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Thread.yield();
            count++;
            System.out.println(Thread.currentThread().getName() + "���̣߳�" + count);
        }
    }
}