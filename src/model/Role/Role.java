/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.EcoSys;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;

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
        Granter("Granter");
//        SupplimentProvider("Suppliment Provider");
        
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
