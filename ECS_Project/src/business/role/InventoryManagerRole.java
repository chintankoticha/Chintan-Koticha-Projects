/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import UserInterface.InventoryManagerRole.InventoryManagerWorkAreaJPanel;
import UserInterface.InsuranceManagerRole.InsuranceManagerWorkAreaJPanel;
import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.InsuranceManagerOrganization;
import business.organization.InventoryManagerOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Siddhant
 */
public class InventoryManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InventoryManagerWorkAreaJPanel(userProcessContainer, account, (InventoryManagerOrganization)organization, enterprise,business);
    }
    
}
