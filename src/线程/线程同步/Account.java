package �߳�.�߳�ͬ��;

//�˻���

public class Account {
    private String actno;//�˻�

    private double balance;//���

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

    //ȡ���synchronized�����ͬ��
//    public void Draw(double money) {
//        synchronized (this) {
//            try {
//                Thread.sleep(1000);//����˯��1s��ģ�������ӳ�
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            if (money > getBalance()) {
//                System.out.println("���㣬��ʣ��" + getBalance());
//            } else {
//                setBalance(getBalance() - money);
//            }
//            System.out.println("�߳�����" + Thread.currentThread().getName() + "  ����ȡ����Ϊ��" + money + "��ǰ���Ϊ: " + getBalance());
//
//
//        }
//    }

    /*Synchronize������ʵ��������
     * ���ַ�ʽһ��������this����������������
     * �������ַ�ʽû���������Բ����
     * �����ڷ����ϱ�ʾͬ�����������壨�п��������˳����ִ�з�Χ�����³���ִ��Ч�ʽ��ͣ�
     *
     * �ŵ㣺������Ӿ���
     * �������������this��������Ҫͬ���Ĵ����������������壬
     * �Ƽ�ʹ�����ַ���
     * */
    public synchronized void Draw(double money) {
        try {
            Thread.sleep(1000);//����˯��1s��ģ�������ӳ�
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (money > getBalance()) {
            System.out.println("���㣬��ʣ��" + getBalance());
        } else {
            setBalance(getBalance() - money);
        }
        System.out.println("�߳�����" + Thread.currentThread().getName() + "  ����ȡ����Ϊ��" + money + "��ǰ���Ϊ: " + getBalance());
    }


}
