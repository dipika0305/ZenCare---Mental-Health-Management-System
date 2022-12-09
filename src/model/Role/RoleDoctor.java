/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.DoctorSchedule;
import model.EcoSys;
import model.Enterprise.Enterprise;
import model.Organization.OrgDoctor;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
//import userinterface.RoleDoctor.DoctorWorkAreaMainJPanel;

/**
 *
 * @author dipikam
 */
public class RoleDoctor extends Role{
 public DoctorSchedule sched=new DoctorSchedule();
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business) {
        return null;
    }
    
    
}
