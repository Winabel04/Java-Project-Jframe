/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance_monitoring;

import java.sql.*;
import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;


/**
 *
 * @author 2ndyrGroupA
 */
public class add_form extends javax.swing.JFrame {

    /**
     * Creates new form add_form
     */
    public add_form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        fNameTexField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addressTexField = new javax.swing.JTextField();
        emailAddTexField = new javax.swing.JTextField();
        positionField = new javax.swing.JTextField();
        maleRadioBtn = new javax.swing.JRadioButton();
        femaleRadioBtn = new javax.swing.JRadioButton();
        AddBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lNameTexField = new javax.swing.JTextField();
        departmentField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Employee Information");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 11, 435, 50));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel5.setText("Lastname:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 91, -1, -1));
        jPanel5.add(fNameTexField, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 28, 297, 39));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel6.setText("Firstname:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 34, -1, -1));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel7.setText("Email Addresss:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel8.setText("Department:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel9.setText("Password:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));
        jPanel5.add(addressTexField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 297, 39));
        jPanel5.add(emailAddTexField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 297, 39));
        jPanel5.add(positionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 297, 39));

        maleRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        maleRadioBtn.setText("Male");
        maleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioBtnActionPerformed(evt);
            }
        });
        jPanel5.add(maleRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        femaleRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        femaleRadioBtn.setText("Female");
        femaleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioBtnActionPerformed(evt);
            }
        });
        jPanel5.add(femaleRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        AddBtn.setBackground(new java.awt.Color(0, 204, 204));
        AddBtn.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        AddBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\2ndyrGroupA\\Documents\\NetBeansProjects\\Attendance_Monitoring\\src\\images_java\\add-icon.png")); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel5.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 148, 51));

        CancelBtn.setBackground(new java.awt.Color(255, 3, 3));
        CancelBtn.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        CancelBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\2ndyrGroupA\\Documents\\NetBeansProjects\\Attendance_Monitoring\\src\\images_java\\cancel-icon.png")); // NOI18N
        CancelBtn.setText("Cancel");
        CancelBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        jPanel5.add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 130, 50));
        jPanel5.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 300, 40));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel10.setText("Address:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel12.setText("Position:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        jPanel5.add(lNameTexField, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 85, 297, 39));
        jPanel5.add(departmentField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 297, 39));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String gender;    
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
       
        
    }//GEN-LAST:event_AddBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
       
        this.setVisible(false);
         new add_employee().setVisible(true);
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void maleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioBtnActionPerformed
        gender = "Male";        
    }//GEN-LAST:event_maleRadioBtnActionPerformed

    private void femaleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioBtnActionPerformed
        gender = "Female";
    }//GEN-LAST:event_femaleRadioBtnActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        String firstName = fNameTexField.getText();
        String lastName = lNameTexField.getText();
        String department = departmentField.getText();
        String position = positionField.getText();
        String address = addressTexField.getText();
        String emailAddress = emailAddTexField.getText();
        String password = passwordField.getText();
              
        try {
            Class.forName("com.mysql.jdbc.Driver"); //load the driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/monitoring_attendance", "root", ""); //establishes the connection
            Statement stmt = (Statement) con.createStatement(); //get the connection stream(connection port)
            String info = "INSERT INTO `login`(`username`, `password`, `gender`) VALUES ('"+emailAddress+"','"+password+"','"+gender+"')";
            String query = "INSERT INTO employeetable(employee_id, firstName, lastName, department, position, address, gender, emailAddress, password) VALUES (NULL,'"+firstName+"','"+lastName+"','"+department+"','"+position+"','"+address+"','"+gender+"','"+emailAddress+"','"+password+"')";
            stmt.executeUpdate(query);
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Successfully Added");
            
            this.setVisible(false);
            new add_employee().setVisible(true);
            con.close();
        } catch (Exception e) {
//            System.out.println(e);
            JOptionPane.showMessageDialog(null,e.getMessage(),"Alert",JOptionPane.WARNING_MESSAGE);  
        

        }
    }//GEN-LAST:event_AddBtnMouseClicked

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
            java.util.logging.Logger.getLogger(add_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JTextField addressTexField;
    private javax.swing.JTextField departmentField;
    private javax.swing.JTextField emailAddTexField;
    private javax.swing.JTextField fNameTexField;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField lNameTexField;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField positionField;
    // End of variables declaration//GEN-END:variables
}
