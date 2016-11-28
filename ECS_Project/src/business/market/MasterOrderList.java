/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.market;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class MasterOrderList {
   
    List<Order> orderListByServicePerson;
    List<Order> orderListByInventoryPerson;

    public MasterOrderList() {
    orderListByServicePerson=new ArrayList<Order>();
    orderListByInventoryPerson=new ArrayList<>();
    }

    public List<Order> getOrderListByServicePerson() {
        return orderListByServicePerson;
    }

    public void setOrderListByServicePerson(List<Order> orderListByServicePerson) {
        this.orderListByServicePerson = orderListByServicePerson;
    }

    public List<Order> getOrderListByInventoryPerson() {
        return orderListByInventoryPerson;
    }

    public void setOrderListByInventoryPerson(List<Order> orderListByInventoryPerson) {
        this.orderListByInventoryPerson = orderListByInventoryPerson;
    }

    
    
    
    
}
