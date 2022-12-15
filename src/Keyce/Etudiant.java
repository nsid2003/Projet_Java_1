package Keyce;

import java.util.Date;

public class Etudiant {
    private  int IDetudiant = 1001;
    private String nom;
    private String prenom;
    private String Matricule;
    private Date DateNaissance;
    private String sexe;
    private Integer NumeroTelephone;
    private String Email;

    //Keyce.Etudiant Daryl = new Keyce.Etudiant();
    //Keyce.Etudiant Aaron = new Keyce.Etudiant();

    public void ParticiperCours() {

    }

    public void Composer() {

    }

    public Etudiant() {

    }

    public Etudiant(int IDetudiant, String nom, String prenom, String matricule, Date dateNaissance, String sexe, Integer numeroTelephone, String email) {
        this.IDetudiant = IDetudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.Matricule = matricule;
        this.DateNaissance = dateNaissance;
        this.sexe = sexe;
        this.NumeroTelephone = numeroTelephone;
        this.Email = email;
    }

    public int getIDetudiant() {
        return IDetudiant;
    }

    public void setIDetudiant(int IDetudiant) {
        this.IDetudiant = IDetudiant;
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

    public String getMatricule() {
        return Matricule;
    }

    public void setMatricule(String matricule) {
        Matricule = matricule;
    }

    public Date getDateNaissance() {
        return DateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        DateNaissance = dateNaissance;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}


