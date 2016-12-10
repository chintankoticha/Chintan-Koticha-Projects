/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.consumer;

import business.market.Product;
import java.util.Date;

/**
 *
 * @author Siddhant
 */
public class Service {
    
    private Date date;
    private Product product;
    
    public Service(){
        product = new Product();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
    
}
