package College;

import Keyce.Enseigant;
import Keyce.Etudiant;
import Keyce.Student;

public class Main {
    public static void main(String[] args) {

        Student frida = new Student();
        frida.obeir();

        System.out.println("Hello world!");

        Etudiant nsid = new Etudiant();
        int x = nsid.getIDetudiant();
        System.out.println(x);
        nsid.setIDetudiant(2002);
        int Y = nsid.getIDetudiant();
        System.out.println(Y);

        Enseigant daryl = new Enseigant();  // creation de l'objet daryl
        String a = daryl.getNom();  // recupérer la valeur de la variable nom lorqu'il est déclaré en private et l'affecter dans la variable a
        System.out.println(a); // afficher la variable qu'on a recupéré
        daryl.setNom("Matias"); // modifier la valeur de la variable nom de la classe enseignant
        String b = daryl.getNom(); // affectation de la nouvelle valeur dans une variable
        System.out.println(b);  // afficher la nouvelle valeur qu'on a affecter à la variable nom de la classe enseignant



    }



}