/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.Receptionist;

import DatabaseConnection.DbConnect;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Chashika
 */
public class PatientTest extends javax.swing.JFrame {

    /**
     * Creates new form PatientTest
     */
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public PatientTest() {
        initComponents();
        tableLoad();
    }
    
    public void tableLoad(){
        try {
            con = DbConnect.Connect();
        
            String sql = "SELECT * FROM patienttest";

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
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
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        txtPatientsName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTestID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pation's Tests", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setText("Patient id");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(16, 53, 73, 14);

        jLabel2.setText("Patient Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(16, 78, 81, 14);
        jPanel1.add(txtPatientID);
        txtPatientID.setBounds(115, 40, 94, 27);
        jPanel1.add(txtPatientsName);
        txtPatientsName.setBounds(115, 78, 96, 23);

        jLabel3.setText("Test ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(16, 112, 49, 14);
        jPanel1.add(txtTestID);
        txtTestID.setBounds(83, 112, 80, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/mvQmsXm.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 20, 340, 130);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 26, 340, 150);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        btnNew.setBackground(new java.awt.Color(51, 51, 51));
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(51, 51, 51));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(51, 51, 51));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(51, 51, 51));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(410, 34, 88, 160);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "PatientID", "PatientName", "TstsID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(51, 212, 417, 150);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/medical-cross-symbols-against-blue-background1.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 610, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       try {
            con = DbConnect.Connect();
        
            String sql = "SELECT * FROM patienttest WHERE patientID='"+txtPatientID.getText()+"' OR patientName='"+txtPatientsName.getText()+"' OR TestID='"+txtTestID.getText()+"'";

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            tableLoad();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtPatientID.setText("");
        txtPatientsName.setText("");
        txtTestID.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         try {
            con = DbConnect.Connect();
        
            String sql = "UPDATE patienttest set patientName='"+txtPatientsName.getText()+"', TestID='"+txtTestID.getText()+"' WHERE patientID='"+txtPatientID.getText()+"'";
            pst = con.prepareStatement(sql);
            pst.execute();
            tableLoad();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(PatientTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientTest().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPatientsName;
    private javax.swing.JTextField txtTestID;
    // End of variables declaration//GEN-END:variables
}
