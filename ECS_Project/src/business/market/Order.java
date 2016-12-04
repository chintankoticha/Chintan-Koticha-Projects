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
public class Order {
    public OrderItem orderItem;

    public Order() {
    
    orderItem=new OrderItem();
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }
    
    
    
}
