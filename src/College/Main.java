package College;

import Keyce.*;

//package mypack;
//class MyPackageClass {
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


    }


}


//}