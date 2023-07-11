/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercooding.bank.entities;

import com.summercooding.bank.utils.Jdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YIMDJO   ici c'est la fonction inserer dans la base de donnée
 */
public class Compte {
    
    int idcompte;
    int solde;
    int iduser;
    int idadmin;
    
    public void save (  
    int solde, int iduser, int idadmin) throws SQLException{
          
            String command =  "INSERT INTO `compte` (`solde`, `iduser`,`idadmin`) VALUES ( ?, ?,?)";
            
            PreparedStatement addstmt = Jdbc.getconnexion().prepareStatement(command);
            
           
            addstmt.setObject(1, solde);
            addstmt.setObject(2, iduser);
            addstmt.setObject(3, idadmin);
           addstmt.execute ();
           
        
      
    }
       public void update ( int idcompte,int solde, int iduser, int idadmin) throws SQLException{
          
            String command =  "UPDATE `compte` SET `solde` = ?, `iduser` = ?, `idadmin` = ?  WHERE `compte`.`idcompte` = ?"; 
            
            PreparedStatement addstmt = Jdbc.getconnexion().prepareStatement(command);
            
           
            addstmt.setObject(1, solde);
            addstmt.setObject(2, iduser);
            addstmt.setObject(3, idadmin);
           addstmt.execute ();
           
        
      
    }
       
    public void delete ( int idcompte ) throws SQLException{ // normalement on n'utilise pas cette methode , car les choses ne se supprime pas comme ca
     
            
        
        
            String command =   "DELETE FROM `compte` WHERE `compte`.`idcompte` = ?";
            
            PreparedStatement addstmt = Jdbc.getconnexion().prepareStatement(command);
            
            addstmt.setObject(1, idcompte);
           
            addstmt.execute ();
        
      
    }
        
    
    
    public Compte getone(int idcompte) throws SQLException{//  methode permettant de retourner un admintrateur si on reconnait son id
        String cmd= "select* from compte idcompte where idcompte = ?";
        
        PreparedStatement stmt = Jdbc.getconnexion().prepareStatement(cmd);
         stmt.setObject (1, idcompte);
         ResultSet rs= stmt.executeQuery();
         
         while(rs.next()){
             return new Compte(rs.getInt(1), rs.getInt(2),
                     rs.getInt(3), rs.getInt(4));
         }
         return null;
    }
          public Compte getByLoginAndPassword(String login, String password) throws SQLException{//  methode permettant de retourner un admintrateur si on reconnait son id
        String cmd= "select* from compte idcompte where login = ? and password = ?";
        
        PreparedStatement stmt = Jdbc.getconnexion().prepareStatement(cmd);
         stmt.setObject (1, login);
         stmt.setObject (2, password);
         ResultSet rs= stmt.executeQuery();
         
         while(rs.next()){
             return new Compte (rs.getInt(1), rs.getInt(2),
                     rs.getInt(3), rs.getInt(4));
         }
         return null;}
            
     public List<Compte> getALLAdmin() throws SQLException{ // methode pour retourner tout les  admins  qui existe 
        String cmd= "select * from `compte`";
        
        PreparedStatement stmt = Jdbc.getconnexion().prepareStatement(cmd);
         
         ResultSet rs= stmt.executeQuery();
         List<Compte> listCompte = new ArrayList<>();
         while (rs. next ()){
             listCompte.add (new Compte(rs.getInt(1), rs.getInt(2),
                     rs.getInt(3), rs.getInt(4)));
         }
         return listCompte;
    
     }
    

    public int getIdcompte() {
        return idcompte;
    }

    public void setIdcompte(int idcompte) {
        this.idcompte = idcompte;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }
    public Compte(){
        
    }

    public Compte(int idcompte, int solde, int iduser, int idadmin) {
        this.idcompte = idcompte;
        this.solde = solde;
        this.iduser = iduser;
        this.idadmin = idadmin;
    }

    @Override
    public String toString() {
        return "Compte{" + "idcompte=" + idcompte + ", solde=" + solde + ", iduser=" + iduser + ", idadmin=" + idadmin + '}';
    }
    
    
    
      public static void main (String arg[]){ // c'est pour tester si notre fonction inserer marche bien 
       
            
        try {
            Compte compte = new Compte();
           String result = compte.getone(2).toString();
            System.out.println(result);
       
       //result = admin.getByLoginAndPassword("takuma","gilbert").toString();
       //System.out.println(result);
           //String result = admin.getALLAdmin().toString();
           System.out.println(result);
           
        } catch (SQLException ex) {
            Logger.getLogger(Compte.class.getName()).log(Level.SEVERE, null, ex);
        }
    
      }
}
