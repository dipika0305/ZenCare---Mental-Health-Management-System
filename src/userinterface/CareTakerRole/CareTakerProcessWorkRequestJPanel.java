/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CareTakerRole;

import model.Enterprise.Enterprise;
import model.MailNew;
import model.UserAccount.UserAccount;
import model.WorkQueue.CareTakerWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.BillGeneratorRole.BillGeneratorWorkAreaJPanel;

/**
 *
 * @author dipikam
 */
public class CareTakerProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    CareTakerWorkRequest request;
    UserAccount userAccount;
    Enterprise enterprise;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public CareTakerProcessWorkRequestJPanel(JPanel userProcessContainer, CareTakerWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        ptName.setText(request.getPatient());
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ptName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitJButton.setBackground(new java.awt.Color(0, 153, 153));
        submitJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("SUBMIT");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 100, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setText("CareTaker");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, 20));

        resultJTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        add(resultJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 190, -1));

        backJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(0, 153, 153));
        backJButton.setText("BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 100, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("CARE TAKER RESULT");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Patient Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 130, 30));

        ptName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ptName.setText("<name>");
        add(ptName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CareTakerWorkAreaJPanel dwjp = (CareTakerWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(resultJTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Do not enter a empty messgae!!");
            return;
        }
        else if(resultJTextField.getText().length()>25)
        {
            JOptionPane.showMessageDialog(null,"DO not exceed 25 characters limit !!");
            return;
        }
        else{
        request.setcaretakerInfo(resultJTextField.getText());
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(null, "Request Completed!");
        
         
         try {
                   MailNew m=new MailNew("steveaeddemo@gmail.com","Updated areTaker RequestC "+ userAccount,"Caretaker has been assigned to you"+userAccount.getEmployee().getName());
               } catch (MessagingException ex) {
                   Logger.getLogger(BillGeneratorWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
               }
        
        
        
        
        }
        
       
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel ptName;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
