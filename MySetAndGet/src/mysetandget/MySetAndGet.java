/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysetandget;

/**
 *
 * @author ARM-PC
 */
public class MySetAndGet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.SetAddress("Doha");
        emp.SetIsActive(true);
        emp.SetempBDate("1977");
        emp.SetempName("Ahmed");
        emp.SetempNum(777);
        emp.PrintInfo();
        System.out.println(emp.GetempName());
    }
    
}
