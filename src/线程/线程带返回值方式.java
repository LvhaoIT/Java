package �߳�;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class �̴߳�����ֵ��ʽ {
    public static void main(String[] args) throws Exception {
        //��һ�� ����һ��δ�����������
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                return 1;
            }
        });

        //�ڶ��� ����Thred�߳�
        Thread t = new Thread(task);

        //������ �����߳�
        t.start();

        //���Ĳ� ��ȡ�̷߳���ֵ
        Object obj = task.get();//�����ȡ����ֵ������Ҫ��run���������������п������������Ķ���

    }
}
