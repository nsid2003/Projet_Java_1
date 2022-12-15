public class Matiere {
    String IDmatiere;
    String UniteEnseignement;
    String intitule;
    int credit;
    String VolumeHoraire;

    Matiere Maths = new Matiere();
    Matiere UMl = new Matiere();

    public void EtreDispenser() {

    }

    public void Annuler() {

    }

    public Matiere() {
    }

    public Matiere(String IDmatiere, String uniteEnseignement, String intitule, int credit, String volumeHoraire) {
        this.IDmatiere = IDmatiere;
        this.UniteEnseignement = uniteEnseignement;
        this.intitule = intitule;
        this.credit = credit;
        this.VolumeHoraire = volumeHoraire;
    }
}
