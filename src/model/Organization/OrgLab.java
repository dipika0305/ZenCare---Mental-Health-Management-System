/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.Role;
import model.Role.RoleLabExaminer;

/**
 *
 * @author dipikam
 */
public class OrgLab{
    
    public OrgLab() {
    }

    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleLabExaminer());
        return roles;
    }
    
}
