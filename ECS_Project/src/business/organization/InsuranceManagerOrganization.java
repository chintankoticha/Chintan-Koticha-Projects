/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.InsuranceManagerRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public class InsuranceManagerOrganization extends Organization {
    
    public InsuranceManagerOrganization() {
        super(Organization.Type.InsuranceManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceManagerRole());
        return roles;
    }
    
}
