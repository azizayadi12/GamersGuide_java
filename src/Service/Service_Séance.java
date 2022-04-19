/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entite.Seance;
import datasource.Connexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entite.Planning;
import Entite.User;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aziz
 */
public class Service_Séance {
    public void ajouterSeance(Seance seance) {
        
        try {
            String requete = "INSERT INTO seance (date,dure,prix,coach_id,planning_id,nbre_place) VALUES (?,?,?,?,?,?) ";
            PreparedStatement pst = Connexion.getInstance().getCnx().prepareStatement(requete);
            pst.setString(1, seance.getDate());
            pst.setFloat(2, seance.getDuree());
            pst.setFloat(3, seance.getPrix());
            pst.setFloat(4, 1);
            pst.setInt(5, seance.getId_plannig().getId_planning()) ;
            pst.setInt(6, seance.getNbrplace());



            
            pst.executeUpdate();
            System.out.println("Seance ajouter avec succes");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
        
    }
     public void modifSeance(int id_seance, String date, float duree,float prix,int nbrplace ) {
        String requete = "UPDATE Seance set date=?, dure=?,prix=?,nbre_place=? WHERE id='"+id_seance+"'";
        try {
            PreparedStatement pst = Connexion.getInstance().getCnx().prepareStatement(requete);
            pst.setString(1,date);
            pst.setFloat(2,duree);
            pst.setFloat(3,prix);
            pst.setFloat(4,nbrplace);


            pst.executeUpdate();
            System.out.println("Seance modifie avec succes");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
      public List<Seance> selectAllSeance() {
        List<Seance> seanceList = new ArrayList<>();
        String requete = "SELECT * FROM seance ";
            try{
                Statement statement = Connexion.getInstance().getCnx().createStatement();
                ResultSet resultSet = statement.executeQuery(requete);
                while(resultSet.next()){
                    Seance seance = new Seance();
                    Planning planing = new Planning();
                    User coach =new User();
                    seance.setId_seance(resultSet.getInt(1));
                    seance.setDate(resultSet.getString(2));
                    seance.setDuree(resultSet.getFloat(3));
                    seance.setPrix(resultSet.getFloat(4));
                    
                    planing.setId_planning(resultSet.getInt(5));
                    seance.setId_plannig(planing) ;
                    coach.setId_user(resultSet.getInt(6));
                    seance.setId_user(coach) ;
                    seance.setNbrplace(resultSet.getInt(7));
                    

 
                    seanceList.add(seance);
                }
            
            }
            
            catch (SQLException ex) {
                System.err.println(ex.getMessage());
        }
        
        return seanceList;
    }
      public void suppSeance(int i) {

        try {

            String requete = "DELETE from seance where id=?";
            PreparedStatement prst =  Connexion.getInstance().getCnx().prepareStatement(requete);
            prst.setInt(1,i);
            prst.executeUpdate();
            System.out.println("Seance Supprimé.");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }
   
}
