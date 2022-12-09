/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.RolePharmacist;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vidhi
 */
public class OrgPharmacist extends Organization{

    public OrgPharmacist() {
        super(Organization.Type.PharmacistOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RolePharmacist());
        return roles;
    }
     
   
    
    
}
