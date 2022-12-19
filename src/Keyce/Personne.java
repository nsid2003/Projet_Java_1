package Keyce;

import java.util.Date;

public class Personne {
    private int IdPersonne ;
    private String Nom = "Ngassa";
    private String Prenom = "ismael";
    private Date DateNaissance;
    private String Email;
    private String Adresse;
    private String sexe;
    private Integer NumeroTelephone;

    public void surfer (){

        System.out.println("je surf sur internet ");

    }

    public void telephoner(){

        System.out.println("je telephone");

    }

    public int getIdPersonne() {
        return IdPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        IdPersonne = idPersonne;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public Date getDateNaissance() {
        return DateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        DateNaissance = dateNaissance;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Integer getNumeroTelephone() {
        return NumeroTelephone;
    }

    public void setNumeroTelephone(Integer numeroTelephone) {
        NumeroTelephone = numeroTelephone;
    }


}



