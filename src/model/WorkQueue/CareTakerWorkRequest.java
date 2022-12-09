/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

import model.UserAccount.UserAccount;

/**
 *
 * @author Mitali
 */
public class CareTakerWorkRequest extends WorkRequest {
     private String caretakerInfo;
     private UserAccount caretakerreceiver;
     private String caretakerStatus;

    public String getCaretakerStatus() {
        return caretakerStatus;
    }

    public void setCaretakerStatus(String caretakerStatus) {
        this.caretakerStatus = caretakerStatus;
    }

    public UserAccount getCaretakerreceiver() {
        return caretakerreceiver;
    }

    public void setCaretakerreceiver(UserAccount caretakerreceiver) {
        this.caretakerreceiver = caretakerreceiver;
    }

    public String getCaretakerInfo() {
        return caretakerInfo;
    }

    public void setcaretakerInfo(String caretakerInfo) {
        this.caretakerInfo = caretakerInfo;
    }
}
