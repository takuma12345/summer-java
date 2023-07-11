/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercooding.bank.ui;

import com.summercooding.bank.controlleur.Controlleur;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author YIMDJO
 */
public class JFrameSaveUtilisateur extends javax.swing.JFrame {
    Controlleur controlleur = new Controlleur();

    /**
     * Creates new form JFrameSaveUtilisateur
     */
    public JFrameSaveUtilisateur() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ChampLogin = new javax.swing.JTextField();
        ChampPassword = new javax.swing.JTextField();
        ChampNom = new javax.swing.JTextField();
        champPrenom = new javax.swing.JTextField();
        ChampDatanaiss = new javax.swing.JTextField();
        ChampGenre = new javax.swing.JTextField();
        ChampIdadmin = new javax.swing.JTextField();
        ChampAnnuler = new javax.swing.JButton();
        ChampOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Login");

        jLabel2.setText("Password");

        jLabel3.setText("Nom");

        jLabel4.setText("Prenom");

        jLabel5.setText("Datenaiss");

        jLabel6.setText("Genre");

        jLabel7.setText("Idadmin");

        champPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champPrenomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ChampGenre)
                    .addComponent(ChampPassword)
                    .addComponent(ChampLogin)
                    .addComponent(ChampNom)
                    .addComponent(champPrenom)
                    .addComponent(ChampDatanaiss)
                    .addComponent(ChampIdadmin, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ChampLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ChampPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChampNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(champPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ChampDatanaiss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ChampGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ChampIdadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        ChampAnnuler.setText("Annuler");
        ChampAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChampAnnulerActionPerformed(evt);
            }
        });

        ChampOk.setText("ok");
        ChampOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChampOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 478, Short.MAX_VALUE)
                        .addComponent(ChampOk)
                        .addGap(18, 18, 18)
                        .addComponent(ChampAnnuler))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChampAnnuler)
                    .addComponent(ChampOk))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void champPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champPrenomActionPerformed

    private void ChampOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChampOkActionPerformed

        try {

      String login = ChampLogin.getText();
 String password = ChampPassword.getText();
        String nom = ChampNom.getText();
        String prenom = champPrenom.getText();
        LocalDate datenaiss = LocalDate.now();
        String genre  =  ChampGenre.getText();
        int idadmin = Integer.parseInt(ChampIdadmin.getText());
        
        
            controlleur.routeVersaveUtilisateur(login,password,nom,prenom, datenaiss,  genre,idadmin);
            
             JOptionPane.showMessageDialog(null, "success");  
             
              ChampLogin.setText("");
            ChampPassword.setText("");
            ChampNom.setText("");
            champPrenom.setText("");
         ChampDatanaiss.setText(""); 
        ChampGenre.setText("");
       ChampIdadmin.setText("");
            
           
        } catch (SQLException ex) {
            Logger.getLogger(JFrameSaveUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    
    


        // TODO add your handling code here:
    }//GEN-LAST:event_ChampOkActionPerformed

    private void ChampAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChampAnnulerActionPerformed

 this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ChampAnnulerActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameSaveUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameSaveUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameSaveUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameSaveUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameSaveUtilisateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChampAnnuler;
    private javax.swing.JTextField ChampDatanaiss;
    private javax.swing.JTextField ChampGenre;
    private javax.swing.JTextField ChampIdadmin;
    private javax.swing.JTextField ChampLogin;
    private javax.swing.JTextField ChampNom;
    private javax.swing.JButton ChampOk;
    private javax.swing.JTextField ChampPassword;
    private javax.swing.JTextField champPrenom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
