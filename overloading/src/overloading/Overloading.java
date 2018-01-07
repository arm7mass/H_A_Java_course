/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

import overriding.MyName2;

/**
 *
 * @author ARM-PC
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyName mn = new MyName();
        mn.PrintName();
        mn.PrintName("Abdulrhman");
        mn.PrintName("Abdulrhman", "Masoud");
        MyName2 mn1 = new MyName2();
        mn1.PrintName();
        mn1.PrintName("Abdulrhman ");
    }

}
