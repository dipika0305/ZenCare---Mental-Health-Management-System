/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Employee.EmployeeDirectory;
import model.Role.Role;
import model.UserAccount.UserAccountDirectory;
import model.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author dipikam
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
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
        Gcomittee("Granting Comittee")
        ;
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
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
