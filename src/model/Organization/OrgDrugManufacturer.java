/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.RoleDrugManufacturer;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vidhi
 */
public class OrgDrugManufacturer extends Organization{

    public OrgDrugManufacturer() {
        super(Organization.Type.DrugManufacturer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleDrugManufacturer());
        return roles;
    }
     
   
    
    
}
