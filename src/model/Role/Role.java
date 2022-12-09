/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSys;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author dipikam
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        DrugManufacturer("DrugManufacturer"),
        Pharmacist("Pharmacist"),
        Accountant("Accountant"),
        Billgenerator("BillGenerator"),
        ClaimHandler("Claim Handler"),
        Nurse("Nurse"),
        Caretaker("Caretaker"),
        Allocator("Allocator"),
        Granter("Granter"),
        SupplimentProvider("Suppliment Provider")
        ;
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSys business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}