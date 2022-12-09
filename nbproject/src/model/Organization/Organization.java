/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Emp.EmployeeDirectory;
import model.Role.Role;
import model.UserAccount.UserAccountDirectory;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author dipikam
 */
public abstract class Organization {
    
    private String name;
    private EmployeeDirectory employeeDir;
    private UserAccountDirectory userAccountDir;
    private int orgID;
    private static int counter=0;
    private WorkQueue workQueue;
  
    public enum Type{
        Admin("Admin Organization"), 
        Doctor("Doctor Organization"),
        Lab("Lab Organization"),
        DrugManufacturer("Drug Manufacturer Organization"),
        PharmacistOrganization("Pharmacist Organization"),
        MedicalCoder("Medical Coder Organization"),
        Billing("Billing"),
        Claims("Claims"),
        Caretaker("Caretaker"),
        Nurse("Nurse"),
        Suppliments("Suppliments"),
        Acommittee("Allocatting Committee"),
        Gcomittee("Granting Comittee");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDir = new EmployeeDirectory();
        userAccountDir = new UserAccountDirectory();
        orgID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public EmployeeDirectory getEmployeeDir() {
        return employeeDir;
    }

    public UserAccountDirectory getUserAccountDir() {
        return userAccountDir;
    }

    public int getOrgID() {
        return orgID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
