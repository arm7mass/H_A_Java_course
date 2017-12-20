/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myencap;

/**
 *
 * @author ARM-PC
 */
public class Person {
    private int _PersonNumber;
    private String _PersonName;
    private String _PersonCode;
    private String _PersonBdate;
    private String _Address;
    private Double _Salary;

    public int getPersonNumber() {
        return _PersonNumber;
    }

    public void setPersonNumber(int _PersonNumber) {
        this._PersonNumber = _PersonNumber;
    }

    public String getPersonName() {
        return _PersonName;
    }

    public void setPersonName(String _PersonName) {
        this._PersonName = _PersonName;
    }

    public String getPersonCode() {
        return _PersonCode;
    }

    public void setPersonCode(String _PersonCode) {
        this._PersonCode = _PersonCode;
    }

    public String getPersonBdate() {
        return _PersonBdate;
    }

    public void setPersonBdate(String _PersonBdate) {
        this._PersonBdate = _PersonBdate;
    }

    public String getAddress() {
        return _Address;
    }

    public void setAddress(String _Address) {
        this._Address = _Address;
    }

    public Double getSalary() {
        return _Salary;
    }

    public void setSalary(Double _Salary) {
        this._Salary = _Salary+_Salary*0.1;
    }
    
    
    
    
    
}
