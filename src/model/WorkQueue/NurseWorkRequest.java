/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

/**
 *
 * @author dipikam
 */
public class NurseWorkRequest extends WorkRequest {
    private String nurseInfo;
    private String nurseReceiver;
    private String nurseStatus;

    public String getNurseStatus() {
        return nurseStatus;
    }

    public void setNurseStatus(String nurseStatus) {
        this.nurseStatus = nurseStatus;
    }

    public String getNurseReceiver() {
        return nurseReceiver;
    }

    public void setNurseReceiver(String nurseReceiver) {
        this.nurseReceiver = nurseReceiver;
    }
    

    

    public String getNurseInfo() {
        return nurseInfo;
    }

    public void setNurseInfo(String NurseInfo) {
        this.nurseInfo = NurseInfo;
    }
    
}
