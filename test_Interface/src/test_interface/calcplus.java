package test_interface;

public class calcplus implements calc1 {

    @Override
    public int add(int num1, int num2) {
        System.out.println("This Calc Plus");
        return num1 + num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1 - num2;

    }

    @Override
    public int multi(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int div(int num1, int num2) {
        return num1 / num2;
    }

    @Override
    public int mod() {
        return 0;
    }

    @Override
    public void test() {
    }

}
