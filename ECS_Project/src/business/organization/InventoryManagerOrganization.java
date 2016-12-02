/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.InsuranceManagerRole;
import business.role.InventoryManagerRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public class InventoryManagerOrganization extends Organization {
    
    public InventoryManagerOrganization() {
        super(Organization.Type.InventoryManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InventoryManagerRole());
        return roles;
    }
    
}
