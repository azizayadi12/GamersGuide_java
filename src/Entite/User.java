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
public class User {
    private int id_user ;
    private String nom ;
    private String prenom ;
    private String role ;

    public int getId_user() {
        return id_user;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getRole() {
        return role;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User(int id_user, String nom, String prenom, String role) {
        this.id_user = id_user;
        this.nom = nom;
        this.prenom = prenom;
        this.role = role;
    }
    
    public User() {
    }
    
    
         public String toString() {
        return role + ":" + nom +""+ prenom  ;
    }
    
    
}
