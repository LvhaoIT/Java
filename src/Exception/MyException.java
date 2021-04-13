package Exception;
//自定义异常
public class MyException extends Exception{
    String message;//异常性质
    //构造方法
    public MyException(String ErrorMessage){
        this.message = ErrorMessage;
    }
    public String getMessage(){   //覆盖getMessage()方法
        return message;
    }

}
