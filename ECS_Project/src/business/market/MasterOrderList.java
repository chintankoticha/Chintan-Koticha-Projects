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
   
    List<Order> orderList;

    public MasterOrderList() {
    orderList=new ArrayList<Order>();
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
    
    
    
    
}
