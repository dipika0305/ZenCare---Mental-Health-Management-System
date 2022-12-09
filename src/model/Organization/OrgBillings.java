/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;


import model.Role.RoleBillGenerator;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author dipikam
 */


public class OrgBillings extends Organization {
    
    public OrgBillings(){
        super(Organization.Type.Billing.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleBillGenerator());
        return roles;
    }
    
}
