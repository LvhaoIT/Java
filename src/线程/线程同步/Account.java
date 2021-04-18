package 线程.线程同步;

//账户类

public class Account {
    private String actno;//账户

    private double balance;//余额

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    //取款方法synchronized代码块同步
//    public void Draw(double money) {
//        synchronized (this) {
//            try {
//                Thread.sleep(1000);//进程睡眠1s，模拟网络延迟
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            if (money > getBalance()) {
//                System.out.println("余额不足，还剩：" + getBalance());
//            } else {
//                setBalance(getBalance() - money);
//            }
//            System.out.println("线程名：" + Thread.currentThread().getName() + "  本次取款金额为：" + money + "当前余额为: " + getBalance());
//
//
//        }
//    }

    /*Synchronize出现在实例方法上
     * 这种方式一定锁的是this，不能是其他对象
     * 所以这种方式没得挑，所以不灵活
     * 出现在方法上表示同步整个方法体（有可能扩大了程序的执行范围，导致程序执行效率降低）
     *
     * 优点：代码更加精简，
     * 如果共享对象就是this，并且需要同步的代码块就是整个方法体，
     * 推荐使用这种方法
     * */
    public synchronized void Draw(double money) {
        try {
            Thread.sleep(1000);//进程睡眠1s，模拟网络延迟
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (money > getBalance()) {
            System.out.println("余额不足，还剩：" + getBalance());
        } else {
            setBalance(getBalance() - money);
        }
        System.out.println("线程名：" + Thread.currentThread().getName() + "  本次取款金额为：" + money + "当前余额为: " + getBalance());
    }


}
