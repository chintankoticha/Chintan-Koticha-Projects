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
public class OrderItem {
    Product product;
    private static int count = 1;
    private int orderItemNumber;

    public OrderItem() {
        orderItemNumber=count++;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getOrderItemNumber() {
        return orderItemNumber;
    }

    public void setOrderItemNumber(int orderItemNumber) {
        this.orderItemNumber = orderItemNumber;
    }
    
    
    
}
