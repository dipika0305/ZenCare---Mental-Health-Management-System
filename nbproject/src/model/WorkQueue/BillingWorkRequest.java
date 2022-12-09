package model.WorkQueue;

import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mitali
 */
public class BillingWorkRequest extends WorkRequest{
    
    private String BillingInfo;
    private float amountApproved;
    private String BillingStatus;
    private BigInteger insurancecard;
    String claimstatus;
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    public String getClaimstatus() {
        return claimstatus;
    }

    public void setClaimstatus(String claimstatus) {
        this.claimstatus = claimstatus;
    }

    public BigInteger getInsurancecard() {
        return insurancecard;
    }

    public void setInsurancecard(BigInteger insurancecard) {
        this.insurancecard = insurancecard;
    }

  
    public String getBillingStatus() {
        return BillingStatus;
    }

    public void setBillingStatus(String BillingStatus) {
        this.BillingStatus = BillingStatus;
    }

    public float getAmountApproved() {
        return amountApproved;
    }

    public void setAmountApproved(float amountApproved) {
        this.amountApproved = amountApproved;
    }
    
    
    public String getBillingInfo() {
        return BillingInfo;
    }

    public void setBillingInfo(String BillingInfo) {
        this.BillingInfo = BillingInfo;
    }
}
