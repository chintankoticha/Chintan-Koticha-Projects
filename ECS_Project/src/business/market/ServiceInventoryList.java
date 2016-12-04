/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.market;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ServiceInventoryList {
    ArrayList<ServiceInventory> inventoryList;

    public ServiceInventoryList() {
        inventoryList=new ArrayList<>();
    }

    public ArrayList<ServiceInventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<ServiceInventory> inventoryList) {
        this.inventoryList = inventoryList;
    }
    
    public ServiceInventory addInventory(){
        ServiceInventory inventory=new ServiceInventory();
        inventoryList.add(inventory);
        return inventory;
    }
    
    public void deleteInventory(ServiceInventory inventory){
        
        inventoryList.remove(inventory);
    }
    
}
