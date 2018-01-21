package enumexample;

enum FloorType {
    in, out;
}

public enum Floor {
    f1(1, "Abdul1"), f2(2, "Abdu2"), f3(3, "masoud"), f4(4, "abdul4"), f5(5, "abdul5");
    private static Floor[] ENUMS = Floor.values();
    private int num;
    private String name;

    public static Floor of(int floor) {
        if (floor < 1 || floor > 4) {
            System.out.println(" Out of the Range ");
            return null;
        } else {
            return ENUMS[floor - 1];

        }
    }

    /*

    private Floor() {
        System.out.println("This is Enum");
    }

    private Floor(int number) {
        System.out.println("This is Enum with int");
    }

    private Floor(String name) {
        System.out.println("This is Enum with String ");
    }
     */
    private Floor(int num, String name) {
        // System.out.println("This is Enum with String and Int");
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
