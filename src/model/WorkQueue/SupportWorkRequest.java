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
public class SupportWorkRequest extends WorkRequest {
      private String supportinfo;
      private UserAccount supportreceiver;
      private String supportStatus;

    public UserAccount getSupportreceiver() {
        return supportreceiver;
    }

    public void setSupportreceiver(UserAccount supportreceiver) {
        this.supportreceiver = supportreceiver;
    }

    public String getSupportStatus() {
        return supportStatus;
    }

    public void setSupportStatus(String supportStatus) {
        this.supportStatus = supportStatus;
    }
              
              
    public String getSupportinfo() {
        return supportinfo;
    }

    public void setSupportinfo(String supportinfo) {
        this.supportinfo = supportinfo;
    }
    
}
