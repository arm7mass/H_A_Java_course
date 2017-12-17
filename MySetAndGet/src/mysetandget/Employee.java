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
public class Employee {

    private int _empNum;
    private String _empName;
    private String _empBDate;
    private String _address;
    private Boolean _IsActive;

    public void SetempNum(int empNum) {
        _empNum = empNum;
    }

    public int GetempNum() {
        return _empNum;
    }

    public void SetempName(String empName) {
        _empName = empName;
    }

    public String GetempName() {
        return _empName;
    }

    public void SetempBDate(String empBDate) {
        _empBDate = empBDate;
    }

    public String GetempBDate() {
        return _empBDate;
    }

    public void SetAddress(String address) {
        _address = address;
    }

    public String GetAddress() {
        return _address;
    }

    public void SetIsActive(Boolean IsActive) {
        _IsActive = IsActive;
    }

    public Boolean GetIsActive() {
        return _IsActive;
    }

    public void PrintInfo() {
        System.out.println("Employee Number is : " + _empNum);
        System.out.println("Employee Name is : " + _empName);
        System.out.println("Employee Birth Date is : " + _empBDate);
        System.out.println("Employee Address is : " + _address);
        System.out.println("Employee status is Active  : " + _IsActive);

    }

}
