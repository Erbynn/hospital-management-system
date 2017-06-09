/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.Receptionist;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import DatabaseConnection.DbConnect;
import classes.Patient;
import controllers.PatientController;
import javax.swing.JTextField;

/**
 *
 * @author Chashika
 */
public class PatientRegistration extends javax.swing.JFrame {

    
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public PatientRegistration() {
        
        initComponents();
    }

   public void Reset(){
        PID.setText("");
        txtName.setText("");
        txtAge.setText("");
        txtNumber.setText("");
        txtAddress.setText("");
        txtGurdianName.setText("");
        txtDisease.setText("");
   }
   
   public void disble(){
       txtAdmitDate.setEnabled(false);
   }
   
   public void addData(){
       try{
            con=DbConnect.Connect();
           
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter patient name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtGurdianName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Father's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtAddress.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (txtNumber.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter contact no.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
            if (txtAge.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter age","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            int wid = Integer.parseInt(txtWardID.getText());
            int Did = Integer.parseInt(txtDoctorId.getText());
            String date = ((JTextField)txtAdmitDate.getDateEditor().getUiComponent()).getText();
            Patient p = new Patient(txtName.getText(),txtAge.getText(), (String) cmbGender.getSelectedItem(),txtNumber.getText(),txtAddress.getText(),txtGurdianName.getText(),txtDisease.getText(),date,wid,Did);
            PatientController pc = new PatientController();
            pc.createPatient(p);
            
          
  

        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(this,e);
        }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        cmbGender = new javax.swing.JComboBox<>();
        txtNumber = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtGurdianName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDisease = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtDoctorId = new javax.swing.JTextField();
        txtDocName = new javax.swing.JTextField();
        txtWardID = new javax.swing.JTextField();
        txtAdmitDate = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setPreferredSize(new java.awt.Dimension(1200, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria Math", 1, 24))); // NOI18N
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(392, 484));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("TruthCYR Medium", 0, 11)); // NOI18N
        jLabel2.setText("Patient ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 40, 70, 12);

        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(31, 76, 50, 14);

        jLabel7.setText("Age");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(31, 114, 40, 14);

        jLabel6.setText("Gender");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(31, 144, 60, 14);

        jLabel4.setText("Contac Number");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 180, 110, 14);

        jLabel5.setText("Address");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 240, 80, 14);

        jLabel8.setText("Gurdians name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 280, 100, 14);
        jPanel1.add(PID);
        PID.setBounds(120, 40, 119, 20);
        jPanel1.add(txtName);
        txtName.setBounds(97, 73, 224, 30);

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        jPanel1.add(txtAge);
        txtAge.setBounds(97, 111, 83, 20);

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(cmbGender);
        cmbGender.setBounds(110, 140, 59, 20);
        jPanel1.add(txtNumber);
        txtNumber.setBounds(150, 170, 135, 30);

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel1.add(txtAddress);
        txtAddress.setBounds(110, 220, 208, 40);
        jPanel1.add(txtGurdianName);
        txtGurdianName.setBounds(110, 270, 214, 30);

        jLabel9.setText("Disease");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 330, 80, 14);
        jPanel1.add(txtDisease);
        txtDisease.setBounds(120, 310, 180, 59);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/mvQmsXm.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 10, 370, 450);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 30, 370, 380);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient admit info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("TruthCYR Bold", 0, 18))); // NOI18N
        jPanel3.setLayout(null);

        jLabel11.setText("Admit date");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(16, 51, 90, 14);

        jLabel12.setText("Ward No");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(20, 90, 80, 14);

        jLabel14.setText("Doctor ID");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(20, 130, 70, 14);

        jLabel15.setText("Doctor Name");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(20, 180, 90, 14);

        txtDoctorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorIdActionPerformed(evt);
            }
        });
        jPanel3.add(txtDoctorId);
        txtDoctorId.setBounds(100, 130, 79, 30);
        jPanel3.add(txtDocName);
        txtDocName.setBounds(100, 180, 165, 30);
        jPanel3.add(txtWardID);
        txtWardID.setBounds(100, 80, 92, 30);

        txtAdmitDate.setDateFormatString(" yyyy-MM-dd");
        jPanel3.add(txtAdmitDate);
        txtAdmitDate.setBounds(100, 40, 148, 30);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/mvQmsXm.jpg"))); // NOI18N
        jPanel3.add(jLabel16);
        jLabel16.setBounds(0, 20, 290, 250);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(540, 60, 290, 270);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNew.setBackground(new java.awt.Color(102, 102, 102));
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(102, 102, 102));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(102, 102, 102));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(880, 60, 120, 147);

        btnAdmit.setBackground(new java.awt.Color(0, 0, 0));
        btnAdmit.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmit.setText("Assign Ward>>");
        btnAdmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdmit);
        btnAdmit.setBounds(410, 190, 123, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/logosmall.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(880, 240, 200, 200);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/medical-cross-symbols-against-blue-background1.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 1240, 540);

        getAccessibleContext().setAccessibleName("Patient details");
        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       try{
        int x = JOptionPane.showConfirmDialog(null,"Do you really want to update this?");
        if(x==0){
            int wid = Integer.parseInt(txtWardID.getText());
            int Did = Integer.parseInt(txtDoctorId.getText());
            String date = ((JTextField)txtAdmitDate.getDateEditor().getUiComponent()).getText();
            Patient p = new Patient(txtName.getText(),txtAge.getText(), (String) cmbGender.getSelectedItem(),txtNumber.getText(),txtAddress.getText(),txtGurdianName.getText(),txtDisease.getText(),date,wid,Did);
            PatientController pc = new PatientController();
            int pid = Integer.parseInt(PID.getText());
            pc.updatePatient(p,pid);
        }
       }catch(Exception ex){
           JOptionPane.showMessageDialog(this, ex);
       }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        addData();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        Reset();
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        try {
            PatientController pc = new PatientController();
            pc.removePatient(PID.getText(), txtName.getText());
            
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(this,ex);
            
        }
    
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAdmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmitActionPerformed
        try {
            
            jPanel3.setEnabled(true);
            PatientController pc = new PatientController();
            int wrd = pc.assignWard();
            int dct = wrd + 1;
            System.out.println(wrd);
            txtWardID.setText(Integer.toString(wrd));
            txtDoctorId.setText(Integer.toString(dct));
        
            con = DbConnect.Connect();
            String sql1 = "SELECT Name from doctor where DocID='"+dct+"'";
            System.out.println(wrd);
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();
            String docName;
            if(rs.next()){
                docName = rs.getString(1);
                txtDocName.setText(docName);
            }
            
            
        } catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        
        
        
    }//GEN-LAST:event_btnAdmitActionPerformed

    private void txtDoctorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorIdActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    /**
     * @param args the command line arguments
     */
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientDischarge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDischarge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDischarge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDischarge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientRegistration().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PID;
    private javax.swing.JButton btnAdmit;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtAddress;
    private com.toedter.calendar.JDateChooser txtAdmitDate;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDisease;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JTextField txtGurdianName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtWardID;
    // End of variables declaration//GEN-END:variables
}
