/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.RoleCaretaker;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mitali
 */
public class OrgCareTaker  extends Organization{

    public OrgCareTaker() {
        super(Organization.Type.Caretaker.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       
      ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleCaretaker());
        return roles;
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
