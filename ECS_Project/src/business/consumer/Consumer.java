/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.consumer;

import business.employee.Employee;

/**
 *
 * @author Chintan
 */
public class Consumer extends Employee{
    private String consumerId;
    private String currentAddress;
    private String currentAreaCode;
    private ApplianceDirectory applianceDirectory;
    private AutomobileDirectory automobileDirectory;
    
    public Consumer(){
        applianceDirectory = new ApplianceDirectory();
        automobileDirectory = new AutomobileDirectory();
    }

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getCurrentAreaCode() {
        return currentAreaCode;
    }

    public void setCurrentAreaCode(String currentAreaCode) {
        this.currentAreaCode = currentAreaCode;
    }

    public ApplianceDirectory getApplianceDirectory() {
        return applianceDirectory;
    }

    public void setApplianceDirectory(ApplianceDirectory applianceDirectory) {
        this.applianceDirectory = applianceDirectory;
    }

    public AutomobileDirectory getAutomobileDirectory() {
        return automobileDirectory;
    }

    public void setAutomobileDirectory(AutomobileDirectory automobileDirectory) {
        this.automobileDirectory = automobileDirectory;
    }
    
    
}
