package Keyce;

public class Staff {
    String IDstaff;
    String nom;
    String prenom;
    String Matricule="";
    String DateNaissance;
    String sexe;
    Integer NumeTelephone;
    String e_mail;

    Staff Melvyn = new Staff();
    Staff Vianney = new Staff();


    static void Renvoyer() {

    }

    public void Engager() {

    }

    public Staff() {
    }

    public Staff(String IDstaff, String nom, String prenom, String matricule, String dateNaissance, String sexe, Integer numeTelephone, String e_mail) {
        this.IDstaff = IDstaff;
        this.nom = nom;
        this.prenom = prenom;
        this.Matricule = matricule;
        this.DateNaissance = dateNaissance;
        this.sexe = sexe;
        this.NumeTelephone = numeTelephone;
        this.e_mail = e_mail;
    }
}
