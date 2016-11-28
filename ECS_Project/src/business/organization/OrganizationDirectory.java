/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Chintan
 */
public class OrganizationDirectory {
    
   private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Accountant.getValue())){
            organization = new AccountantOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ControlManager.getValue())){
            organization = new ControlManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SalesPerson.getValue())){
            organization = new SalesPersonOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SalesReceptionist.getValue())){
            organization = new SalesReceptionistOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ServiceReceptionist.getValue())){
            organization = new ServiceReceptionistOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
