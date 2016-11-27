/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.salesperson;

import java.util.ArrayList;

/**
 *
 * @author Chintan
 */
public class SalesPersonDirectory {
    
    private ArrayList<SalesPerson> salesPersonList;

    public SalesPersonDirectory() {
        salesPersonList = new ArrayList();
    }

    public ArrayList<SalesPerson> getSalesPersonList() {
        return salesPersonList;
    }
    
    public SalesPerson createSalesPerson(String name){
        SalesPerson salesPerson = new SalesPerson();
        salesPerson.setName(name);
        salesPersonList.add(salesPerson);
        return salesPerson;
    }    
}
