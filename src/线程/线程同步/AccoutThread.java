package �߳�.�߳�ͬ��;

public class AccoutThread extends Thread {

    private Account account;//�˻���

    public AccoutThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        //run����ִ�б�ʾȡ������
        //����ÿ��ȡ��5000
        double money = 5000;

        account.Draw(money);

    }


}
