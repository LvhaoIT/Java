package Exception;

public class Exception_1 {
    public static void main(String[] args) {
        //�ᱨArithmeticException����
//        System.out.println(12/0);
        try {//try�������
            System.out.println(12/0);
        } catch (ArithmeticException e) {
            System.out.println("�����˳���Ϊ0��������޷�����");
        } catch (Exception e) { //����Exception�쳣��ִ������ĳ�����г���
            e.printStackTrace();//��ӡ����ջ
        } finally { //�����Ƿ���ֶ���ִ��
            System.out.println("ִ����finally��ĳ���");
        }

        System.out.println("========================================");

        //����throws
        try {//try�������
            System.out.println(new Exception_1().Div(12,0));
        } catch (MyException e) {
            System.out.println("�����˳���Ϊ0��������޷�����");
        } catch (Exception e) { //����Exception�쳣��ִ������ĳ�����г���
            System.out.println("��ӡ�˴���ջ");
            e.printStackTrace();//��ӡ����ջ
        }

    }

    public int Div (int a , int b) throws MyException{
        if(b==0){
            throw new MyException("������������Ϊ0��(�Զ����쳣)");
        }
        return 0;
    }
}
