/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import model.EcoSys;
import model.Graph;
import model.Enterprise.Enterprise;
import model.Organization.OrgDoctor;
import model.UserAccount.UserAccount;
import model.WorkQueue.LabTestWorkRequest;
import model.WorkQueue.MedicineWorkRequest;
import model.WorkQueue.DiseaseWorkRequest;
import model.WorkQueue.PatientWorkRequest;
import model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFrame;

/**
 *
 * @author dipikam
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private OrgDoctor organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSys business;
    private String patientname;
    HashMap<String,Integer> m;
    HashMap<String,Integer> m1;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, OrgDoctor organization, Enterprise enterprise,EcoSys business,String patientname) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business=business;
        this.patientname=patientname;
        valueLabel.setText(enterprise.getName());
        
        populateTable();
        populateRequestTable(patientname);
        populateMedicineRequestTable(patientname);
    }
    public HashMap<String,Integer> createHashMap()
    {
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            if(request.getType()!=null)
            {
           if(request.getType().equals("Patient")&& request.getReceiver()!= null) 
 
               //&& request.getReceiver().equals(userAccount))
           {
                     String key=request.getState();
                     System.out.println(key);
                    if(request.getState()!=null)
                    {
                        map.put(key, map.containsKey(key)?map.get(key)+1:1);
                    }
            }
            //}
            //error in line request.getstate data not getting due to null
        }
        }
       return map; 
    }
     public HashMap<String,Integer> createnewHashMap()
            
    {
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            if(request.getType()!=null)
            {
           if(request.getType().equals("Patient")&& request.getReceiver()!= null) 
 
               //&& request.getReceiver().equals(userAccount))
           {
               PatientWorkRequest p=(PatientWorkRequest)request;
                     String key=p.getAge();
                     System.out.println(key);
                    if(p.getAge()!=null)
                    {
                        map.put(key, map.containsKey(key)?map.get(key)+1:1);
                    }
            }
            //}
        }
        }
       return map; 
    }
    public void createPiechart(HashMap<String,Integer> m)
    {
        Graph g=new Graph();
       ChartFrame c= g.create(m);
       // JFrame frame = new JFrame();
        JPanel imgPanel = new JPanel();
            imgPanel.add(c);
            imgPanel.setVisible(true);
            add(imgPanel);
        
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable2.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
           //if(request.getPatient()!=null && request.getPatient().equals(patientname))
           //{
           if(request.getType()!=null && request.getType().equals("Patient"))
           {
           }
           else
           {
           Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            row[4]="";
            model.addRow(row);
           }
           //}
        }
    }
    public void populateRequestTable(String patientname){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            
            if(request.getType().equals("lab"))
            {
                 if(request.getPatient()!=null && request.getPatient().equals(patientname))
                 {
            Object[] row = new Object[5];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((LabTestWorkRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result; 
            row[4]=patientname;
            
            model.addRow(row);
            }
            }
        }
    }

    public void populateMedicineRequestTable(String patientname){
        DefaultTableModel model1 = (DefaultTableModel) workRequestJTable1.getModel();
        
        model1.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
             if(request.getPatient()!=null && request.getPatient().equals(patientname))
             {
            if(request.getType().equals("medicine"))
            {Object[] row = new Object[5];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((MedicineWorkRequest) request).getMedicine();
           row[3] = result == null ? "Waiting" : result;
            row[4]=patientname;
            model1.addRow(row);
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
        workRequestJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        requestMedJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestJTable2 = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        btnDashboard1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result", "Patient Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 440, 97));

        requestTestJButton.setBackground(new java.awt.Color(0, 153, 153));
        requestTestJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 150, -1));

        refreshTestJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        refreshTestJButton.setForeground(new java.awt.Color(0, 153, 153));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 100, 30));

        valueLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 230, 26));

        requestMedJButton.setBackground(new java.awt.Color(0, 153, 153));
        requestMedJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        requestMedJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestMedJButton.setText("Request Medicine");
        requestMedJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestMedJButtonActionPerformed(evt);
            }
        });
        add(requestMedJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, -1));

        workRequestJTable1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        workRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Medicine", "Patient Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane2.setViewportView(workRequestJTable1);
        if (workRequestJTable1.getColumnModel().getColumnCount() > 0) {
            workRequestJTable1.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable1.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable1.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable1.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 440, 97));

        workRequestJTable2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        workRequestJTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Role"
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

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, 440, 96));

        assignJButton.setBackground(new java.awt.Color(0, 153, 153));
        assignJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        assignJButton.setForeground(new java.awt.Color(255, 255, 255));
        assignJButton.setText("ASSIGN TO ME");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 690, -1, -1));

        processJButton.setBackground(new java.awt.Color(0, 153, 153));
        processJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        processJButton.setForeground(new java.awt.Color(255, 255, 255));
        processJButton.setText("PROCESS");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 690, 130, -1));

        backJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(0, 153, 153));
        backJButton.setText("BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 690, -1, -1));

        btnDashboard.setBackground(new java.awt.Color(0, 153, 153));
        btnDashboard.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("View Dashboards by State");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });
        add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        btnDashboard1.setBackground(new java.awt.Color(0, 153, 153));
        btnDashboard1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDashboard1.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard1.setText("View Dashboards by Age");
        btnDashboard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboard1ActionPerformed(evt);
            }
        });
        add(btnDashboard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 210, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        JOptionPane.showMessageDialog(null,"processing!!");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestLabTestJPanel(userProcessContainer, userAccount, enterprise,patientname));
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable(patientname);
        populateMedicineRequestTable(patientname);
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void requestMedJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestMedJButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"processing!!");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        
        userProcessContainer.add("RequestMedicineJPanel", new RequestMedicineJPanel(userProcessContainer, userAccount, enterprise,business,patientname));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestMedJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable2.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row!!");
            return;
        }
JOptionPane.showMessageDialog(null,"Assigned!!");
        WorkRequest request = (WorkRequest)workRequestJTable2.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable2.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row!!");
            
            return;
        }

        DiseaseWorkRequest request = (DiseaseWorkRequest)workRequestJTable2.getValueAt(selectedRow, 0);

        request.setStatus("Processing");
        
        JOptionPane.showMessageDialog(null,"Processing!!");
        ProcessWorkRequestJPanel1 processWorkRequestJPanel = new ProcessWorkRequestJPanel1(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_processJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        m = createHashMap();
        createPiechart(m);
        
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnDashboard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboard1ActionPerformed
        // TODO add your handling code here:
        m1 = createnewHashMap();
        createPiechart(m1);
    }//GEN-LAST:event_btnDashboard1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnDashboard1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestMedJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    private javax.swing.JTable workRequestJTable1;
    private javax.swing.JTable workRequestJTable2;
    // End of variables declaration//GEN-END:variables
}
