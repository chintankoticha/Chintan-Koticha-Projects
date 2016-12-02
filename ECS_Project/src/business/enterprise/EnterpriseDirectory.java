/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author Chintan
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory(){
        enterpriseList = new ArrayList();
    }
    
    public Enterprise createAndAddEnterprise(String name,EnterpriseType type){
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Government){
            enterprise = new GovernmentEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.Market){
            enterprise = new MarketEnterprise(name);
            enterpriseList.add(enterprise);     
        }
        if(type == Enterprise.EnterpriseType.Retailer){
           enterprise = new RetailerEnterprise(name);
           enterpriseList.add(enterprise);     
        }
        return enterprise;
    }
}
