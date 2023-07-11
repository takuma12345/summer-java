/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercooding.bank.gestionnaires;

import com.summercooding.bank.entities.Admin;
import com.summercooding.bank.entities.Utilisateur;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author YIMDJO
 */
public class GestionnaireUtilisateur {
    
    
    private Utilisateur utilisateur = new Utilisateur();
    
    
    public Utilisateur loginUtilisateur(String login, String password) throws SQLException{
    return utilisateur.getByLoginAndPassword(login, password);
    }

    public void saveUtilisateur (String login,String password,String nom,String prenom, LocalDate datenaiss, String genre, int idadmin) throws SQLException{
        utilisateur.save(login, password, nom, prenom, datenaiss, genre, idadmin);
    }
    
    public List<Utilisateur> listAllUtilisateur() throws SQLException{ // remplier le comboBo liste admin 
        return utilisateur.getUtitilisateur();
   
  
    }
}