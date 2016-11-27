/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;
import business.role.Role;
import business.role.SalesReceptionistRole;
import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public class SalesReceptionistOrganization extends Organization {
    
    public SalesReceptionistOrganization() {
        super(Organization.Type.SalesReceptionist.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SalesReceptionistRole());
        return roles;
    }
    
}
