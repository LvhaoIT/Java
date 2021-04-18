package 线程.线程同步;

public class AccoutThread extends Thread {

    private Account account;//账户类

    public AccoutThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        //run方法执行表示取出操作
        //假设每次取款5000
        double money = 5000;

        account.Draw(money);

    }


}
