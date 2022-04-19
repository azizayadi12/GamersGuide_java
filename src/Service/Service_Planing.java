/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import datasource.Connexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entite.Planning;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import static sun.net.www.http.HttpClient.New;

/**
 *
 * @author aziz
 */
public class Service_Planing {
    
    public void ajouterPlaning(Planning planing) {
        
        try {
            System.out.print("gggg");
            String requete = "INSERT INTO planning (titre,description) VALUES (?,?) ";
            PreparedStatement pst = Connexion.getInstance().getCnx().prepareStatement(requete);
            pst.setString(1, planing.getTitre());
            pst.setString(2, planing.getDescription());
            pst.executeUpdate();
            System.out.println("Planing ajouter avec succes");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
        
    }
     
    public void modifPlaning(int id_planing, String titre, String description ) {
   
        String requete = "UPDATE planning set titre=?, description=? WHERE id='"+id_planing+"'";
        try {
            PreparedStatement pst = Connexion.getInstance().getCnx().prepareStatement(requete);
            pst.setString(1,titre);
            pst.setString(2,description);
            pst.executeUpdate();
            System.out.println("Planing modifie avec succes");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
   
    public ArrayList<Planning> selectAllPlaning() {
        
           ArrayList<Planning> planingList =new ArrayList<Planning>();

        
            try{
                String requete = "SELECT * FROM planning ";
                Statement statement = Connexion.getInstance().getCnx().createStatement();
                ResultSet resultSet = statement.executeQuery(requete);
                while(resultSet.next()){
                    Planning planing = new Planning();
                    planing.setId_planning(resultSet.getInt("id"));
                    planing.setTitre(resultSet.getString("titre"));
                    planing.setDescription(resultSet.getString("description"));
                    System.out.println("***************************************");
                    System.out.println(resultSet.getString("description"));
                                       System.out.println("***************************************");

                       planingList.add(planing);
                   
                }
            
            }
            
            catch (SQLException ex) {
                System.err.println(ex.getMessage());
        }
            return planingList ;
    }
        
            
       
    
    
     public List<String> selectTitrePlaning() {
        List<String> planingtitre = new ArrayList<>();
        String requete = "SELECT titre FROM planning ";
        String titre;
            try{
                Statement statement = Connexion.getInstance().getCnx().createStatement();
                ResultSet resultSet = statement.executeQuery(requete);
                while(resultSet.next()){
                    titre=(resultSet.getString(1));
                    planingtitre.add(titre);
                }
            
            }
            
            catch (SQLException ex) {
                System.err.println(ex.getMessage());
        }
        
            
        return planingtitre;
    }
    
     public void suppPlaning(int i) {

        try {

            String requete = "DELETE from planning where id=?";
            PreparedStatement prst =  Connexion.getInstance().getCnx().prepareStatement(requete);
            prst.setInt(1,i);
            prst.executeUpdate();
            System.out.println("Planning Supprimé.");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }
}
