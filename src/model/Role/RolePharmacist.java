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
import userinterface.PharmacistRole.PharmacistWorkAreaJPanel;

/**
 *
 * @author dipikam
 */
public class RolePharmacist extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business) {
        return new PharmacistWorkAreaJPanel(userProcessContainer, account, organization, business, enterprise);
    }
    
}
