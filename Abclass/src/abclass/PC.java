package abclass;

public class PC extends com {

    @Override
    public void run() {
        System.out.println("this is My run ");
    }

    @Override
    public void run(String PCName) {
        System.out.println("This My " + PCName + "is running ");
    }

    @Override
    public void stop() {
        System.out.println("This is to Stop  my computer ");
    }

}
