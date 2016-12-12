/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.consumer.Customer;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.role.SystemAdminRole;
import business.useraccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Chintan
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;

    private EcoSystem() {
        super(null);
        networkList = new ArrayList();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
        
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        for (UserAccount ua : this.getUserAccountDirectory().getUserAccountList()) {
            // System.out.println("EcoSystem" + ua.getUsername());
            if (ua.getUsername().equals(username)) {
                return false;
            }
            for (Network n : this.getNetworkList()) {
                for (Enterprise ent : n.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserAccount ucc : ent.getUserAccountDirectory().getUserAccountList()) {
                        //           System.out.println("Enterprise-->" + ucc.getUsername());
                        if (ucc.getUsername().equals(username)) {
                            return false;
                        }
                        for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount accOrg : org.getUserAccountDirectory().getUserAccountList()) {
                                //                 System.out.println("Organization-->" + accOrg.getUsername());
                                if (accOrg.getUsername().equals(username)) {
                                    return false;
                                }
                            }

                        }
                    }

                }
            }

        } 
        return true;
    }

}