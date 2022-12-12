/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author dipikam
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new OrgDoctor();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new OrgLab();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.DrugManufacturer.getValue())){
            organization = new OrgDrugManufacturer();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PharmacistOrganization.getValue())){
            organization = new OrgPharmacist();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.MedicalCoder.getValue())){
            organization = new OrgMedicalCoder();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Acommittee.getValue())){
            organization = new OrgAllocating();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Billing.getValue())){
            organization = new OrgBillings();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Caretaker.getValue())){
            organization = new OrgCareTaker();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Claims.getValue())){
            organization = new OrgClaims();
            organizationList.add(organization);
            
        }
        else if (type.getValue().equals(Type.Gcomittee.getValue())){
            organization = new OrgGranting();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Nurse.getValue())){
            organization = new OrgNurse();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Support.getValue())){
            organization = new OrgSupport();
            organizationList.add(organization);
        }
        return organization;
    }
}