/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Emp.Employee;
import model.UserAccount.UserAccount;
import model.Role.RoleSystemAdmin;


/**
 *
 * @author dipikam
 */
public class ConfigSys {
    
    public static EcoSys configure(){
        
        EcoSys sys = EcoSys.getInstance();              
        Employee employee = sys.getEmployeeDir().createEmployee("sysadmin"); //Creates a Root User
        
        UserAccount ua = sys.getUserAccountDir().createUserAccount("sysadmin", "sysadmin", employee, new RoleSystemAdmin());
        
        return sys;
    }
    
}
