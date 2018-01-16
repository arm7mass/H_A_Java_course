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
public class EnumExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e = new Employee();
        e.EmpNo = 12554;
        e.EmpName = "Abdulrhman";
        e.EmpAdress = "Doha";
        e.WorkFloor = Floor.f3;
        e.WorkFloor.setNum(1000000000);
        System.out.println(e.WorkFloor.getNum() + " " + e.WorkFloor.getName());
        e.WorkFloor = Floor.f5;
        System.out.println(e.WorkFloor.getNum() + " " + e.WorkFloor.getName());
    }
    
}
