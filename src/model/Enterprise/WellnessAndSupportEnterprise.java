/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import model.Enterprise.Enterprise.EnterpriseType;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vidhi
 */
public class WellnessAndSupportEnterprise extends Enterprise {
    
    public WellnessAndSupportEnterprise(String name){
        super(name,EnterpriseType.WellnessAndSupport);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
