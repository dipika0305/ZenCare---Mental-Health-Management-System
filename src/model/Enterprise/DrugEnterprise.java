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
public class DrugEnterprise extends Enterprise{
    
    public DrugEnterprise(String name){
        super(name,EnterpriseType.Drug);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
