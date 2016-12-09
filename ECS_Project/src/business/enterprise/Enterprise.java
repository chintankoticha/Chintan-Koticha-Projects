/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.market.ProductCategory;
import business.organization.Organization;
import business.organization.OrganizationDirectory;

/**
 *
 * @author Chintan
 */
public abstract class Enterprise extends Organization{
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private ProductCategory productCatalog;

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public ProductCategory getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCategory productCatalog) {
        this.productCatalog = productCatalog;
    }
    

    public enum EnterpriseType {

        Government("Government"),
        Market("Market"),
        Retailer("Retailer");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        productCatalog = new ProductCategory();
    }   
}