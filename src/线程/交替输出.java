package �߳�;

public class ������� {
    public static void main(String[] args) {

        Num x = new Num(1);
        //���������̶߳���
        Thread t1 = new Thread(new Producer1(x), "t1");

        Thread t2 = new Thread(new Consumer1(x), "t2");

        //�����߳�
        t1.start();
        t2.start();


    }
}

class Num {
    private int x;

    public Num(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Consumer1 implements Runnable {

    Num x;

    public Consumer1(Num x) {
        this.x = x;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (x) {
                if (x.getX() % 2 == 1) {
                    try {
                        x.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-->" + x.getX());
                    x.setX(x.getX() + 1);
                    x.notify();
                }
            }
        }

    }
}

class Producer1 implements Runnable {

    Num x;

    public Producer1(Num x) {
        this.x = x;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (x) {
                if (x.getX() % 2 == 0) {
                    try {
                        x.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-->" + x.getX());
                    x.setX(x.getX() + 1);
                    x.notify();
                }
            }
        }

    }
}