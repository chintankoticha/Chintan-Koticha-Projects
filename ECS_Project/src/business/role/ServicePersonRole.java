/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import UseInterface.ServicePersonRole.ServicePersonWorkAreaJPanel;
import UserInterface.SalesPersonRole.SalesPersonWorkAreaJPanel;
import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.ServicePersonOrganization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Siddhant
 */
public class ServicePersonRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ServicePersonWorkAreaJPanel(userProcessContainer, account, (ServicePersonOrganization)organization, business);
    }
    
}
