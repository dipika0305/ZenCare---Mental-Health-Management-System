/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.RoleMedicalCoder;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mitali
 */
public class OrgMedicalCoder extends Organization{

    public OrgMedicalCoder() {
        super(Organization.Type.MedicalCoder.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleMedicalCoder());
        return roles;
    }
     
   
    
    
}
