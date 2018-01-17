/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumexample;

enum FloorType {
    in, out;
}

public enum Floor {
    f1(1, "Abdul1"), f2(2, "Abdu2"), f3(3, "masoud"), f4(4, "abdul4"), f5(5, "abdul5");
    private int num;
    private String name;

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
