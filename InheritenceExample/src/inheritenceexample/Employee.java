/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritenceexample;

/**
 *
 * @author ARM-PC
 */
public class Employee extends Person {

    public String SSN;
    public String EmploymentDate;
    public double StartSalary;
    public double currentSalary;

    public Employee(String PersonName) {
        super(PersonName);
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getEmploymentDate() {
        return EmploymentDate;
    }

    public void setEmploymentDate(String EmploymentDate) {
        this.EmploymentDate = EmploymentDate;
    }

    public double getStartSalary() {
        return StartSalary;
    }

    public void setStartSalary(double StartSalary) {
        this.StartSalary = StartSalary;
    }

    public double getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(double currentSalary) {
        this.currentSalary = currentSalary;
    }

}
