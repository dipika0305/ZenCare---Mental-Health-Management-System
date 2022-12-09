/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.RoleDoctor;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mitali
 */
public class OrgDoctor extends Organization{

    public OrgDoctor() {
        super(Organization.Type.Doctor.getValue());
       
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleDoctor());
        return roles;
    }
  
}