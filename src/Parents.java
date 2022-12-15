import java.util.Date;

public class Parents {
    String IDparent;
    String nom;
    String prenom;
    Date DateNaissance;
    String Email;

    Parents Choupette = new Parents();
    Parents Frida = new Parents();

    public void Inscription() {

    }

    public void DemandeReleve() {

    }

    public Parents() {

    }

    public Parents(String IDparent, String nom, String prenom, Date dateNaissance, String email) {
        this.IDparent = IDparent;
        this.nom = nom;
        this.prenom = prenom;
        this.DateNaissance = dateNaissance;
        this.Email = email;
    }




}


