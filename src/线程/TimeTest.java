package �߳�;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeTest {
    public static void main(String[] args) throws Exception {

        //������ʱ������
        Timer timer = new Timer();
        //Timer timer = new Timer(true); //�ػ��̵߳ķ�ʽ

        //ָ����ʱ����
        //timer.schedule(��ʱ���񣬵�һ��ִ��ʱ�䣬������ִ��һ��);
        //��ȡʱ��
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = sdf.parse("2021-04-18 13:44:00");


        timer.schedule(new LogTimerTask(), firstTime, 1000 * 10);
    }
}


//��дһ����ʱ������
//��������һ����¼��־�Ķ�ʱ����
class LogTimerTask extends TimerTask {

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = sdf.format(new Date());
        System.out.println(strTime + " :�ɹ������һ�����ݱ���");
    }
}