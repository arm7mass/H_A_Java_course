/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinheritence;

/**
 *
 * @author ARM-PC
 */
public class Phone {

    public Phone() {
        System.out.println("Phone is created ");
    }

    public String name;
    private int buttonCount;
    private String screenDetails;

    public int getButtonCount() {
        return buttonCount;
    }

    public void setButtonCount(int buttonCount) {
        this.buttonCount = buttonCount;
    }

    public String getScreenDetails() {
        return screenDetails;
    }

    public void setScreenDetails(String screenDetails) {
        this.screenDetails = screenDetails;
    }

}
