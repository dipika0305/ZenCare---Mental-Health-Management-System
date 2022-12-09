/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mitali
 */
public class GovernmentEnterprise extends Enterprise
{
    
    public GovernmentEnterprise(String name){
        super(name,EnterpriseType.Government);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
