package �߳�;

public class �߳��ػ� {
    public static void main(String[] args) {
        Thread t0 = new Thread(new MyThread01(), "t-0");
        t0.setDaemon(true);//����t0Ϊ�ػ��߳�
        t0.start();
        for (int i = 0; i < 3; i++) {
            System.out.println("main" + "-->" + (i));
        }
    }
}

class MyThread01 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(Thread.currentThread().getName() + "-->" + (++i));
        }
    }
}