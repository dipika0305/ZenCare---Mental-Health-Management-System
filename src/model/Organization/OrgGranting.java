/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.RoleGranter;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vidhi
 */
public class OrgGranting  extends Organization{

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
