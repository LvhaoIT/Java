package Exception;
//�Զ����쳣
public class MyException extends Exception{
    String message;//�쳣����
    //���췽��
    public MyException(String ErrorMessage){
        this.message = ErrorMessage;
    }
    public String getMessage(){   //����getMessage()����
        return message;
    }

}
