/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;


import UserInterface.SalesPersonRole.SalesPersonWorkAreaJPanel;
import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.SalesPersonOrganization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Siddhant
 */
public class SalesPersonRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SalesPersonWorkAreaJPanel(userProcessContainer, account, (SalesPersonOrganization)organization,enterprise, business);
    }
    
}
