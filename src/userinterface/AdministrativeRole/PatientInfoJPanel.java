/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import model.EcoSys;
import model.Enterprise.Enterprise;
import model.MailNew;
import model.Organization.OrgDoctor;
import model.Organization.OrgNurse;
import model.Organization.Organization;
import model.WorkQueue.PatientWorkRequest;
import model.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Organization.OrgBillings;
import java.awt.CardLayout;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/**
 *
 * @author Vidhi
 */
public class PatientInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientInfoJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private  EcoSys business; 
    public PatientInfoJPanel(JPanel userProcessContainer,Enterprise enterprise, EcoSys business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise=enterprise;
        this.business=business;
        populateTable();
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : enterprise.getOrganizationDirectory().getOrganizationList().get(0).getWorkQueue().getWorkRequestList()){
             if(request.getType()!=null)
             {if(request.getType().equals("Patient"))
             { Object[] row = new Object[9];
            
            String result = ((PatientWorkRequest) request).getPatientName();
            row[0]=((PatientWorkRequest) request);
            row[1] =result;
            row[2]=request.getReceiver();
             row[3] = request.getStatus();
             if(((PatientWorkRequest) request).getAppointmentTime()!=null)
             row[4]=((PatientWorkRequest) request).getAppointmentTime();
               if(((PatientWorkRequest) request).getBillamount()!=null)
               {
                  row[5]=((PatientWorkRequest) request).getBillamount(); 
               }
               if(((PatientWorkRequest) request).getBillstatus()!=null)
               {
                  row[6]=((PatientWorkRequest) request).getBillstatus(); 
               }
                   if(((PatientWorkRequest) request).getNurseName()!=null)
               {
                  row[7]=((PatientWorkRequest) request).getNurseName(); 
               }
               if(((PatientWorkRequest) request).getRehabStatus()!=null)
               {
                  row[8]=((PatientWorkRequest) request).getRehabStatus(); 
               }
            model.addRow(row);
             }
             }
            //row[1]=enterprise.getOrganizationDirectory().getOrganizationList().get(0).getSupportedRole().contains(row)
        }
    }
  
    
    public void populateTable(ArrayList<WorkRequest> list){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : list){
            if(request.getType()!=null) {
                if(request.getType().equals("Patient")) {
                     Object[] row = new Object[9];
            
                    String result = ((PatientWorkRequest) request).getPatientName();
                    row[0]=((PatientWorkRequest) request);
                    row[1] =result;
                    row[2]=request.getReceiver();
                    row[3] = request.getStatus();
                    if(((PatientWorkRequest) request).getAppointmentTime()!=null)
                        row[4]=((PatientWorkRequest) request).getAppointmentTime();
                    if(((PatientWorkRequest) request).getBillamount()!=null) {
                        row[5]=((PatientWorkRequest) request).getBillamount(); 
                    }
                    if(((PatientWorkRequest) request).getBillstatus()!=null) {
                        row[6]=((PatientWorkRequest) request).getBillstatus(); 
                    }
                    if(((PatientWorkRequest) request).getNurseName()!=null) {
                        row[7]=((PatientWorkRequest) request).getNurseName(); 
                    }
                    if(((PatientWorkRequest) request).getRehabStatus()!=null) {
                        row[8]=((PatientWorkRequest) request).getRehabStatus(); 
                    }
                    model.addRow(row);
                }
            }
        }
    }
  
   private boolean emailRegex()
    {
        
       Pattern p = Pattern.compile("^[a-z0-9](\\.?[a-z0-9]){5,}@g(oogle)?mail\\.com$");
       Matcher m = p.matcher(txtemail.getText());
       boolean c = m.matches();
       return c;

 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        refreshTestJButton = new javax.swing.JButton();
        btnReqBill = new javax.swing.JButton();
        btnRehab = new javax.swing.JButton();
        label2 = new java.awt.Label();
        cardno = new javax.swing.JTextField();
        cardholder = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        statesJComboBox = new javax.swing.JComboBox();
        label3 = new java.awt.Label();
        btnSearch = new javax.swing.JButton();
        txtPatient = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 140, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage_pat.png"))); // NOI18N
        jLabel1.setText("PATIENT INFORMATION");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 350, 30));

        txtAge.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 140, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Age");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("State");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        btnSubmit.setBackground(new java.awt.Color(0, 153, 153));
        btnSubmit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Register");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 110, -1));

        workRequestJTable.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Work Request", "Patient", "Doctor", "Status", "Appointment Time", "Bill Amount", "Bill Status", "Nurse", "Rehab Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(5).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(6).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(7).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(8).setResizable(false);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 950, 110));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("EmailAddress");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        txtemail.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 140, -1));

        refreshTestJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        refreshTestJButton.setForeground(new java.awt.Color(0, 153, 153));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 510, -1, -1));

        btnReqBill.setBackground(new java.awt.Color(0, 153, 153));
        btnReqBill.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnReqBill.setForeground(new java.awt.Color(255, 255, 255));
        btnReqBill.setText("Bill Request");
        btnReqBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqBillActionPerformed(evt);
            }
        });
        add(btnReqBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 710, -1, -1));

        btnRehab.setBackground(new java.awt.Color(0, 153, 153));
        btnRehab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRehab.setForeground(new java.awt.Color(255, 255, 255));
        btnRehab.setText("Rehab Request");
        btnRehab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRehabActionPerformed(evt);
            }
        });
        add(btnRehab, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 710, -1, -1));

        label2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        label2.setText("Insurance Info :");
        add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 145, 20));

        cardno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        add(cardno, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 140, 30));

        cardholder.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        add(cardholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 140, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Insurance Card Number");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, 20));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("Insurance Card Holder");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, 20));

        statesJComboBox.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        statesJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "choose state", "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "WA", "WV", "WI", "WY" }));
        statesJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statesJComboBoxActionPerformed(evt);
            }
        });
        add(statesJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 140, -1));

        label3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        label3.setText("Demographic Info :");
        add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 180, -1));

        btnSearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 153, 153));
        btnSearch.setText("Search Patient");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, -1, -1));

        txtPatient.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        add(txtPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 190, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Back");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 710, 120, -1));

        btnView.setBackground(new java.awt.Color(0, 153, 153));
        btnView.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View Patient");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 710, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        if(txtName.getText().equals("")  || txtName.getText().length()>25)
        { 
            JOptionPane.showMessageDialog(null,"Please enter a valid name!!(Name should not be empty or exceed 25 characters!!)");
            return;
        }else if(statesJComboBox.getSelectedItem().equals("choose state")){
            JOptionPane.showMessageDialog(null,"Please select a state");
            return;
        }
        else if(txtAge.getText().equals(""))
        { 
            JOptionPane.showMessageDialog(null,"Please do not enter an empty age!!");
            return;
            
        }
        
       else if(!emailRegex())
        { 
            JOptionPane.showMessageDialog(null,"Enter a valid email address!!");
            return;
        }
       else if(txtName.getText().equals("")  || txtName.getText().length()>25)
        { 
            JOptionPane.showMessageDialog(null,"Please enter a valid name!!(Name should not be empty or exceed 25 characters!!)");
            return;
        }
       else if (cardno.getText().equals("")|| cardno.getText().length()>10){
                JOptionPane.showMessageDialog(null,"Please enter a valid Card number!!(Card Number should not be empty or exceed 25 characters!!)");
        return;
        }
        else if (cardno.getText().equals("")|| cardno.getText().length()>10){
                JOptionPane.showMessageDialog(null,"Please enter a valid Card number!!(Card Number should not be empty or exceed 25 characters!!)");
        return;
        }
        else  if (cardholder.getText().equals("")|| cardholder.getText().length()>25){
                JOptionPane.showMessageDialog(null,"Please enter a valid Card holder name!!(Card holder name should not be empty or exceed 25 characters!!)");
        return;
        }
        else if (statesJComboBox.getSelectedItem().toString() == "Choose state")
        {
         JOptionPane.showMessageDialog(null,"Please select a state!!)");   
        }
        else {
            try {
            PatientWorkRequest request = new PatientWorkRequest();
        
            request.setSender(enterprise.getUserAccountDirectory().getUserAccountList().get(0));
            request.setStatus("Sent");
            request.setEmail(txtemail.getText());
            request.setState(statesJComboBox.getSelectedItem().toString());
            request.setPatientName(txtName.getText());
            request.setAge(txtAge.getText());
            request.setPatientState(statesJComboBox.getSelectedItem().toString());
            request.setType("Patient");
        
            //converting into big int 
            BigInteger bigIntegerStr=new BigInteger(cardno.getText());
            request.setCardnumber(bigIntegerStr);
        
            request.setCardHolder(cardholder.getText());
        
            Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                if (organization instanceof OrgDoctor){
                    org = organization;
                    break;
                }
            }
            if (org!=null){
                org.getWorkQueue().getWorkRequestList().add(request);
            }
            JOptionPane.showMessageDialog(null,"Registration Completed!");
            
            try {
                sendemailto();
            } catch (Exception ex) {
                Logger.getLogger(PatientInfoJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            }
            catch (Exception ex){
                JOptionPane.showMessageDialog(null, "There is a problem with registration! ");
            }
        }
        txtName.setText("");
        txtAge.setText("");
        txtemail.setText("");
        cardno.setText("");
        cardholder.setText("");

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        populateTable();
        txtPatient.setText("");
        txtName.setText("");
        txtAge.setText("");
        txtemail.setText("");
        cardno.setText("");
        cardholder.setText("");

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnReqBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqBillActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row to proceed");
            return;
        }
        else{
        PatientWorkRequest request = (PatientWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
       
        request.setBillstatus("pending in Bill.Dept");
       
        request.setType("Patient");
        request.setBillReciever(null);
        request.setForwardrequest(null);
        request.setSender(enterprise.getUserAccountDirectory().getUserAccountList().get(0));

        if(request.getBillamount()!=null)
        {request.setBillstatus("waiting");
         Organization org = null;
                  
         for(Organization organization : business.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(2).getOrganizationDirectory().getOrganizationList()){
             
       // for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof OrgBillings){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            //System.out.println(request.getReceiver());
        }

        JOptionPane.showMessageDialog(null, "Request Sent to billing");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No bill amount");
        }
        }
        txtName.setText("");
        txtAge.setText("");
        txtemail.setText("");
        cardno.setText("");
        cardholder.setText("");
    }//GEN-LAST:event_btnReqBillActionPerformed

    private void btnRehabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRehabActionPerformed
        
       int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row to proceed");
            return;
        }
            
        PatientWorkRequest request = (PatientWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setRehabStatus("Pending");
        request.setType("Patient");
        request.setNurseReciever(null);
        request.setPatient(request.getPatientName());
        request.setSender(enterprise.getUserAccountDirectory().getUserAccountList().get(0));

        
         Organization org = null;
        for(Organization organization : business.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(3).getOrganizationDirectory().getOrganizationList()){
            
            if (organization instanceof OrgNurse){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
        }
        JOptionPane.showMessageDialog(null, "Request sent to rehab!");
        
    }//GEN-LAST:event_btnRehabActionPerformed

    private void statesJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statesJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statesJComboBoxActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
             
      if(txtPatient.getText().isEmpty())
             JOptionPane.showMessageDialog(null, "Please enter Patient Name to filter!");
    
      else
       {
       ArrayList<WorkRequest> List=enterprise.getOrganizationDirectory().getOrganizationList().get(0).getWorkQueue().getFilteredListbyName(txtPatient.getText());
  
        populateTable(List);
       }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
          int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row to proceed");
            return;
        }
        else{
            PatientWorkRequest request = (PatientWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
            txtAge.setText(request.getAge());
            txtemail.setText(request.getEmail());
            txtName.setText(request.getPatientName());
            cardholder.setText(request.getCardHolder());
            cardno.setText(request.getCardnumber().toString());
            statesJComboBox.setSelectedItem(request.getState());
            
        }
        
    }//GEN-LAST:event_btnViewActionPerformed
    
    public void sendemailto() throws Exception{
        MailNew m = new MailNew(txtemail.getText(),"Welcome to "+ enterprise.getName(),"ZenCare welcomes you.");
        MailNew m1 = new MailNew("janedoezencare@gmail.com","Attention!-New Patient: "+ txtPatient.getText(),"New patient needs immediate attention. Please login to ZENCARE.");

    }

    public String returnMail() {
        return txtemail.getText();
    }
    public String returnName() {
        return txtName.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRehab;
    private javax.swing.JButton btnReqBill;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnView;
    private javax.swing.JTextField cardholder;
    private javax.swing.JTextField cardno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JComboBox statesJComboBox;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatient;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
