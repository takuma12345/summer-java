//* avant de creer les classes il faut une base de données. celle-ci etant crée on supprime toutes les clés étrangere
 // et on auto incremente les clés primaire car la machine va se charge de le  modifier seul

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
 * @author YIMDJO
 */
public class Admin {
    int idadmin;
    String login;
    String password;
    String nom;
    
     
    
    
    
   
    public void save (  String login,
    String password,
    String nom) throws SQLException{
     
            
        
        
            String command =  "INSERT INTO `admin` (`login`, `password`, `nom`) VALUES ( ?, ?, ?)";
            
            PreparedStatement addstmt = Jdbc.getconnexion().prepareStatement(command);
            
            addstmt.setObject(1, login);
            addstmt.setObject(2, password);
            addstmt.setObject(3, nom);
            addstmt.execute ();
        
      
    }
      
    public void update( int idadmin , String login, // mettre a jour un élement dans un table
    String password,
    String nom) throws SQLException{
     
            
        
        
            String command = "UPDATE `admin` SET `login` = ?, `password` = ?, `nom` = ?  WHERE `admin`.`idadmin` = ?"; 
            
            PreparedStatement addstmt = Jdbc.getconnexion().prepareStatement(command);
            
            addstmt.setObject(1, login);
            addstmt.setObject(2, password);
            addstmt.setObject(3, nom);
            addstmt.execute ();
        
      
    }
    
    public void delete ( int idadmin ) throws SQLException{ // normalement on n'utilise pas cette methode , car les choses ne se supprime pas comme ca
     
            
        
        
            String command =   "DELETE FROM `admin` WHERE `admin`.`idadmin` = ?";
            
            PreparedStatement addstmt = Jdbc.getconnexion().prepareStatement(command);
            
            addstmt.setObject(1, idadmin);
           
            addstmt.execute ();
        
      
    }
    
    
    
    
    
    public Admin getone(int idadmin) throws SQLException{//  methode permettant de retourner un admintrateur si on reconnait son id
        String cmd= "select* from admin idamin where idadmin = ?";
        
        PreparedStatement stmt = Jdbc.getconnexion().prepareStatement(cmd);
         stmt.setObject (1, idadmin);
         ResultSet rs= stmt.executeQuery();
         
         while(rs.next()){
             return new Admin(rs.getInt(1), rs.getString(2),
                     rs.getString(3), rs.getString(4));
         }
         return null;
    }
     public Admin getByLoginAndPassword(String login, String password) throws SQLException{//  methode permettant de retourner un admintrateur si on reconnait son id
        String cmd= "select * from admin where login = ? and password = ?";
           
        PreparedStatement stmt = Jdbc.getconnexion().prepareStatement(cmd);
         stmt.setObject (1, login);
         stmt.setObject (2, password);
         ResultSet rs= stmt.executeQuery();
         
         while(rs.next()){
             return new Admin(rs.getInt(1), rs.getString(2),
                     rs.getString(3), rs.getString(4));
         }
         return null;}
     
     public List<Admin> getALLAdmin() throws SQLException{ // methode pour retourner tout les  admins  qui existe 
        String cmd= "select * from `admin`";
        
        PreparedStatement stmt = Jdbc.getconnexion().prepareStatement(cmd);
         
         ResultSet rs= stmt.executeQuery();
         List<Admin> listAdmin = new ArrayList<>();
         while (rs. next ()){
             listAdmin.add (new Admin(rs.getInt(1), rs.getString(2),
                     rs.getString(3), rs.getString(4)));
         }
         return listAdmin;
     }
    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
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

    public Admin() {
    }

    public Admin(int idadmin, String login, String password, String nom) {
        this.idadmin = idadmin;
        this.login = login;
        this.password = password;
        this.nom = nom;
    }

    @Override
    public String toString() { // insert code , two string
        return "Admin{" + "idadmin=" + idadmin + ", login=" + login + ", password=" + password + ", nom=" + nom + '}';
    }
    
        
    public static void main (String arg[]){
       
        try {
            Admin admin = new Admin();
           String result = admin.getone(2).toString();
            System.out.println(result);
       
       //result = admin.getByLoginAndPassword("takuma","gilbert").toString();
       //System.out.println(result);
           //String result = admin.getALLAdmin().toString();
           System.out.println(result);
           
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    
    }

   
    
    
}
