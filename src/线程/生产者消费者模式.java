package �߳�;

import java.util.ArrayList;
import java.util.List;

public class ������������ģʽ {
    public static void main(String[] args) {
        //����һ���ֿ����
        List list = new ArrayList();
        //���������̶߳���
        Thread t1 = new Thread(new Producer(list), "�������߳�");
        Thread t2 = new Thread(new Consumer(list), "�������߳�");

        //�����߳�
        t1.start();
        t2.start();


    }
}

//�����߳�
class Producer implements Runnable {
    List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (list) {
                //��synchroized��list����
                if (list.size() > 0) {
                    //�ֿ���������Ҫ����
                    try {
                        list.wait();//�ͷ�list�ϵ���
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    //��ʱ��Ҫ����
                    list.add(new Object());
                    System.out.println(Thread.currentThread().getName() + "--->" + list.get(0));
                    list.notify();
                }

            }
        }
        

    }
}


//�����߳�
class Consumer implements Runnable {
    List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (list) {
                //��synchroized��list����
                if (list.size() == 0) {
                    //�ֿ��ѿգ���Ҫ����
                    try {
                        list.wait();//�ͷ�list�ϵ���
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    //��ʱ��Ҫ����
                    System.out.println(Thread.currentThread().getName() + "--->" + list.get(0));
                    list.remove(0);
                    list.notify();

                }

            }
        }

    }
}