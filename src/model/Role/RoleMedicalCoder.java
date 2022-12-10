/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSys;
import model.Enterprise.Enterprise;
import model.Organization.OrgMedicalCoder;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.MedicalCoderRole.MedicalCoderWorkAreaJPanel;
//import userinterface.RoleMedicalCoder.MedicalCoderWorkAreaJPanel;

/**
 *
 * @author Mitali
 */
public class RoleMedicalCoder extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business) {
        return new MedicalCoderWorkAreaJPanel(userProcessContainer, account, (OrgMedicalCoder)organization, enterprise);
    }
    
}
