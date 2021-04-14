package 动态代理;

public class TestDemo implements ITestDemo {
    @Override
    public void test1() {
        System.out.println("执行test1方法");
    }

    @Override
    public void test2() {
        System.out.println("执行test2方法");
    }
}
