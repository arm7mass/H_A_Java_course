package mythread;

public class MyThread {

    public static void main(String[] args) {
        Hello1 h1 = new Hello1();
        Hello2 h2 = new Hello2();
        new Thread(h1).start();
        new Thread(h2).start();

    }

}
