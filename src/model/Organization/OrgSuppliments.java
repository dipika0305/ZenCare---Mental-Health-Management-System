/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.Role;
import model.Role.RoleSupplimentProvider;
import java.util.ArrayList;

/**
 *
 * @author Vidhi
 */
public class OrgSuppliments  extends Organization{

    public OrgSuppliments() {
        super(Organization.Type.Suppliments.getValue()); 
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
           ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleSupplimentProvider());
        return roles;
    }
    
}
