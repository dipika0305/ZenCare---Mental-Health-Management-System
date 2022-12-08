/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import java.util.Date;
import model.UserAccount.UserAccount;

/**
 *
 * @author dipikam
 */
public class WorkRequest {
    
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String type;
    private String patient;
    private String state;
    private String bill;
    private String nurse;
    private UserAccount billReciever;
    private UserAccount nurseReciever;
    private String forwardrequest;
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public String getNurse() {
        return nurse;
    }

    public void setNurse(String nurse) {
        this.nurse = nurse;
    }

    public UserAccount getBillReciever() {
        return billReciever;
    }

    public void setBillReciever(UserAccount billReciever) {
        this.billReciever = billReciever;
    }

    public UserAccount getNurseReciever() {
        return nurseReciever;
    }

    public void setNurseReciever(UserAccount nurseReciever) {
        this.nurseReciever = nurseReciever;
    }

    public String getForwardrequest() {
        return forwardrequest;
    }

    public void setForwardrequest(String forwardrequest) {
        this.forwardrequest = forwardrequest;
    }
    
    @Override
    public String toString(){
        return getMessage();
    }
    
}
