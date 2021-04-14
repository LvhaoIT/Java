package 线程;

public class Test {
    public static void main(String[] args) {
        //通过继承Thread来开启线程
        Thread t = new TestThread();
        t.start();//开启线程
        System.out.println("============================");
        System.out.println("============================");
        System.out.println("============================");

        Runnable t0 = new TestRunnable();

//        Thread t1 = new Thread(new TestRunnable());//通过Runnable来实现
//        t1.start();

        Thread t1 = new Thread(t0, "t-1");//通过Runnable来实现,运行t0线程
        t1.start();

        Thread t2 = new Thread(t0, "t-2");//通过Runnable来实现,该线程命名为t-2
        t2.start();
    }
}
