package Keyce;

public class Enseigant {
    private String IDenseignant;
    private String nom= "Bernard";
    private String prenom;
    private String dateNaissance;
    private String e_mail;
    private String MatriculeEnseignants;

    //Keyce.Enseigant Toko = new Keyce.Enseigant();

    //Keyce.Enseigant Bechir =new Keyce.Enseigant();

    public void FaireEvaluation() {

    }

    public void DispenserCours() {

    }

    public Enseigant() {
    }

    public Enseigant(String IDenseignant, String nom, String prenom, String dateNaissance, String e_mail, String matriculeEnseignants) {
        this.IDenseignant = IDenseignant;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.e_mail = e_mail;
        this.MatriculeEnseignants = matriculeEnseignants;
    }

    public String getIDenseignant() {
        return IDenseignant;
    }

    public void setIDenseignant(String IDenseignant) {
        this.IDenseignant = IDenseignant;
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

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getMatriculeEnseignants() {
        return MatriculeEnseignants;
    }

    public void setMatriculeEnseignants(String matriculeEnseignants) {
        MatriculeEnseignants = matriculeEnseignants;
    }
}
