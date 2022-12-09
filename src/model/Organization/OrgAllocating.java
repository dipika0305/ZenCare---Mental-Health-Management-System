/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.Role;
import model.Role.RoleAllocator;

/**
 *
 * @author dipikam
 */
public class OrgAllocating extends Organization {
    
    public OrgAllocating() {
         super(Organization.Type. Acommittee.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
      //  throw new UnsupportedOperationException("Not supported yet."); //Choose Tools > Template, to change the body of generated methods.
     ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleAllocator());
        return roles;
    }
    
}
