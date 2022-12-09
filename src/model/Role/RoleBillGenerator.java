/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSys;
import model.Enterprise.Enterprise;
import model.Organization.OrgBillings;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
//import userinterface.BillGeneratorRole.BillGeneratorWorkAreaJPanel;
//import userinterface.DoctorRole.DoctorWorkAreaJPanel;

/**
 *
 * @author Mitali
 */
public class RoleBillGenerator extends Role{
   

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business) {
        return null;
    }
    
}
