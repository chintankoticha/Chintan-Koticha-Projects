/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;
import business.role.GovernmentAdminRole;

import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public class AdminOrganization extends Organization{
    
    public AdminOrganization() {
        super(Organization.Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentAdminRole());
        return roles;
    }
    
}
