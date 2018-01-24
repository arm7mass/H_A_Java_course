/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_interface;

/**
 *
 * @author ARM-PC
 */
public class calc implements calc1 {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1 - num2;

    }

    @Override
    public int multi(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int div(int num1, int num2) {
        return num1 / num2;
    }

    @Override
    public int mod() {
        return 0;
    }

    @Override
    public void test() {
    }

}
