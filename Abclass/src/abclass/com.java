package abclass;

public abstract class com {

    public String RamInfo;
    public final String name = "this is my basic computer ";

    public void stop() {
        System.out.println("This is to Stop my computer ");
    }

    abstract public void run();

    abstract public void run(String PCName);

}
