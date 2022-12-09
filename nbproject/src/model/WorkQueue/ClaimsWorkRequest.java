/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

import model.UserAccount.UserAccount;
import java.math.BigInteger;

/**
 *
 * @author Mitali
 */
public class ClaimsWorkRequest extends WorkRequest {
    private String claimsInfo;
    private BigInteger insuranceCard;
    private float amount_Approved;
    private String emailid ;
    private UserAccount claimreceiver;
    private String claimstatus;

    public String getClaimstatus() {
        return claimstatus;
    }

    public void setClaimstatus(String claimstatus) {
        this.claimstatus = claimstatus;
    }

    public UserAccount getClaimreceiver() {
        return claimreceiver;
    }

    public void setClaimreceiver(UserAccount claimreceiver) {
        this.claimreceiver = claimreceiver;
    }
    

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    

    public float getAmount_Approved() {
        return amount_Approved;
    }

    public void setAmount_Approved(float amount_Approved) {
        this.amount_Approved = amount_Approved;
    }
    

    public BigInteger getInsuranceCard() {
        return insuranceCard;
    }

    public void setInsuranceCard(BigInteger insuranceCard) {
        this.insuranceCard = insuranceCard;
    }
    

    public String getClaimsInfo() {
        return claimsInfo;
    }

    public void setClaimsInfo(String claimsInfo) {
        this.claimsInfo = claimsInfo;
    }
    
    
    @Override
    public String toString()
    {
        return getPatient();
    }
    
    
}
