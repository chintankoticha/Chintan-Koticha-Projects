/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.employee.EmployeeDirectory;
import business.role.Role;
import business.salesperson.SalesPersonDirectory;
import business.useraccount.UserAccountDirectory;
import business.workqueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private SalesPersonDirectory salesPersonDirectory;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    public enum Type{
        Admin("Admin"),
        Accountant("Accountant"),
        ControlManager("Control Manager"),
        SalesPerson("Sales Person"),
        Customer("Customer"),
        InsuranceManager("Insurance Manager"),
        SalesReceptionist("Sales Receptionist"),
        //ServicePersonOrganization("Service Person Organization"),
        ServiceReceptionist("Service Receptionist"),
        ServicePerson("Service Person");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        salesPersonDirectory = new SalesPersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }
    
    public String getName() {
        return name;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public SalesPersonDirectory getSalesPersonDirectory() {
        return salesPersonDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
