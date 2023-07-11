/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercooding.bank.entities;
import com.summercooding.bank.utils.Jdbc;
import java.time.LocalDate;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author YIMDJO
 */
public class Utilisateur {
    
    
     int iduser;
    String login;
    String password;
    String nom;
   String prenom;
   LocalDate datenaiss;
   String genre;
   int idadmin;


   
    public void save (String login,
    String password,String nom,String prenom, LocalDate datenaiss, String genre, int idadmin) throws SQLException{
        
            
             
                String command2 =   "INSERT INTO `utilisateur` (`login`, `password`, `nom`,`prenom`,`datenaiss`,`genre`,`idadmin`) VALUES ( ?,?,?,?,?,?,?)";
                PreparedStatement addstmt = Jdbc.getconnexion().prepareStatement(command2);
                
                addstmt.setObject(1, login);
            addstmt.setObject(2, password);
            addstmt.setObject(3, nom);
            addstmt.setObject(4, prenom);
             addstmt.setObject(5, datenaiss);
             addstmt.setObject(6, genre);
              addstmt.setObject(7, idadmin);
            addstmt.execute ();
    }
    
    
       public void update ( int iduser,String login,
    String password,String nom,String prenom, String datenaiss, String genre, int idadmin) throws SQLException{
        
            
             
                String command2 =  "UPDATE `utilisateur` SET `login` = ?, `password` = ?, `nom` = ?  WHERE `utilisateur`.`iduser` = ?"; 
                PreparedStatement addstmt = Jdbc.getconnexion().prepareStatement(command2);
                
                addstmt.setObject(1, login);
            addstmt.setObject(2, password);
            addstmt.setObject(3, nom);
            addstmt.setObject(4, prenom);
             addstmt.setObject(5, datenaiss);
             addstmt.setObject(6, genre);
              addstmt.setObject(7, idadmin);
            addstmt.execute ();
                 
            
        }
             public void delete ( int iduser ) throws SQLException{ // normalement on n'utilise pas cette methode , car les choses ne se supprime pas comme ca
     
            
        
        
            String command =   " DELETE FROM `utilisateur` WHERE `utilisateur`.`iduser` = ?";
            
            PreparedStatement addstmt = Jdbc.getconnexion().prepareStatement(command);
            
            addstmt.setObject(1, iduser);
           
            addstmt.execute ();
        
      
    }  
             
             
             
             
    public Utilisateur getone(int iduser) throws SQLException{//  methode permettant de retourner un admintrateur si on reconnait son id
        String cmd= "select* from utilisateur iduser where iduser = ?";
        
        PreparedStatement stmt = Jdbc.getconnexion().prepareStatement(cmd);
         stmt.setObject (1, iduser);
         ResultSet rs= stmt.executeQuery();
         
         while(rs.next()){
             return new Utilisateur (rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getDate(6).toLocalDate(),rs.getString(7),rs.getInt(8));
         }
         return null;
                
                
    }
        

  public Utilisateur  getByLoginAndPassword(String login, String password) throws SQLException{//  methode permettant de retourner un admintrateur si on reconnait son id
        String cmd= "select* from utilisateur iduser where login = ? and password = ?";
        
        PreparedStatement stmt = Jdbc.getconnexion().prepareStatement(cmd);
         stmt.setObject (1, login);
         stmt.setObject (2, password);
         ResultSet rs= stmt.executeQuery();
         
         while(rs.next()){
            return new Utilisateur (rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getDate(6).toLocalDate(),rs.getString(7),rs.getInt(8));
         }
         return null;    
  }
  

       
     public List<Utilisateur> getUtitilisateur() throws SQLException{ // methode pour retourner tout les  admins  qui existe 
        String cmd= "select * from `utilisateur`";
        
        PreparedStatement stmt = Jdbc.getconnexion().prepareStatement(cmd);
         
         ResultSet rs= stmt.executeQuery();
         List<Utilisateur> listUtilisateur = new ArrayList<>();
         while (rs. next ()){
             
                     listUtilisateur.add (new Utilisateur(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getDate(6).toLocalDate(),rs.getString(7),rs.getInt(8)));
         }
         return listUtilisateur;
     }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDatenaiss() {
        return datenaiss;
    }

    public void setDatenaiss(LocalDate datenaiss) {
        this.datenaiss = datenaiss;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }

   
   
public Utilisateur(){
}

    public Utilisateur(int iduser, String login, String password, String nom, String prenom, LocalDate datenaiss, String genre, int idadmin) {
        this.iduser = iduser;
        this.login = login;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.datenaiss = datenaiss;
        this.genre = genre;
        this.idadmin = idadmin;
    }

    

    @Override
    public String toString() {
        return "Utilisateur{" + "iduser=" + iduser + ", login=" + login + ", password=" + password + ", nom=" + nom + ", prenom=" + prenom + ", datenaiss=" + datenaiss + ", genre=" + genre + ", idadmin=" + idadmin + '}';
    }
    
    
    public static void main (String arg[]) {
        
     try {
           Utilisateur utilisateur = new Utilisateur ();
          String result = utilisateur.getone(1).toString();
           System.out.println(result);
           
           
        } catch (SQLException ex) {
            Logger.getLogger(Utilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
}
    

    
