package �߳�;

public class TestThread extends Thread {
    @Override
    public void run() {
        System.out.println("���߳����еĴ���");
        for (int i = 0; i < 5; i++) {
            System.out.println("���̣߳�" + i);
        }
    }
}
