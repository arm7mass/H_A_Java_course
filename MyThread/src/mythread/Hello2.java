package mythread;

public class Hello2 implements Runnable {

    @Override
    public void run() {
        for (int x = 0; x < 10; x++) {
            System.out.println("Hello2");
        }
    }

}
