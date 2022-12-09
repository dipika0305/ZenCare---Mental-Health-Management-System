/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.Role;
import model.Role.RoleGranter;

/**
 *
 * @author dipikam
 */
public class OrgGranting extends Organization {
    
    public OrgGranting() {
       super(Organization.Type.Gcomittee.getValue());
    
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
          ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleGranter());
        return roles;
    }
    
}
