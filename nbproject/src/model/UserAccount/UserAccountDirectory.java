/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UserAccount;

import java.util.ArrayList;
import model.Emp.Employee;
import model.Role.Role;

/**
 *
 * @author dipikam
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountDir;

    public UserAccountDirectory() {
        userAccountDir = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountDir() {
        return userAccountDir;
    }

    public void setUserAccountDir(ArrayList<UserAccount> userAccountDir) {
        this.userAccountDir = userAccountDir;
    }

    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountDir)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountDir.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountDir){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
