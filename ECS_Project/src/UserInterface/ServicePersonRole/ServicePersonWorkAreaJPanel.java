/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ServicePersonRole;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.market.Product;
import business.market.ProductCategory;
import business.organization.ServicePersonOrganization;
import business.useraccount.UserAccount;
import business.workqueue.ServicePersonProductRequest;
import business.workqueue.ServicePersonWorkRequest;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Siddhant
 */
public class ServicePersonWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private ServicePersonOrganization servicePersonOrganization;
    private Enterprise enterprise;
    private ProductCategory productCategory;

    /**
     * Creates new form ServicePersonWorkAreaJPanel
     */
    public ServicePersonWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ServicePersonOrganization servicePersonOrganization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = system;
        this.enterprise = enterprise;
        this.servicePersonOrganization = servicePersonOrganization;
        productCategory = new ProductCategory();
        populateTable();
        populateComboBox();
        populateRequestTable();
    }

    public void populateComboBox() {
        productsComboBox.removeAllItems();
        //for(Product product:productCategory.getProductList())
           /*Product product = new Product();
        
         product=productCategory.addProduct();
         product.setProductName("air filter");
         product.getServiceInventory().setCount(11);
         productsComboBox.addItem(product);
         Product product1 = new Product();
         product1=productCategory.addProduct();
         product1.getServiceInventory().setCount(10);          
         product1.setProductName("turbo charger");
         productsComboBox.addItem(product1);
         Product product3 = new Product();
         product3=productCategory.addProduct();
         product3.getServiceInventory().setCount(10);
            
         product3.setProductName("diesel/petrol filer");
         productsComboBox.addItem(product3);
         Product product5 = new Product();
         product5=productCategory.addProduct();
         product5.getServiceInventory().setCount(10);
         product5.setProductName("inter-cooler");
         productsComboBox.addItem(product5);
           
         Product product7 = new Product();
         product7=productCategory.addProduct();
         product7.setProductName("worn injectors");
         product7.getServiceInventory().setCount(10);
         productsComboBox.addItem(product7);
            
         Product product8 = new Product();
         product8=productCategory.addProduct();
         product8.setProductName("EGR valves");
         product8.getServiceInventory().setCount(10);
         productsComboBox.addItem(product8);
         *//*
         if(productsComboBox.getSelectedIndex()==1)
         {
         int number=product.getServiceInventory().getCount();
         countTxtField.setText(String.valueOf(number));
         }*/

        productsComboBox.addItem("---");
        for (Product product : enterprise.getProductCatalog().getProductList()) {
            productsComboBox.addItem(product);

        }
    }

    public void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel) workRequestJTable2.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((ServicePersonProductRequest) request).getRequestResult();
            row[3] = result == null ? "Waiting" : result;

            model.addRow(row);
        }
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : servicePersonOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getFirstName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getFirstName();
            row[3] = request.getStatus();

            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        productsComboBox = new javax.swing.JComboBox<Object>();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestJTable2 = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        productsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---products---" }));
        productsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsComboBoxActionPerformed(evt);
            }
        });

        workRequestJTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(workRequestJTable2);

        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(assignJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(processJButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshJButton))
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(productsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(refreshJButton)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignJButton)
                    .addComponent(processJButton))
                .addGap(69, 69, 69)
                .addComponent(productsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(requestTestJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        request.setCustomer(request.getCustomer());
        populateTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Select a row first!!");
            return;
        }
//        else if (productsComboBox.getSelectedIndex()<0)
//        {
//            JOptionPane.showMessageDialog(this,"Select a product first!!");
//            return;
//            
//        }

        if (!productsComboBox.getSelectedItem().equals("---")) {
            // JOptionPane.showMessageDialog(null,"please select a product first!!!");

            Product product = new Product();
            try {

                product = (Product) productsComboBox.getSelectedItem();
            } catch (Exception e) {

            }
              int count = product.getServiceInventory().getCount();
            if (product.getServiceInventory().getCount() > 45) {
                ServicePersonWorkRequest request = (ServicePersonWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

                /*for (Network network : business.getNetworkList()) {
                 for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                 if (enterprise.equals(request.getEnterpriseName())) {
                 enterprise1 = enterprise;
                 break;
                 }
                 }
                 }*/
                request.setStatus("Processing");
                request.setCustomer(request.getCustomer());
                count--;
                System.out.println(count);
                product.getServiceInventory().setCount(count);

                ServicePersonProcessWorkRequestJPanel processWorkRequestJPanel = new ServicePersonProcessWorkRequestJPanel(userProcessContainer,enterprise, request);
                userProcessContainer.add("ServicePersonProcessWorkRequestJPanel", processWorkRequestJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                userProcessContainer.add("RequestLabTestJPanel", new RequestProductJPanel(userProcessContainer, userAccount, enterprise, business));
                layout.next(userProcessContainer);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a product first!!!");
    }//GEN-LAST:event_processJButtonActionPerformed

    }

    private void productsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productsComboBoxActionPerformed

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        if (productsComboBox.getSelectedItem().equals("---")) {
            JOptionPane.showMessageDialog(null, "please select a product first!!!");
        }
        Product product = new Product();
        product = (Product) productsComboBox.getSelectedItem();
        int count = product.getServiceInventory().getCount();
        //for(Product p:enterprise.getProductCatalog().getProductList())

        if (product.getServiceInventory().getCount() > 0) {
            JOptionPane.showMessageDialog(this, "lets code");
            System.out.println(product.getServiceInventory().getCount());
            System.out.println(product.getProductName());
            count--;
            System.out.println(count);

        } else {

            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("RequestLabTestJPanel", new RequestProductJPanel(userProcessContainer, userAccount, enterprise, business));
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton processJButton;
    private javax.swing.JComboBox<Object> productsComboBox;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable workRequestJTable;
    private javax.swing.JTable workRequestJTable2;
    // End of variables declaration//GEN-END:variables
}
