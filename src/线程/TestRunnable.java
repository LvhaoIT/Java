package �߳�;

public class TestRunnable implements Runnable {
    int count = 0;

    @Override
    public void run() {
        //Thread.currentThread().getName()��ȡ��ǰ�̵߳�����
        System.out.println(Thread.currentThread().getName() + "Runnable���̶߳��߳����еĴ���");
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println("Runnable���̣߳�" + count);
        }
    }
}
