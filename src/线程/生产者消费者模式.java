package 线程;

import java.util.ArrayList;
import java.util.List;

public class 生产者消费者模式 {
    public static void main(String[] args) {
        //创建一个仓库对象
        List list = new ArrayList();
        //创建两个线程对象
        Thread t1 = new Thread(new Producer(list), "生产者线程");
        Thread t2 = new Thread(new Consumer(list), "消费者线程");

        //启动线程
        t1.start();
        t2.start();


    }
}

//生产线程
class Producer implements Runnable {
    List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (list) {
                //用synchroized对list上锁
                if (list.size() > 0) {
                    //仓库已满，需要消费
                    try {
                        list.wait();//释放list上的锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    //此时需要生产
                    list.add(new Object());
                    System.out.println(Thread.currentThread().getName() + "--->" + list.get(0));
                    list.notify();
                }

            }
        }
        

    }
}


//消费线程
class Consumer implements Runnable {
    List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (list) {
                //用synchroized对list上锁
                if (list.size() == 0) {
                    //仓库已空，需要生产
                    try {
                        list.wait();//释放list上的锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    //此时需要消费
                    System.out.println(Thread.currentThread().getName() + "--->" + list.get(0));
                    list.remove(0);
                    list.notify();

                }

            }
        }

    }
}