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
public class DrugEnterprise extends Enterprise {
    
    public DrugEnterprise(String name){
        super(name,EnterpriseType.Drug);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
