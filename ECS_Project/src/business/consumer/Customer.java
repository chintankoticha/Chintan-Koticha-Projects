/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.consumer;

import business.workqueue.WorkQueue;
import java.util.Date;

/**
 *
 * @author Chintan
 */
public class Customer {

    private String firstName;
    private String lastName;
    private String customerId;
    private String currentAddress;
    private String currentAreaCode;
    private ApplianceDirectory applianceDirectory;
    private AutomobileDirectory automobileDirectory;
    private SensorDirectory sensorDirectory;
    private ServiceDirectory serviceDirectory;
    private WorkQueue workQueue;
    private int tax;
    private Date DueDate;
    private Date PaidOn;
    private int prevDateCount=0;
    private int recentCount=0;

    public Customer() {
        applianceDirectory = new ApplianceDirectory();
        automobileDirectory = new AutomobileDirectory();
        sensorDirectory = new SensorDirectory();
        serviceDirectory = new ServiceDirectory();
        workQueue = new WorkQueue();
    }

    public int getPrevDateCount() {
        return prevDateCount;
    }

    public void setPrevDateCount(int prevDateCount) {
        this.prevDateCount = prevDateCount;
    }

    public int getRecentCount() {
        return recentCount;
    }

    public void setRecentCount(int recentCount) {
        this.recentCount = recentCount;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public Date getDueDate() {
        return DueDate;
    }

    public void setDueDate(Date DueDate) {
        this.DueDate = DueDate;
    }

    public Date getPaidOn() {
        return PaidOn;
    }

    public void setPaidOn(Date PaidOn) {
        this.PaidOn = PaidOn;
    }

    public String getCustomerId() {
        return customerId;
    }

    public SensorDirectory getSensorDirectory() {
        return sensorDirectory;
    }

    public void setSensorDirectory(SensorDirectory sensorDirectory) {
        this.sensorDirectory = sensorDirectory;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    public ServiceDirectory getServiceDirectory() {
        return serviceDirectory;
    }

    public void setServiceDirectory(ServiceDirectory serviceDirectory) {
        this.serviceDirectory = serviceDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
}
