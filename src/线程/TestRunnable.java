package 线程;

public class TestRunnable implements Runnable {
    int count = 0;

    @Override
    public void run() {
        //Thread.currentThread().getName()获取当前线程的名称
        System.out.println(Thread.currentThread().getName() + "Runnable多线程多线程运行的代码");
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println("Runnable多线程：" + count);
        }
    }
}
