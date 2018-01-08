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
public class Customer extends Person {

    @Override
    public void GetpersonType() {
        System.out.println("Customer");
    }

    public String ShipmentAddress;
    public String ShpmentPhone;
    public String NickName;

    public Customer(String PersonName) {
        super(PersonName);
    }

    public String getShipmentAddress() {
        return ShipmentAddress;
    }

    public void setShipmentAddress(String ShipmentAddress) {
        this.ShipmentAddress = ShipmentAddress;
    }

    public String getShpmentPhone() {
        return ShpmentPhone;
    }

    public void setShpmentPhone(String ShpmentPhone) {
        this.ShpmentPhone = ShpmentPhone;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

}
