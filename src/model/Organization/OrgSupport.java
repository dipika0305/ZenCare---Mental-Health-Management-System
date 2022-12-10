/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.Role;
import model.Role.RoleSupportProvider;
import java.util.ArrayList;

/**
 *
 * @author Vidhi
 */
public class OrgSupport  extends Organization{

    public OrgSupport() {
        super(Organization.Type.Support.getValue()); 
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
           ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleSupportProvider());
        return roles;
    }
    
}
