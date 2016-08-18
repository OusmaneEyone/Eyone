package com.example.nanouch.applicationeyonnemobile.Modele;


public class Annuaire {

    private String prenom, nom;
    private String email;
    private String profil;

    public Annuaire(String prenom, String nom, String email, String profil) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.profil = profil;
    }

    public void setPrenom(String prenom) {

        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getPrenom() {

        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public String getProfil() {
        return profil;
    }
}
