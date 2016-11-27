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
public class ApplianceDirectory {
   private ArrayList<Appliance> applianceDirectory;
   
   public ApplianceDirectory(){
       applianceDirectory = new ArrayList<>();
   }

    public ArrayList<Appliance> getApplianceDirectory() {
        return applianceDirectory;
    }

    public void setApplianceDirectory(ArrayList<Appliance> applianceDirectory) {
        this.applianceDirectory = applianceDirectory;
    }  
}