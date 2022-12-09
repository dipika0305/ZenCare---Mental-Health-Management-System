/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.RoleAllocator;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vidhi
 */
public class OrgAllocating extends Organization {

    public OrgAllocating() {
         super(Organization.Type. Acommittee.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleAllocator());
        return roles;
    }
    
    
}
