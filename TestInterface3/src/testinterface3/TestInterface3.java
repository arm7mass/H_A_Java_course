package testinterface3;

public class TestInterface3 {

    public static void GetMethodCount(EmptyInterface c) {
        System.out.println(c.getClass().getDeclaredMethods().length);
    }

    public static void main(String[] args) {
        GetMethodCount(new class1());
        GetMethodCount(new class2());
        GetMethodCount(new class3());

    }

}
