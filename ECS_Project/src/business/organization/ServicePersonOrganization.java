/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.AccountantRole;
import business.role.Role;
import business.role.SalesPersonRole;
import business.role.ServicePersonRole;
import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public class ServicePersonOrganization extends Organization{
    
    public ServicePersonOrganization() {
        super(Organization.Type.ServicePerson.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ServicePersonRole());
        return roles;
    }
    
}
