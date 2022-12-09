/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

/**
 *
 * @author Mitali
 */
public class DrugMAnufacturerWorkRequest  extends WorkRequest{
     private String quantity;
     
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

   @Override
    public String toString()
    {
        return getQuantity();
    }
    

    
    
}
