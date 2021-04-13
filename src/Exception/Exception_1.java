package Exception;

public class Exception_1 {
    public static void main(String[] args) {
        //会报ArithmeticException错误
//        System.out.println(12/0);
        try {//try监控区域
            System.out.println(12/0);
        } catch (ArithmeticException e) {
            System.out.println("出现了除数为0的情况，无法运行");
        } catch (Exception e) { //出现Exception异常则执行下面的程序框中程序
            e.printStackTrace();//打印错误栈
        } finally { //无论是否出现都会执行
            System.out.println("执行了finally里的程序");
        }

        System.out.println("========================================");

        //利用throws
        try {//try监控区域
            System.out.println(new Exception_1().Div(12,0));
        } catch (MyException e) {
            System.out.println("出现了除数为0的情况，无法运行");
        } catch (Exception e) { //出现Exception异常则执行下面的程序框中程序
            System.out.println("打印了错误栈");
            e.printStackTrace();//打印错误栈
        }

    }

    public int Div (int a , int b) throws MyException{
        if(b==0){
            throw new MyException("除法除数不能为0！(自定义异常)");
        }
        return 0;
    }
}
