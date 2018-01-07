/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

import overloading.MyName;

/**
 *
 * @author ARM-PC
 */
public class MyName2 extends MyName {

    @Override
    public void PrintName() {
        System.out.println("Abdulrhman + Salem  " + "this is ovverriding Method ");
        System.out.println();
    }

    @Override
    public void PrintName(String Name) {
        System.out.println(Name + " " + "this is ovverriding Method ");
        System.out.println();
        System.out.println();
    }

}
