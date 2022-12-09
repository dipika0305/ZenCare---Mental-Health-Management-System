/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Network;

import model.Enterprise.EnterpriseDirectory;

/**
 *
 * @author dipikam
 */
public class Network {
    
    private String name;
    private EnterpriseDirectory enterpriseDir;
    
    public Network(){
        enterpriseDir=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDir() {
        return enterpriseDir;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
