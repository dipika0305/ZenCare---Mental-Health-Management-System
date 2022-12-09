/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;
import model.Role.Role;

/**
 *
 * @author dipikam
 */
public class GovernmentEnterprise extends Enterprise{
    
    public GovernmentEnterprise(String name){
        super(name,EnterpriseType.Government);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
