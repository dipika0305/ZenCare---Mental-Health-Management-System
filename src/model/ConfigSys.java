package model;

import model.Employee.Employee;
import model.Role.RoleSystemAdmin;
import model.UserAccount.UserAccount;

/**
 *
 * @author Mitali
 */
public class ConfigSys {
    
    public static EcoSys configure(){
        
        EcoSys system = EcoSys.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new RoleSystemAdmin());
        
        return system;
    }
    
}
