/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import business.consumer.Customer;
import business.organization.ServiceReceptionistOrganization;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Siddhant
 */
public class CustomerServiceSchedulingJPanel extends javax.swing.JPanel {

    JPanel upc;
    EcoSystem system;
    private Customer customer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    int seletedFlag = 0;
    WorkRequest workRequest;

    /**
     * Creates new form CustomerOrderSchedulingJPanel
     */
    public CustomerServiceSchedulingJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem system, Customer customer, WorkRequest wr) {
        initComponents();
        this.upc = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        this.customer = customer;
        seletedFlag = 0;
        this.workRequest = wr;
        populateTree();

        Calendar calendar = scheduleDate.getMonthView().getCalendar();
        calendar.setTime(new Date());
        scheduleDate.getMonthView().setLowerBound(calendar.getTime());
    }

    public void populateTree() {
        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();
        ArrayList<Network> networkList = system.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;

        Network network;
        Enterprise enterprise;
        Organization organization;

        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;

        DefaultMutableTreeNode organizationNode;

        for (int i = 0; i < networkList.size(); i++) {
            network = networkList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);

            enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();

            for (int j = 0; j < enterpriseList.size(); j++) {
                enterprise = enterpriseList.get(j);
                enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);

                organizationList = enterprise.getOrganizationDirectory().getOrganizationList();

                for (int k = 0; k < organizationList.size(); k++) {
                    organization = organizationList.get(k);
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
        model.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        scheduleDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        timeCmbBox = new javax.swing.JComboBox<>();
        scheduleAppointmentBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        selectedEnterpriseJLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTree1);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jTree);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 85, 235, 275));
        add(scheduleDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 123, 139, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setText("Schedule Visit Date:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 123, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Schedule Time:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 163, 115, 20));

        timeCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "10:00AM", "10:30AM", "11:00AM", "11:30AM", "12:00AM", "12:30AM", "1:00PM", "1:30PM", "2:00PM", "2:30PM", "3:00PM", "3:30PM", "4:00PM", "4:30PM", "5:00PM", "5:30PM", "6:00PM", "6:30PM", "7:00PM" }));
        add(timeCmbBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 163, 139, -1));

        scheduleAppointmentBtn.setText("Schedule Appointment");
        scheduleAppointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleAppointmentBtnActionPerformed(evt);
            }
        });
        add(scheduleAppointmentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 201, -1, -1));

        backBtn.setText("<< BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 201, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Enterprise Selected:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 85, -1, 20));

        selectedEnterpriseJLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        selectedEnterpriseJLabel.setText("selected_enterprise");
        add(selectedEnterpriseJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 85, 139, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Customer Servicing Schedule");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 47, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    

    private void scheduleAppointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleAppointmentBtnActionPerformed
        // TODO add your handling code here:
        int hourOfDay;
        boolean flag = true;
         DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date1 = new Date();
        try {
            date1 = dateFormat.parse(dateFormat.format(date1));
            hourOfDay = date1.getHours();
            //System.out.println(hourOfDay);
        } catch (Exception e) {
            System.out.println("Parsing Error of date!!!");
            flag = false;
        }
        if (seletedFlag == 0) {
            JOptionPane.showMessageDialog(this, "Selection of Enterprise(Retailer Type) Node is a manadate!!");
            flag = false;
            return;
        } else if (selectedEnterpriseJLabel.getText().equals("JTree")) {
            JOptionPane.showMessageDialog(this, "Selection of Enterprise(Retailer Type) Node is a manadate!!");
            flag = false;
            return;
        } else {
            for (Network network : system.getNetworkList()) {
                if (network.getName().equals(selectedEnterpriseJLabel.getText()) || selectedEnterpriseJLabel.getText().equals("Networks")) {
                    JOptionPane.showMessageDialog(this, "Selection of Enterprise(Retailer Type) Node is a manadate!!");
                    flag = false;
                    return;
                }
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.getName().equals(selectedEnterpriseJLabel.getText())) {
                        if (enterprise.getEnterpriseType().getValue().equals("Retailer")) {
                            Date date;
                            try {
                                date = scheduleDate.getDate();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(this, "Select a date before scheduling!!!");
                                flag = false;
                                return;
                            }
                            String time = timeCmbBox.getSelectedItem().toString();
                            if (time.equals("---")) {
                                JOptionPane.showMessageDialog(this, "Select a time slot before scheduling!!!");
                                flag = false;
                            }

                            Component[] componentArray = upc.getComponents();
                            Component component = componentArray[componentArray.length - 1];
                            
                            if(component.getClass().getName().equals("CustomerMessageJPanel")){
                           // if (component instanceof CustomerMessageJPanel) {
                                CustomerMessageJPanel customerMessageJPanel = (CustomerMessageJPanel) component;
                                customerMessageJPanel.removeRow(workRequest);
                            }
                            
                            WorkRequest request = new WorkRequest();
                            //request.setMessage(message);
                            request.setScheduleDate(date);
                            request.setScheduleTime(time);
                            request.setCustomer(customer);
                            request.setSender(userAccount);
                            request.setStatus("Sent");

                            Organization org = null;
                            for (Network network1 : system.getNetworkList()) {
                                for (Enterprise enterprise1 : network1.getEnterpriseDirectory().getEnterpriseList()) {
                                    if (enterprise1.getName().equals(selectedEnterpriseJLabel.getText())) {
                                        for (Organization organization1 : enterprise1.getOrganizationDirectory().getOrganizationList()) {
                                            if (organization1 instanceof ServiceReceptionistOrganization) {
                                                org = organization1;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }

                            if (org != null) {
                                org.getWorkQueue().getWorkRequestList().add(request);
                                userAccount.getWorkQueue().getWorkRequestList().add(request);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Selection of Enterprise(Retailer Type) Node is a manadate!!");
                            flag = false;
                            return;
                        }
                    } else {
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (organization.getName().equals(selectedEnterpriseJLabel.getText().toString())) {
                                JOptionPane.showMessageDialog(this, "Selection of Enterprise(Retailer Type) Node is a manadate!!");
                                flag = false;
                                return;
                            }
                        }
                    }
                }
            }
        }
        if(flag)
        JOptionPane.showMessageDialog(this,"Appointment is successfully scheduled !!!");
    }//GEN-LAST:event_scheduleAppointmentBtnActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged
        // TODO add your handling code here:
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            seletedFlag = 1;
            selectedEnterpriseJLabel.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_backBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton scheduleAppointmentBtn;
    private org.jdesktop.swingx.JXDatePicker scheduleDate;
    private javax.swing.JLabel selectedEnterpriseJLabel;
    private javax.swing.JComboBox<String> timeCmbBox;
    // End of variables declaration//GEN-END:variables
}
