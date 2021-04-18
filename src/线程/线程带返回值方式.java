package 线程;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class 线程带返回值方式 {
    public static void main(String[] args) throws Exception {
        //第一步 创建一个未来任务类对象
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                return 1;
            }
        });

        //第二步 创建Thred线程
        Thread t = new Thread(task);

        //第三步 启动线程
        t.start();

        //第四步 获取线程返回值
        Object obj = task.get();//这个获取返回值，必须要等run方法结束，所以有可能造成主程序的堵塞

    }
}
