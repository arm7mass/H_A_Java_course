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
public class Employee {

    public int EmpNo;
    public String EmpName;
    public String EmpAdress;
    private Floor WorkFloor;

    public Employee(Floor WorkFloor) {
        this.WorkFloor = WorkFloor;
    }

    public Floor getWorkFloor() {
        return WorkFloor;
    }

    public void setWorkFloor(Floor WorkFloor) {
        this.WorkFloor = WorkFloor;
    }
    

}
