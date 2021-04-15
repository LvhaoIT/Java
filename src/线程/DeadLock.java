package Ïß³Ì;

public class DeadLock {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        Thread t0 = new MyThread1(obj1, obj2);
        Thread t1 = new MyThread2(obj1, obj2);
        t0.start();
        t1.start();
    }
}

class MyThread1 extends Thread {
    Object o1;
    Object o2;

    public MyThread1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public void run() {
        synchronized (o1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2) {

            }
        }
    }
}

class MyThread2 extends Thread {
    Object o1;
    Object o2;

    public MyThread2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public void run() {
        synchronized (o2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1) {

            }
        }
    }
}