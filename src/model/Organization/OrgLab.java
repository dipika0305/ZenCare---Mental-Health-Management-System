/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.RoleLabExaminer;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mitali
 */
public class OrgLab extends Organization{

    public OrgLab() {
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleLabExaminer());
        return roles;
    }
     
   
    
    
}
