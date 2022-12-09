/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSys;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
//import userinterface.RoleLabExaminer.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author dipikam
 */
public class RoleLabExaminer extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business) {
        return null;
    }
    
}
