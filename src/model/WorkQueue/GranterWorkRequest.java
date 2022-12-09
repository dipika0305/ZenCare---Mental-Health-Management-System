/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

import model.UserAccount.UserAccount;

/**
 *
 * @author Vidhi
 */
public class GranterWorkRequest extends WorkRequest {
      private String grantInfo;
      private String grantingAmount;
      private String grantingstatus;
      private UserAccount grantreceiver;
      String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
      

    public UserAccount getGrantreceiver() {
        return grantreceiver;
    }

    public void setGrantreceiver(UserAccount grantreceiver) {
        this.grantreceiver = grantreceiver;
    }

    public String getGrantingstatus() {
        return grantingstatus;
    }

    public void setGrantingstatus(String grantingstatus) {
        this.grantingstatus = grantingstatus;
    }
      

    public String getGrantInfo() {
        return grantInfo;
    }

    public void setGrantInfo(String grantInfo) {
        this.grantInfo = grantInfo;
    }

    public String getGrantingAmount() {
        return grantingAmount;
    }

    public void setGrantingAmount(String grantingAmount) {
        this.grantingAmount = grantingAmount;
    }

   
}
