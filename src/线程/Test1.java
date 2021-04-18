package 线程;

public class Test1 {
    public static void main(String[] args) {
        TestRun run0 = new TestRun();
        TestRun run1 = new TestRun();//多态，实现类实例化

        Thread t0 = new Thread(run0);//定义线程

        Thread t1 = new Thread(run1, "t-1");
        t0.setName("t-0");//修改t0线程名称
        t0.setPriority(5);//修改优先级为1
        t1.setPriority(5);
        System.out.println("t0的优先级为:" + t0.getPriority());
        System.out.println(t0.getName());
        System.out.println(t1.getName());
        System.out.println("t0是否存活：" + t0.isAlive());

        t0.start();
        System.out.println("t0是否存活：" + t0.isAlive());
        t1.start();
        try {
            t0.join();//阻塞t0进程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("t0是否存活：" + t0.isAlive());
        t0.stop();//
        System.out.println("t0是否存活：" + t0.isAlive());
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
            System.out.println(Thread.currentThread().getName() + "多线程：" + count);
        }
    }
}