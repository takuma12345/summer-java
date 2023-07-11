/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercooding.bank.gestionnaires;

import com.summercooding.bank.entities.Compte;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author YIMDJO
 */
public class GestionnaireCompte {
    
    private Compte compte = new Compte();
    public Compte login (String login, String password)throws SQLException{
        return compte.getByLoginAndPassword(login, password);
    }
    public void saveCompte(int solde, int iduser, int idadmin) throws SQLException{
         compte.save(solde, iduser, idadmin);
         
    
    
    }  
     
    
     public List<Compte> listAllCompte() throws SQLException{ 

   return compte.getALLAdmin();
     }
}
