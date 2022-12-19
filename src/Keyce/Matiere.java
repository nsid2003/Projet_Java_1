package Keyce;

public class Matiere {
    private String IDmatiere;
    private String UniteEnseignement;
    private String intitule ="apprendre à s'exprimer";
    private int credit;
    private String VolumeHoraire;

    //Matiere Maths = new Matiere();
    //Matiere UMl = new Matiere();

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

    public String getIDmatiere() {
        return IDmatiere;
    }

    public void setIDmatiere(String IDmatiere) {
        this.IDmatiere = IDmatiere;
    }

    public String getUniteEnseignement() {
        return UniteEnseignement;
    }

    public void setUniteEnseignement(String uniteEnseignement) {
        UniteEnseignement = uniteEnseignement;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getVolumeHoraire() {
        return VolumeHoraire;
    }

    public void setVolumeHoraire(String volumeHoraire) {
        VolumeHoraire = volumeHoraire;
    }
}
