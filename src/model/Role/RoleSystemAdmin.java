/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSys;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Mitali
 */
public class RoleSystemAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
