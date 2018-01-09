/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritenceexample;

import inheritenceexample.InheritenceExample.floor;

/**
 *
 * @author ARM-PC
 */
public class Doctor extends Employee {

    @Override
    public void GetpersonType() {
        System.out.println("Doctor");
    }
    
    public floor clinic ;

    public String CertificateYear;
    public String DoctorateTitle;
    public String DoctorateDetails;

    public Doctor(String PersonName) {
        super(PersonName);
    }

    public String getCertificateYear() {
        return CertificateYear;
    }

    public void setCertificateYear(String CertificateYear) {
        this.CertificateYear = CertificateYear;
    }

    public String getDoctorateTitle() {
        return DoctorateTitle;
    }

    public void setDoctorateTitle(String DoctorateTitle) {
        this.DoctorateTitle = DoctorateTitle;
    }

    public String getDoctorateDetails() {
        return DoctorateDetails;
    }

    public void setDoctorateDetails(String DoctorateDetails) {
        this.DoctorateDetails = DoctorateDetails;
    }

}
