/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.Role;
import business.role.ServiceReceptionistRole;
import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public class ServiceReceptionistOrganization extends Organization {
    
     public ServiceReceptionistOrganization() {
        super(Organization.Type.ServiceReceptionist.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ServiceReceptionistRole());
        return roles;
    }
    
}
