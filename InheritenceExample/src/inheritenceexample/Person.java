/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritenceexample;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ARM-PC
 */
public class Person {

    public String ID;
    public String name;
    public String address;
    public String BirthDate;
    public String phone;

    public Person(String PersonName) {
        name = PersonName;
    }

    public void GetpersonType() {
        System.out.println("Person");
    }

    public int calcDateOfBirth(String BirthYear) {
        Date d = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy");
        int YearNow = Integer.parseInt(f.format(d));
        int YearBD = Integer.parseInt(BirthYear);
        int BD = YearNow - YearBD;
        return BD;

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
