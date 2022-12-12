/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSys;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SupportRole.SupportWorkAreaJPanel;

/**
 *
 * @author Mitali
 */
public class RoleSupportProvider extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business) {
         return new SupportWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
         
    }
    
}
