/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

/**
 *
 * @author aziz
 */
public class Planning {
    private int id_planning ;
    private String titre ;
    private String description ;

    public int getId_planning() {
        return id_planning;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public void setId_planning(int id_planning) {
        this.id_planning = id_planning;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Planning() {
    }

    public Planning(int id_planning, String titre, String description) {
        this.id_planning = id_planning;
        this.titre = titre;
        this.description = description;
    }

    public Planning(String titre, String description) {
        this.titre = titre;
        this.description = description;
    }
    
    public Planning (int id_planing) {
               this.id_planning = id_planning;

    }
    
    @Override
    public String toString() {
        return "Planning{" + "Titre=" + titre + '}';
    } 
}

