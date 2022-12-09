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
public class SupplimentsWorkRequest extends WorkRequest {
      private String supplimentinfo;
      private UserAccount supplimentreceiver;
      private String supplimentStatus;

    public UserAccount getSupplimentreceiver() {
        return supplimentreceiver;
    }

    public void setSupplimentreceiver(UserAccount supplimentreceiver) {
        this.supplimentreceiver = supplimentreceiver;
    }

    public String getSupplimentStatus() {
        return supplimentStatus;
    }

    public void setSupplimentStatus(String supplimentStatus) {
        this.supplimentStatus = supplimentStatus;
    }
              
              
    public String getSupplimentinfo() {
        return supplimentinfo;
    }

    public void setSupplimentinfo(String supplimentinfo) {
        this.supplimentinfo = supplimentinfo;
    }
    
}
