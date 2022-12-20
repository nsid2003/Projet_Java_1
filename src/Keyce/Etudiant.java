package Keyce;

import java.util.Date;
import java.util.PrimitiveIterator;

public class Etudiant extends Personne { // classe fille de la classe parent
    private  int IDetudiant =1003 ;

    public class Programme extends Personne{
        private String Intitule;

        private String horaire;

        private String jour;


    }

    public int getIDetudiant() {
        return IDetudiant;
    }

    public void setIDetudiant(int IDetudiant) {
        this.IDetudiant = IDetudiant;
    }
}


