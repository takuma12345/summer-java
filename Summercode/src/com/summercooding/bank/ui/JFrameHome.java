/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercooding.bank.ui;

import com.mysql.cj.xdevapi.Table;
import com.summercooding.bank.controlleur.Controlleur;
import com.summercooding.bank.entities.Admin;
import com.summercooding.bank.entities.Compte;
import com.summercooding.bank.entities.Utilisateur;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YIMDJO
 */
public class JFrameHome extends javax.swing.JFrame {
    Controlleur controlleur = new Controlleur();
    
    JFrameSaveAdmin saveAdmin = new JFrameSaveAdmin();
    JFrameSaveUtilisateur saveUtilisateur = new JFrameSaveUtilisateur();
    JFrameSaveCompte saveCompte =  new JFrameSaveCompte();
    
    /**
     * Creates new form JFrameHome
     */
    public JFrameHome() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        createMenuAdmin = new javax.swing.JMenuItem();
        listMenuAdmin = new javax.swing.JMenuItem();
        Utilisateur = new javax.swing.JMenu();
        createMenuUtilisateur = new javax.swing.JMenuItem();
        listeMenuUtilisateur = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        createMenuCompte = new javax.swing.JMenuItem();
        listMenuCompte = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("jMenu8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        jMenu3.setText("Admin");
        jMenu3.setToolTipText("");

        createMenuAdmin.setText("Create");
        createMenuAdmin.setToolTipText("rea");
        createMenuAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMenuAdminActionPerformed(evt);
            }
        });
        jMenu3.add(createMenuAdmin);

        listMenuAdmin.setText("List");
        listMenuAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listMenuAdminActionPerformed(evt);
            }
        });
        jMenu3.add(listMenuAdmin);

        jMenuBar2.add(jMenu3);

        Utilisateur.setText("Utilisateur");

        createMenuUtilisateur.setText("create");
        createMenuUtilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMenuUtilisateurActionPerformed(evt);
            }
        });
        Utilisateur.add(createMenuUtilisateur);

        listeMenuUtilisateur.setText("liste");
        listeMenuUtilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeMenuUtilisateurActionPerformed(evt);
            }
        });
        Utilisateur.add(listeMenuUtilisateur);

        jMenuBar2.add(Utilisateur);

        jMenu5.setText("Compte");

        createMenuCompte.setText("create");
        createMenuCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMenuCompteActionPerformed(evt);
            }
        });
        jMenu5.add(createMenuCompte);

        listMenuCompte.setText("list");
        listMenuCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listMenuCompteActionPerformed(evt);
            }
        });
        jMenu5.add(listMenuCompte);

        jMenuBar2.add(jMenu5);

        jMenu9.setText("A propos ");
        jMenuBar2.add(jMenu9);

        jMenu10.setText("Aide");
        jMenuBar2.add(jMenu10);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createMenuAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMenuAdminActionPerformed
        // TODO add your handling code here:
       saveAdmin.setVisible(true);
        
    }//GEN-LAST:event_createMenuAdminActionPerformed

    private void listMenuAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listMenuAdminActionPerformed
        try {
            // TODO add your handling code here:
            
            /* String [] colums = new String [] {
            "ID" , "Nom", "Login"
            };
            
            String [] [] datas = new String [] []{
            
            { "1","toto","toto"},
            {"2", "titi", "titi"},
            {"3","tata", "tata"},
            {"4", "tata","tata"},
            
            
            };
            table.setModel(new DefaultTableModel(datas,colums));*/
            List<Admin> listAdmin = controlleur.routeVersListAllAdmin();
            
            DefaultTableModel model = (DefaultTableModel) table.getModel(); 
            model.addColumn("Id");
            model.addColumn("Nom");
            model.addColumn("login");
            
            for (Admin ad :listAdmin) {
                model.addRow(new String[]{ad.getIdadmin()+ "",ad.getNom(), ad.getLogin()});
                
            }
            
            table.setModel(model);
            
        } catch (SQLException ex) {
            Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
      
     
            
        
    }//GEN-LAST:event_listMenuAdminActionPerformed

    private void createMenuCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMenuCompteActionPerformed

         saveCompte.setVisible(true);
        
        


// TODO add your handling code here:
    }//GEN-LAST:event_createMenuCompteActionPerformed

    private void createMenuUtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMenuUtilisateurActionPerformed
   
         saveUtilisateur.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_createMenuUtilisateurActionPerformed

    private void listeMenuUtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeMenuUtilisateurActionPerformed

        try {
            List<Utilisateur> listUtilisateur = controlleur.routeVerslistAllUtilisateur();
            
              
            DefaultTableModel model = (DefaultTableModel) table.getModel(); 
            model.addColumn("Iduser");
            model.addColumn("nom"); 
            model.addColumn("prenom");
            model.addColumn("datenaiss");
            model.addColumn("genre");
             model.addColumn("idadmin");
            
            
              for (Utilisateur ad :listUtilisateur) {
                model.addRow(new String[]{ad.getIduser()+ "", ad.getNom(),ad.getPrenom(),ad.getDatenaiss() +"",ad.getGenre(),ad.getIdadmin()+""});
                
              }
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listeMenuUtilisateurActionPerformed

    private void listMenuCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listMenuCompteActionPerformed
        try {
            List<Compte> listCompte = controlleur.routeVerslistAllUCompte();
            
            DefaultTableModel model = (DefaultTableModel) table.getModel(); 
            model.addColumn("idcompte");
            model.addColumn("solde");
            model.addColumn("iduser");
            model.addColumn("idadmin");
            
            for (Compte ad :listCompte) {
                model.addRow(new String[]{ad.getIdcompte() + "", ad.getSolde()+"", ad.getIduser()+"",ad.getIdadmin() + ""});
                
            }
            
            
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listMenuCompteActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Utilisateur;
    private javax.swing.JMenuItem createMenuAdmin;
    private javax.swing.JMenuItem createMenuCompte;
    private javax.swing.JMenuItem createMenuUtilisateur;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem listMenuAdmin;
    private javax.swing.JMenuItem listMenuCompte;
    private javax.swing.JMenuItem listeMenuUtilisateur;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}