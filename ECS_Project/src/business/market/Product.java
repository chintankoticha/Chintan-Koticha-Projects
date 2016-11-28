/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.market;

/**
 *
 * @author Lenovo
 */
public class Product {
    private static int count = 1;
    private String vendorName;
    private String productName;
    private String modelNumber;
    private String productDescription;
    private String productFeature;
    private String benefits;
    private int productId;
    private ServiceInventory serviceInventory;

    public Product() {
    productId=count++;
    serviceInventory=new ServiceInventory();
    }

    public ServiceInventory getServiceInventory() {
        return serviceInventory;
    }

    public void setServiceInventory(ServiceInventory serviceInventory) {
        this.serviceInventory = serviceInventory;
    }

    
   

    
     public enum Type{
        Admin("Admin"),
        Accountant("Accountant"),
        ControlManager("Control Manager"),
        InventoryManager("Inventory Manager"),
        SalesPerson("Sales Person"),
        Customer("Customer"),
        InsuranceManager("Insurance Manager"),
        SalesReceptionist("Sales Receptionist"),
        SalesPersonOrganization("sales Person Organization"),
        ServicePersonOrganization("Service Person Organization"),
        ServiceReceptionist("Service Receptionist");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductFeature() {
        return productFeature;
    }

    public void setProductFeature(String productFeature) {
        this.productFeature = productFeature;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    @Override
    public String toString()
    {
        return this.productName;
    }

}
