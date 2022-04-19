/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Psico
 */
public class Connexion {

     private  Connection cnx;

    public Connection getCnx() {
        return cnx;
    }

    public static Connexion getCc() {
        return cc;
    }
     
     static Connexion cc;
    
    
       public Connexion(){
        
        	String  utilisateur= "root";
			String motPasse="";
			try
				{
				
				cnx= (Connection) DriverManager.getConnection(  
			          "jdbc:mysql://localhost:3306/pidev",utilisateur, motPasse);
                                System.out.println("connexion reussite");
                                }
			catch (SQLException e)
				{System.out.println("erreur pendant la connexion");}
        
    }
       
       public static Connexion getInstance(){
           
           if (cc==null){
               cc =  new Connexion();
           }
           
           return cc;
       }
       
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
