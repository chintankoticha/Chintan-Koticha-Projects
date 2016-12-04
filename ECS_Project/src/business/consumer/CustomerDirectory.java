/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.consumer;

import java.util.ArrayList;

/**
 *
 * @author Chintan
 */
public class CustomerDirectory {

    private ArrayList<Customer> customerDirectory;

    public CustomerDirectory() {
        customerDirectory = new ArrayList();
    }

    public ArrayList<Customer> getCustomerDirectory(){
        return customerDirectory;
    }
    
    public Customer createCustomer(Customer customer){
        customerDirectory.add(customer);
        return customer;
    }

}
