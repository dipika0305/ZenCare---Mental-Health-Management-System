/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BillGeneratorRole;

import model.EcoSys;
import model.Enterprise.Enterprise;
import model.Graph;
import model.MailNew;
import model.Organization.OrgAllocating;
import model.Organization.OrgBillings;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import model.WorkQueue.BillingWorkRequest;
import model.WorkQueue.GranterWorkRequest;
import model.WorkQueue.PatientWorkRequest;
import model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFrame;
import userinterface.AdministrativeRole.PatientInfoJPanel;

/**
 *
 * @author Vidhi
 */
public class BillGeneratorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSys business;
    private UserAccount userAccount;
    private OrgBillings billOrganization;
    private Enterprise enterprise;
    private Organization organization;
    HashMap<String, Integer> m;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public BillGeneratorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSys business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.billOrganization = (OrgBillings) organization;
        this.enterprise = enterprise;
        this.organization = organization;
        valueLabel.setText(enterprise.getName());
        refreshTables();
    }

    private void refreshTables() {
        populateTable();
        populateTable2();
        populateTable3();
        processingjCheckBox.setEnabled(true);
        processingjCheckBox.setSelected(false);
        pendingClaimsjCheckBox1.setEnabled(true);
        pendingClaimsjCheckBox1.setSelected(false);
        pendingjCheckBox.setEnabled(true);
        pendingjCheckBox.setSelected(false);
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable2.getModel();

        model.setRowCount(0);

        for (WorkRequest request : billOrganization.getWorkQueue().getWorkRequestList()) {

            if (request.getType() != null) {
                if (request.getType().equals("Patient") && request.getBillReciever() == null && request.getForwardrequest() == null) {
                    Object[] row = new Object[5];
                    row[0] = request;
                    row[1] = request.getSender().getEmployee().getName();
                    row[2] = request.getBillReciever() == null ? null : request.getReceiver().getEmployee().getName();
                    row[3] = ((PatientWorkRequest) request).getBillstatus();
                    row[4] = ((PatientWorkRequest) request).getBillamount();
                    model.addRow(row);
                }
            }
        }
    }

    public void populateTable2() {
        DefaultTableModel model = (DefaultTableModel) userWorkRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : billOrganization.getWorkQueue().getWorkRequestList()) {
            if (request.getType() != null) {
                if (request.getType().equals("Patient") && request.getBillReciever() != null && request.getBillReciever().equals(userAccount) && request.getForwardrequest() == null) {

                    Object[] row = new Object[5];
                    row[0] = request;
                    row[1] = request.getSender().getEmployee().getName();
                    row[2] = request.getBillReciever();
                    row[3] = ((PatientWorkRequest) request).getBillstatus();
                    row[4] = ((PatientWorkRequest) request).getBillamount();

                    model.addRow(row);
                }
            }
        }
    }

    public void populateTable3() {
        DefaultTableModel model = (DefaultTableModel) updatedRequestJTable1.getModel();

        model.setRowCount(0);

        for (WorkRequest request : billOrganization.getWorkQueue().getWorkRequestList()) {
            //System.out.println(request.getReceiver()+" " +request.getType()+ " user");
            if (request.getType() != null) {
                if (request.getType().equals("Patient") && request.getForwardrequest() != null) {
                    Object[] row = new Object[7];
                    row[0] = request;
                    row[1] = request.getSender();
                    row[2] = request.getPatient();
                    row[3] = ((BillingWorkRequest) request).getClaimstatus();
                    row[4] = ((BillingWorkRequest) request).getAmountApproved();
                    row[5] = request.getForwardrequest();
                    row[6] = request.getBill();
                    
                    model.addRow(row);
                }
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        userWorkRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        updatedRequestJTable1 = new javax.swing.JTable();
        pendingjCheckBox = new javax.swing.JCheckBox();
        processingjCheckBox = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        pendingClaimsjCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestJTable2 = new javax.swing.JTable();
        submitRequests = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        processedClaims = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userWorkRequestJTable.setFont(new java.awt.Font("Perpetua Titling MT", 0, 13)); // NOI18N
        userWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Sender", "Receiver", "Status", "BillingAmount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userWorkRequestJTable);
        if (userWorkRequestJTable.getColumnModel().getColumnCount() > 0) {
            userWorkRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            userWorkRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            userWorkRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            userWorkRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            userWorkRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 490, 96));

        assignJButton.setBackground(new java.awt.Color(255, 255, 255));
        assignJButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, -1, -1));

        processJButton.setBackground(new java.awt.Color(255, 255, 255));
        processJButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        refreshJButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshJButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        valueLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        valueLabel.setToolTipText("");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        updatedRequestJTable1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 13)); // NOI18N
        updatedRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Pt Name", "Status", "Amount Approved", "To Govt.", "UpdatedBill"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(updatedRequestJTable1);
        if (updatedRequestJTable1.getColumnModel().getColumnCount() > 0) {
            updatedRequestJTable1.getColumnModel().getColumn(0).setResizable(false);
            updatedRequestJTable1.getColumnModel().getColumn(1).setResizable(false);
            updatedRequestJTable1.getColumnModel().getColumn(2).setResizable(false);
            updatedRequestJTable1.getColumnModel().getColumn(3).setResizable(false);
            updatedRequestJTable1.getColumnModel().getColumn(4).setResizable(false);
            updatedRequestJTable1.getColumnModel().getColumn(5).setResizable(false);
            updatedRequestJTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 590, 96));

        pendingjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        pendingjCheckBox.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        pendingjCheckBox.setText("Pending Request");
        pendingjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendingjCheckBoxActionPerformed(evt);
            }
        });
        add(pendingjCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        processingjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        processingjCheckBox.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        processingjCheckBox.setText("Processing Request");
        processingjCheckBox.setToolTipText("");
        processingjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processingjCheckBoxActionPerformed(evt);
            }
        });
        add(processingjCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jButton1.setText("Filter ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, -1, -1));

        pendingClaimsjCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        pendingClaimsjCheckBox1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        pendingClaimsjCheckBox1.setText("Pending in Claims");
        pendingClaimsjCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendingClaimsjCheckBox1ActionPerformed(evt);
            }
        });
        add(pendingClaimsjCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, -1, -1));

        workRequestJTable2.setFont(new java.awt.Font("Perpetua Titling MT", 0, 13)); // NOI18N
        workRequestJTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Sender", "Receiver", "Status", "BillingAmount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(workRequestJTable2);
        if (workRequestJTable2.getColumnModel().getColumnCount() > 0) {
            workRequestJTable2.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable2.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable2.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable2.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 490, 96));

        submitRequests.setBackground(new java.awt.Color(255, 255, 255));
        submitRequests.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        submitRequests.setText("Submit  Requests");
        submitRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRequestsActionPerformed(evt);
            }
        });
        add(submitRequests, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 530, -1, -1));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel1.setText("MY CLAIMS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel2.setText("INCOMING BILLLING REQUEST");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        processedClaims.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        processedClaims.setText("VIEW PROCESSED CLAIMS ");
        add(processedClaims, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 380, 190, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable2.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {

            PatientWorkRequest request = (PatientWorkRequest) workRequestJTable2.getValueAt(selectedRow, 0);
            request.setBillReciever(userAccount);
            request.setBillstatus("Pending");
            request.setForwardrequest(null);
            JOptionPane.showMessageDialog(null, "Assigned");

            refreshTables();
        }
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = userWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }else {

            PatientWorkRequest request = (PatientWorkRequest) userWorkRequestJTable.getValueAt(selectedRow, 0);

//            if
//                    (request.getBillstatus().equals("pending in claims")){
//                    JOptionPane.showMessageDialog(null, "Already processed by you!!");
//                    return;
//            }
//            else
//            {
                request.setBillstatus("processing");


                ProcessWorkRequestJPanel11 processWorkRequestJPanel = new ProcessWorkRequestJPanel11(userProcessContainer, request, userAccount,billOrganization, enterprise,business);
                userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);

                refreshTables();
            //}
            
        }


    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        refreshTables();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String type = new String();

        if (pendingjCheckBox.isSelected() == false && processingjCheckBox.isSelected() == false && pendingClaimsjCheckBox1.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Please select a checkbox to Filter");
            return;
        } else if (pendingjCheckBox.isSelected()) {
            type = "Pending";
        } else if (processingjCheckBox.isSelected()) {
            type = "processing";
        } else if (pendingClaimsjCheckBox1.isSelected()) {
            type = "pending in claims";
        } else {
            JOptionPane.showMessageDialog(null, "Please select 1 filter only!!");
            return;
        }

        filterpopulateTable(type);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void submitRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitRequestsActionPerformed

        int selectedRow = updatedRequestJTable1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Claims Already processed!!", "Warning", JOptionPane.WARNING_MESSAGE);
        

//
//            if (request.getClaimstatus().equals("Claim Rejected") || request.getAmountApproved() == 0) {
//
//                GranterWorkRequest grantrequest = new GranterWorkRequest();
//
//                //grantrequest.setMessage(message);
//                grantrequest.setSender(userAccount);
//                grantrequest.setGrantingstatus("pending");
//                grantrequest.setGrantreceiver(null);
//                grantrequest.setType("patient");
//                grantrequest.setPatient(request.getPatient());
//                //converting bill amount
//                try {
//                    grantrequest.setGrantingAmount(Float.parseFloat(request.getBill()));
//                } catch (Exception ex) {
//                    JOptionPane.showMessageDialog(null, "error in amount recieved");
//                    return;
//                }
//
//                Organization org = null;
//                for (Organization organization : business.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(1).getOrganizationDirectory().getOrganizationList()) {
//                    if (organization instanceof AllocatingOrganization) {
//                        org = organization;
//                        break;
//                    }
//                }
//                if (org != null) {
//                    org.getWorkQueue().getWorkRequestList().add(grantrequest);
//                    //userAccount.getWorkQueue().getWorkRequestList().add(request);
//                }
//                JOptionPane.showMessageDialog(null, "Request sent to Govt for funds");
//            }
//            else if (request.getClaimstatus().equals("Claim Approved")) {
//                for (WorkRequest requests1 : billOrganization.getWorkQueue().getWorkRequestList()) {
//                    for (WorkRequest requests2 : billOrganization.getWorkQueue().getWorkRequestList()) {
//                        if (requests1.getPatient().equals(requests2.getPatient())) {
//                            ///update the amount
//                        }
//                    }
//                }
//
//            }if (request.getClaimstatus().equals("Claim Rejected") || request.getAmountApproved() == 0) {
//
//                GranterWorkRequest grantrequest = new GranterWorkRequest();
//
//                //grantrequest.setMessage(message);
//                grantrequest.setSender(userAccount);
//                grantrequest.setGrantingstatus("pending");
//                grantrequest.setGrantreceiver(null);
//                grantrequest.setType("patient");
//                grantrequest.setPatient(request.getPatient());
//                //converting bill amount
//                try {
//                    grantrequest.setGrantingAmount(Float.parseFloat(request.getBill()));
//                } catch (Exception ex) {
//                    JOptionPane.showMessageDialog(null, "error in amount recieved");
//                    return;
//                }
//
//                Organization org = null;
//                for (Organization organization : business.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(1).getOrganizationDirectory().getOrganizationList()) {
//                    if (organization instanceof AllocatingOrganization) {
//                        org = organization;
//                        break;
//                    }
//                }
//                if (org != null) {
//                    org.getWorkQueue().getWorkRequestList().add(grantrequest);
//                    //userAccount.getWorkQueue().getWorkRequestList().add(request);
//                }
//                JOptionPane.showMessageDialog(null, "Request sent to Govt for funds");
//            }
//            else if (request.getClaimstatus().equals("Claim Approved")) {
//                for (WorkRequest requests1 : billOrganization.getWorkQueue().getWorkRequestList()) {
//                    for (WorkRequest requests2 : billOrganization.getWorkQueue().getWorkRequestList()) {
//                        if (requests1.getPatient().equals(requests2.getPatient())) {
//                            ///update the amount
//                        }
//                    }
//                }
//
//            }
            
//            try {
//                sendemailto();
//            } catch (Exception ex) {
//                Logger.getLogger(BillGeneratorWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }

        refreshTables();
        // TODO add your handling code here:
    }//GEN-LAST:event_submitRequestsActionPerformed
//    public void sendemailto() throws Exception {
//        //MailClass mailclass=new MailClass(txtemail.getText(),"You are registered to Brigham Hospital","Registeration-Brigham");
//        // mailclass.sendmail();
//        PatientInfoJPanel p = null;
//        String text = p.returnMail();
//        String name = p.returnName();
//        MailNew m = new MailNew(text, name + " , Your bill is being processed", "");
//    }
    private void pendingjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendingjCheckBoxActionPerformed
        processingjCheckBox.setEnabled(false);
        pendingClaimsjCheckBox1.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_pendingjCheckBoxActionPerformed

    private void processingjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processingjCheckBoxActionPerformed
        pendingClaimsjCheckBox1.setEnabled(false);
        pendingjCheckBox.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_processingjCheckBoxActionPerformed

    private void pendingClaimsjCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendingClaimsjCheckBox1ActionPerformed
        processingjCheckBox.setEnabled(false);
        pendingjCheckBox.setEnabled(false);  // TODO add your handling code here:
    }//GEN-LAST:event_pendingClaimsjCheckBox1ActionPerformed

//    public HashMap<String, Integer> createHashMap() {
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
//            if (request.getType() != null) {
//                if (request.getType().equals("Patient") && request.getReceiver() != null && request.getForwardrequest() != null) //&& request.getReceiver().equals(userAccount))
//                {
//                    /////////approved claims and rejected claims are filtered by this forward_request
//                    String key = request.getForwardrequest();
//                    System.out.println(key);
//                    if (request.getForwardrequest() != null) {
//                        map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
//                    }
//                }
//                //}
//            }
//        }
//        return map;
//    }

//    public void createPiechart(HashMap<String, Integer> m) {
//        Graph g = new Graph();
//        ChartFrame c
//                = g.create(m);
//       // JFrame frame = new JFrame();
//
//        JPanel imgPanel = new JPanel();
//
//        imgPanel.add(c);
//        imgPanel.setVisible(true);
//        add(imgPanel);
//
//    }


    public void filterpopulateTable(String type) {
        DefaultTableModel model = (DefaultTableModel) userWorkRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : billOrganization.getWorkQueue().getWorkRequestList()) {

            if (request.getType() != null) {
                if (request.getType().equals("Patient") && request.getBillReciever() != null && request.getBillReciever().equals(userAccount) && request.getForwardrequest() == null) {

                    if (((PatientWorkRequest) request).getBillstatus().equals(type)) {
                        Object[] row = new Object[5];
                        row[0] = request;
                        row[1] = request.getSender().getEmployee().getName();
                        row[2] = request.getBillReciever();
                        row[3] = ((PatientWorkRequest) request).getBillstatus();
                        row[4] = ((PatientWorkRequest) request).getBillamount();
                        model.addRow(row);
                    }

                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox pendingClaimsjCheckBox1;
    private javax.swing.JCheckBox pendingjCheckBox;
    private javax.swing.JButton processJButton;
    private javax.swing.JLabel processedClaims;
    private javax.swing.JCheckBox processingjCheckBox;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton submitRequests;
    private javax.swing.JTable updatedRequestJTable1;
    private javax.swing.JTable userWorkRequestJTable;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable2;
    // End of variables declaration//GEN-END:variables
}
