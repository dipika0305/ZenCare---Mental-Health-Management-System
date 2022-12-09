package model.WorkQueue;

import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidhi
 */
public class PatientWorkRequest extends WorkRequest{
    
    private String PatientName;
    private String PatientState;
    private String Age;
    private String appointmentTime;
    private String billamount;
    private String billstatus;
   private String rehabStatus;
    private String nurseName;
    private String email;
    private BigInteger cardnumber;
    private String cardHolder;
    
     public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }
    
    ///added to the workRequestc class////
//    private String billReciever;
//    private String nurseReciever;
    
 
//    public String getBillReciever() {
//        return billReciever;
//    }
//
//    public void setBillReciever(String billReciever) {
//        this.billReciever = billReciever;
//    }
//
//    public String getNurseReciever() {
//        return nurseReciever;
//    }
//
//    public void setNurseReciever(String nurseReciever) {
//        this.nurseReciever = nurseReciever;
//    }
//       

    public BigInteger getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(BigInteger cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }
       
       

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
 
    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public String getRehabStatus() {
        return rehabStatus;
    }

    public void setRehabStatus(String rehabStatus) {
        this.rehabStatus = rehabStatus;
    }
    public String getBillstatus() {
        return billstatus;
    }

    public void setBillstatus(String billstatus) {
        this.billstatus = billstatus;
    }

    public String getBillamount() {
        return billamount;
    }

    public void setBillamount(String billamount) {
        this.billamount = billamount;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
    
    public String getPatientState() {
        return PatientState;
    }

    public void setPatientState(String PatientState) {
        this.PatientState = PatientState;
    }

    

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }
@Override
    public String toString()
    {
        return getPatientName();
    }
    
}
