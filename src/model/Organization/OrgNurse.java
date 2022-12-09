/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import static model.Organization.Organization.Type.Nurse;
import model.Role.RoleNurse;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mitali
 */
public class OrgNurse  extends Organization{

    public OrgNurse() {
   super(Organization.Type.Nurse.getValue());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleNurse());
        return roles;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
