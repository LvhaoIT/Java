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
            if (i % 2 == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
