/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.consumer;

import business.market.Supplier;
import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public class ServiceDirectory {
    
    private ArrayList<Service> serviceDirectory;
    
    public ServiceDirectory(){
        serviceDirectory=new ArrayList<>();
    }

    public ArrayList<Service> getServiceDirectory() {
        return serviceDirectory;
    }

  public Service addService(){
      Service service = new Service();
      serviceDirectory.add(service);
      return service;
  }   
    
}
