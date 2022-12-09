/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author dipikam
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseDir;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseDir;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseDir = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseDir = new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        
        Enterprise enterprise=null;
     
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterpriseDir.add(enterprise);
        }
        
        if(type==Enterprise.EnterpriseType.Drug){
            enterprise=new DrugEnterprise(name);
            enterpriseDir.add(enterprise);
        }
        
        if(type==Enterprise.EnterpriseType.Insurance){
            enterprise=new InsuranceEnterprise(name);
            enterpriseDir.add(enterprise);
        }
        
        if(type==Enterprise.EnterpriseType.WellnessAndSupport){
            enterprise=new WellnessAndSupportEnterprise(name);
            enterpriseDir.add(enterprise);
        }
        
        if(type==Enterprise.EnterpriseType.Govt){
            enterprise=new GovernmentEnterprise(name);
            enterpriseDir.add(enterprise);
        } 

        return enterprise;
    }
    
}
