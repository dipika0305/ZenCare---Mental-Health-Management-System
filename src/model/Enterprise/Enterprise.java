/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import model.Organization.Organization;
import model.Organization.OrganizationDirectory;

/**
 *
 * @author dipikam
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDir;
    
    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    //Declaring enumeration for five enterprises
    public enum EnterpriseType{
        Hospital("Hospital"),
        Drug("Drug"),
        Insurance("Insurance"),
        WellnessAndSupport("Wellness and Support"),
        Government("Government");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        
        public String getValue() {
            return value;
        }
        
        @Override
            public String toString(){
            return value;
        }
    }
    
    public Enterprise(String name, EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDir=new OrganizationDirectory();
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDir() {
        return organizationDir;
    }

    public void setOrganizationDir(OrganizationDirectory organizationDir) {
        this.organizationDir = organizationDir;
    }
    
}
