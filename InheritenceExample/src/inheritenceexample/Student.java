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
public class Student extends Person {

    @Override
    public void GetpersonType() {
        System.out.println("Student");
    }

    public String CardID;
    public String BranchName;

    public Student(String PersonName) {
        super(PersonName);
    }

    public String getCardID() {
        return CardID;
    }

    public void setCardID(String CardID) {
        this.CardID = CardID;
    }

    public String getBranchName() {
        return BranchName;
    }

    public void setBranchName(String BranchName) {
        this.BranchName = BranchName;
    }

}
