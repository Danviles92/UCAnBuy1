/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.SignUpController;
import controller.Util;

import org.apache.log4j.Logger;

/**
 *
 * @author Jesús
 */
public class SignUp extends MyOwnJFrame {
    private final static Logger log = Logger.getLogger(SignUp.class);
    private static final SignUpController sgn = new SignUpController();
    /**
     * Creates new form SignIn
     */
    public SignUp() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSignIn = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelLastname = new javax.swing.JLabel();
        jTextFieldLastname = new javax.swing.JTextField();
        jLabelIDNumber = new javax.swing.JLabel();
        jTextFieldIDNumber = new javax.swing.JTextField();
        jLabelUsername = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jButtonNext = new javax.swing.JButton();
        jLabelUserExists = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelSignIn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSignIn.setText("Sign Up");

        jLabelName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelName.setText("Name:");

        jTextFieldName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNameKeyTyped(evt);
            }
        });

        jLabelLastname.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelLastname.setText("Lastname:");

        jTextFieldLastname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldLastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldLastnameKeyTyped(evt);
            }
        });

        jLabelIDNumber.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelIDNumber.setText("ID Number:");

        jTextFieldIDNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIDNumberKeyTyped(evt);
            }
        });

        jLabelUsername.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelUsername.setText("Username:");

        jTextFieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldUsernameKeyTyped(evt);
            }
        });

        jButtonNext.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButtonNext.setText("Next");
        jButtonNext.setEnabled(false);
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jLabelUserExists.setForeground(new java.awt.Color(255, 0, 0));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldName)
                            .addComponent(jTextFieldLastname)
                            .addComponent(jTextFieldIDNumber)
                            .addComponent(jTextFieldUsername)
                            .addComponent(jLabelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelIDNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jLabelLastname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelUserExists, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNext)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSignIn)
                .addGap(18, 18, 18)
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLastname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelIDNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldUsername)
                    .addComponent(jLabelUserExists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNext)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        // TODO add your handling code here:
        SignUp2 sgn2 = new SignUp2();
        boolean userExists;
        
        userExists = sgn.userExists(jTextFieldUsername.getText());
        
        if(userExists){
            jLabelUserExists.setText("This username exists");
        }else{
            jLabelUserExists.setText("");
            sgn2.setVisible(true);
            sgn2.setFatherWindow(this, true);

            Util.ACTUAL_LOGGING_USER.setName(jTextFieldName.getText());
            Util.ACTUAL_LOGGING_USER.setLastname(jTextFieldLastname.getText());
            Util.ACTUAL_LOGGING_USER.setId(jTextFieldIDNumber.getText());
            Util.ACTUAL_LOGGING_USER.setUsername(jTextFieldUsername.getText());
        }
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.restoreFatherWindow();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        if(Util.DONE){
            Util.DONE = false;
            this.restoreFatherWindow();
        }
    }//GEN-LAST:event_formWindowActivated

    private void jTextFieldNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNameKeyTyped
        // TODO add your handling code here:
        String name = jTextFieldName.getText();
        String lastname = jTextFieldLastname.getText();
        String id = jTextFieldIDNumber.getText();
        String username = jTextFieldUsername.getText();
        
        if(!name.equals("") && !lastname.equals("") && !id.equals("") && !username.equals("")){
            jButtonNext.setEnabled(true);
        }else{
            jButtonNext.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldNameKeyTyped

    private void jTextFieldLastnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLastnameKeyTyped
        // TODO add your handling code here:
        String name = jTextFieldName.getText();
        String lastname = jTextFieldLastname.getText();
        String id = jTextFieldIDNumber.getText();
        String username = jTextFieldUsername.getText();
        
        if(!name.equals("") && !lastname.equals("") && !id.equals("") && !username.equals("")){
            jButtonNext.setEnabled(true);
        }else{
            jButtonNext.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldLastnameKeyTyped

    private void jTextFieldIDNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIDNumberKeyTyped
        // TODO add your handling code here:
        String name = jTextFieldName.getText();
        String lastname = jTextFieldLastname.getText();
        String id = jTextFieldIDNumber.getText();
        String username = jTextFieldUsername.getText();
        
        if(!name.equals("") && !lastname.equals("") && !id.equals("") && !username.equals("")){
            jButtonNext.setEnabled(true);
        }else{
            jButtonNext.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldIDNumberKeyTyped

    private void jTextFieldUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsernameKeyTyped
        // TODO add your handling code here:
        String name = jTextFieldName.getText();
        String lastname = jTextFieldLastname.getText();
        String id = jTextFieldIDNumber.getText();
        String username = jTextFieldUsername.getText();
        
        if(!name.equals("") && !lastname.equals("") && !id.equals("") && !username.equals("")){
            jButtonNext.setEnabled(true);
        }else{
            jButtonNext.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldUsernameKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.restoreFatherWindow();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JLabel jLabelIDNumber;
    private javax.swing.JLabel jLabelLastname;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelSignIn;
    private javax.swing.JLabel jLabelUserExists;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JTextField jTextFieldIDNumber;
    private javax.swing.JTextField jTextFieldLastname;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
