/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumexample;

/**
 *
 * @author ARM-PC
 */
public enum Floor {
    f1(1), f2("Abdul"), f3(2, "masoud"), f4(), f5;

    private Floor() {
        System.out.println("This is Enum");
    }

    private Floor(int number) {
        System.out.println("This is Enum with int");
    }

    private Floor(String name) {
        System.out.println("This is Enum with String ");
    }

    private Floor(int a, String b) {
        System.out.println("This is Enum with String and Int");
    }

}
