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
public class person {

    private int _personNumber;
    private String _personName;
    private String _personBDate;
    private String _Address;
    private Double _salary;
    private Boolean _IsActive;

    public int getPersonNumber() {
        return _personNumber;
    }

    public void setPersonNumber(int _personNumber) {
        this._personNumber = _personNumber;
    }

    public String getPersonName() {
        return _personName;
    }

    public void setPersonName(String _personName) {
        this._personName = _personName;
    }

    public String getPersonBDate() {
        return _personBDate;
    }

    public void setPersonBDate(String _personBDate) {
        this._personBDate = _personBDate;
    }

    public String getAddress() {
        return _Address;
    }

    public void setAddress(String _Address) {
        this._Address = _Address;
    }

    public Double getSalary() {
        return _salary;
    }

    public void setSalary(Double _salary) {
        this._salary = _salary;
    }

    public Boolean getIsActive() {
        return _IsActive;
    }

    public void setIsActive(Boolean _IsActive) {
        this._IsActive = _IsActive;
    }

}
