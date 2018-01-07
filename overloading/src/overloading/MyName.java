/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author ARM-PC
 */
public class MyName {

    public void PrintName() {
        System.out.println("My Name is Abdulrhman ");
    }

    public void PrintName(String Name) {
        System.out.println(Name);
    }

    public final void PrintName(String Fname, String LName) {
        System.out.println(Fname + " " + LName);
    }

}
