/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercooding.bank.controlleur;

import com.summercooding.bank.entities.Admin;
import com.summercooding.bank.entities.Compte;
import com.summercooding.bank.entities.Utilisateur;
import com.summercooding.bank.gestionnaires.GestionnaireAdmin;
import com.summercooding.bank.gestionnaires.GestionnaireCompte;
import com.summercooding.bank.gestionnaires.GestionnaireUtilisateur;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author YIMDJO
 */
public class Controlleur {
    
    
    
    GestionnaireUtilisateur gestionnaireUtilisateur = new GestionnaireUtilisateur(); 
    GestionnaireAdmin getGestionnaireAdmin = new GestionnaireAdmin();
    GestionnaireCompte gestionnaireCompte = new GestionnaireCompte();
     
     
     
    
    public Admin routeVersloginAdmin(String login, String password) throws SQLException {
            
         return getGestionnaireAdmin.loginAdmin(login, password);
    }
    
    public void routeVersSave(String login, String password,String nom) throws SQLException {
            
        getGestionnaireAdmin.saveAdmin(login,password,nom);
    }
           
    public List<Admin> routeVersListAllAdmin() throws SQLException{
        // remplier le comboBox liste admin 
         return getGestionnaireAdmin.listAllAdmin();
         
         
    }
       
    
    
    public void routeVersaveUtilisateur (String login, String password,String nom,String prenom, LocalDate datenaiss, String genre, int idadmin) throws SQLException{
        
        gestionnaireUtilisateur.saveUtilisateur(login,password,nom,prenom,datenaiss,genre,idadmin);

    }  
 
    public Utilisateur routeVersLoginUtilisateur ( String login, String password) throws SQLException{
         return gestionnaireUtilisateur.loginUtilisateur(login, password);
    }

      
    public List<Utilisateur> routeVerslistAllUtilisateur() throws SQLException{ // remplier le comboBox liste admin 
        return gestionnaireUtilisateur.listAllUtilisateur();
    }
 
 


   
  
     public void routeVerSaveCompte (int solde, int iduser, int idadmin) throws SQLException{
 
        gestionnaireCompte.saveCompte(solde, iduser,idadmin);
    }
 
   
   public List<Compte> routeVerslistAllUCompte() throws SQLException{ // remplier le comboBox liste admin 
         return gestionnaireCompte.listAllCompte();
   
    }      

}