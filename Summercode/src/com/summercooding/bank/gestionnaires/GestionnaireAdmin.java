/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercooding.bank.gestionnaires;

import com.summercooding.bank.entities.Admin;
import java.sql.SQLException;
import java.util.List;



/**
 *
 * @author YIMDJO
 */
public class GestionnaireAdmin {
    
    private Admin admin = new Admin();
    
     public Admin loginAdmin(String login, String password) throws SQLException{
             
             return admin.getByLoginAndPassword (login, password);// pour avoir les propositions on part apres le point on fait control+ space
    
    
     }
     public void saveAdmin(String login, String password, String nom) throws SQLException{
         admin.save(login, password, nom);
         
         
     }
     
     public List<Admin> listAllAdmin() throws SQLException{ // remplier le comboBo liste admin 
         return admin.getALLAdmin();
         
     }
     
     }
    

