/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSys;
import model.Enterprise.Enterprise;
import model.Organization.OrgNurse;
import model.Organization.Organization;
import model.Room;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
//import userinterface.RoleNurse.NurseWorkAreaJPanel;


/**
 *
 * @author Vidhi
 */
public class RoleNurse extends Role{
 public Room sched=new Room();
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business) {
         return null;
 
    }
    
}
