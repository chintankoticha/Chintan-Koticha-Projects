/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.consumer.CustomerDirectory;
import business.enterprise.Enterprise;
import business.enterprise.EnterpriseDirectory;

/**
 *
 * @author Chintan
 */
public class Network {
    
    private String name;
    private CustomerDirectory customerDirectory;
    private EnterpriseDirectory enterpriseDirectory;

    public Network(){
        enterpriseDirectory = new EnterpriseDirectory();
        customerDirectory = new CustomerDirectory();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    @Override
    public String toString(){
        return name;
    }
    
     public boolean sameEnterprise(String name) {
        for (Enterprise e : enterpriseDirectory.getEnterpriseList()) {
            if (e.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

}
