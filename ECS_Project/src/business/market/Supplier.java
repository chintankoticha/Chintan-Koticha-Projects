/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.market;

/**
 *
 * @author admin
 */
public class Supplier {
 
    private String supplierName;
    private static int count = 1;
    private int supplierID;
    private ProductCategory productCategory;

    public Supplier() {
        supplierID=count++;
    
    productCategory=new ProductCategory();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    

    @Override
   public String toString()
   {
       return supplierName;
   }
    
    
    
    
    
    
}
