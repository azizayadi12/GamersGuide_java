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
public class Seance {
    private int id_seance ;
    private String date ;
    private float duree ;
    private float prix ;
    private int nbrplace ;
    private Planning id_plannig ;
    private User id_user ;

    public int getId_seance() {
        return id_seance;
    }

    public String getDate() {
        return date;
    }

    public Seance(String date, float duree, float prix, int nbrplace, Planning id_plannig) {
        this.date = date;
        this.duree = duree;
        this.prix = prix;
        this.nbrplace = nbrplace;
        this.id_plannig = id_plannig;
    }

    public float getDuree() {
        return duree;
    }

    public float getPrix() {
        return prix;
    }

    public int getNbrplace() {
        return nbrplace;
    }

    public Planning getId_plannig() {
        return id_plannig;
    }

    public User getId_user() {
        return id_user;
    }

    public void setId_seance(int id_seance) {
        this.id_seance = id_seance;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDuree(float duree) {
        this.duree = duree;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setNbrplace(int nbrplace) {
        this.nbrplace = nbrplace;
    }

    public void setId_plannig(Planning id_plannig) {
        this.id_plannig = id_plannig;
    }

   
    public void setId_plannig0(int id_planing) {
        Planning plan = new Planning(id_planing) ;
        
        this.id_plannig = id_plannig;
    }
    
    
    
    public void setId_user(User id_user) {
        this.id_user = id_user;
    }

    public Seance(int id_seance, String date, float duree, float prix, int nbrplace, Planning id_plannig, User id_user) {
        this.id_seance = id_seance;
        this.date = date;
        this.duree = duree;
        this.prix = prix;
        this.nbrplace = nbrplace;
        this.id_plannig = id_plannig;
        this.id_user = id_user;
    }

    public Seance() {
    }

   
} 
