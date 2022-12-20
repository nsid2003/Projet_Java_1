package College;

import Keyce.*;
import java.util.Scanner;
//package mypack;
//class MyPackagelass {
public class Main {
    public static void main(String[] args) {

        Student frida = new Student();
        frida.obeir();

        System.out.println("Hello world!");


        System.out.println("This is my package!");

        Etudiant Daryl = new Etudiant();
        Daryl.surfer();
        Daryl.telephoner();

        String o = Daryl.getNom();
        System.out.println(o);

        Parents ismael = new Parents(); // creation d'un objet de la classe parents
        ismael.surfer(); // heritage des méthodes de la classe parent sur l'objet ismael
        ismael.telephoner();

        Enseigant Toko = new Enseigant(); // creation d'un objet Toko de la classe Enseignant
        Toko.surfer();// heritage de la methode surfer sur l'objet Toko
        Toko.telephoner();

        Staff Bernard = new Staff();
        Bernard.surfer();
        Bernard.telephoner();

        Etudiant siewe = new Etudiant();
        Etudiant.Programme fred = siewe.new Programme(); // creation d'un objet de la classe imbriqué
        String n = fred.getNom();
        System.out.println("voici le nom que recupere la variable " + n);

        Pig peppa = new Pig(); // creation de l'objet peppa dans la classe pig
        peppa.run(); //         appelation de la methode run() de l'interface animal
        peppa.sleep();
        DaysOfTheWeek jour = DaysOfTheWeek.SUNDAY; // recuperer la valeur d'une enum
        System.out.println(jour); // affichage de la valeur d'une enum

        MonthsOfTheYear an = MonthsOfTheYear.OCTOBER;
        System.out.println(an);

        switch (jour) {  // l'instruction switch permet de verifier les valeurs correspondantes
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wedndesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
        }

        DaysOfTheWeek Day = DaysOfTheWeek.MONDAY; // recuperation de la valeur d'une enum avec la variable day

        System.out.println("voici les jours de la semaine ");


        for (DaysOfTheWeek day : DaysOfTheWeek.values()) { // entrer la valeur declarée minuscule

            System.out.println(day);
        }

        MonthsOfTheYear Year = MonthsOfTheYear.JANUARY; // recuperation de la valeur d'une enum avec la variable Year

        System.out.println("voici les mois de l'année");


        for (MonthsOfTheYear year : MonthsOfTheYear.values()) { // entrer la valeur declarée minuscule pour afficher toutes les valeurs de l'enum

            System.out.println(year);
        }

        // exercice : ecrire un code qui demande l'heure de depart et la duree du trajet et affiche l'heure d'arrivée

        Scanner name = new Scanner(System.in); // creation d'un objet Scanner
        System.out.println("entrer le nom de l'utilisateur : ");

        // N.B : on est pas obligé de creer plusieurs objets scanner on peut creer un seul et l'utiliser

        String username = name.nextLine(); //  cette ligne permet de recuperer la valeur entrée au clavier
        System.out.println("Bienvenue M." + username); // affichage de la valeur entrée au clavier



        System.out.println("veuillez entrez l'heure de depart!");
        int recup1 =name.nextInt();
        System.out.println("Votre depart est prévu pour :" + recup1 +"H"); // affichage de l'heure de depart


        System.out.println("Veuillez saisir la duree du trajet");
        int recup2 = name.nextInt();
        System.out.println(" la duree de votre trajet est de :" + recup2+"H");

        int m = recup1 + recup2 ;

        if (m < 24){
            System.out.println("vous arriverez à destination à " + m+"H");
        }
        if( m > 24 ){
            int p = - ( 24 - m );
            System.out.println("vous arriverez à destination à " +p+"H");
        }

        name.close();




    }


}


//}