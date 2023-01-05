package College;

import Keyce.*;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

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

       /* Scanner name = new Scanner(System.in); // creation d'un objet Scanner
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

        name.close();*/

        LocalDate MyObj = LocalDate.now(); // creation de l'objet Myobjet et insctantie l'objet avec la methode now()
        System.out.println( "Aujourd'hui nous sommes le " + MyObj);

        LocalTime Myobj1 = LocalTime.now();
        System.out.println("Actuellement il est:" + Myobj1);

        LocalDateTime Myobj2 = LocalDateTime.now();
        System.out.println("Before formatting " + Myobj2);
        DateTimeFormatter MyFormatObj = DateTimeFormatter.ofPattern("E, dd MMM yyyy HH:mm "); // .ofpattern est la méthode qui permet d'entrer le format de date qu'on veut mettre

        String FormattedDate = Myobj2.format(MyFormatObj); // recupération de la date formatée
        System.out.println("La date formatée est " + FormattedDate);


        ArrayList<String> Voitures = new ArrayList<String>(); // create un objet Arraylist ( tableau)
        Voitures.add("Pagani Zonda R"); // ajouter les éléments dans les arraylists
        Voitures.add("Ferrari");
        Voitures.add("Bugatti");
        Voitures.add("Mercedes Avatar");
        Voitures.add("Lotus");
        Voitures.add("Porsche");
        Voitures.add("Mitsubishi");
        Voitures.add("Citroen");
        System.out.println(Voitures);

        String p = Voitures.get(3); // la methode .get permet de recuperer les éléments du tableau
        System.out.println(p);

        Voitures.set(7, "Citroen C4 picasso");
        System.out.println(Voitures);

        Voitures.remove(5); // pour supprimer un élément du tableau
        System.out.println(Voitures);

        Voitures.clear(); // cette methode permet de supprimer tous les éléments d'une tableau
        System.out.println(Voitures);
        Voitures.add("Pagani Zonda R"); // ajouter les éléments dans les arraylists
        Voitures.add("Ferrari");
        Voitures.add("Bugatti");
        Voitures.add("Mercedes Avatar");
        Voitures.add("Lotus");
        Voitures.add("Porsche");
        Voitures.add("Mitsubishi");
        Voitures.add("Citroen");
        System.out.println(Voitures);

        int taille = Voitures.size();
        System.out.println(taille);

        Voitures.remove(3);
        int taille2 = Voitures.size();
        System.out.println(taille2);

        for (int i = 2; i < Voitures.size(); i++)
        {
            System.out.println(Voitures.get(i));
        }
        String w = Voitures.get(2);
        System.out.println(w);
        Collections.sort(Voitures); // cette methode permet de mettre les éléments de la liste en ordre alphabétique
        System.out.println(Voitures);
        String l = Voitures.get(2);
        System.out.println(l);


        LinkedList<String> Moto = new LinkedList<String>();
        Moto.add("Yamaha");
        Moto.add("Nagasaki");
        Moto.add("Sanili");
        Moto.add("Bajar");
        System.out.println(Moto);

        Moto.addFirst("Senke");
        Moto.addLast("Cross");
        System.out.println(Moto);
        Moto.removeFirst();
        System.out.println(Moto);
        Moto.removeLast();
        System.out.println(Moto);
        String t =Moto.getFirst();
        System.out.println(t);
        String e = Moto.getLast();
        System.out.println(e);

        HashMap<String, String> Capitale = new HashMap<String, String>();// creation d'un objet HashMap qui permet de faire des collections
        Capitale.put("Cameroun", "Yaoundé"); // insertion des éléments dans la collection
        Capitale.put("France", "Paris");
        Capitale.put("Angleterre", "Londres");
        Capitale.put("Espagne", "Madrid");
        Capitale.put("Catalogne", "Barcelone");
        System.out.println(Capitale);

        String k = Capitale.get("Angleterre");
        System.out.println(k);

        int y = Capitale.size();
        System.out.println(y);
        System.out.println("Affichage des clés");
        for (String i : Capitale.keySet()) // affichage fes clés
        {
            System.out.println(i);
        }

        System.out.println("Affichage des valeurs");
        for (String i : Capitale.values()) // affichage fes clés
        {
            System.out.println(i);
        }

        System.out.println("Affichages des clés et de leurs valeurs");
        for (String i : Capitale.keySet()) // affichage fes clés
        {
            System.out.println("key: " + i + "," + " value: " + Capitale.get(i) +"\n");
        }

        HashMap<String, Integer> Personne = new HashMap<String, Integer>();
        Personne.put("Choupette", 17);
        Personne.put("Frida", 18);
        Personne.put("Nsid", 19);
        Personne.put("Joluke", 30);
        Personne.put("Kawaki", 18);
        Personne.put("Bosco", 22);

        System.out.println("Affichage des personnes et de leur age\n");
        for (String i : Personne.keySet())
        {
            System.out.println("clé: " + i + "," + " valeur: " + Personne.get(i)+"\n");

        }

        HashSet<String> Marques = new HashSet<String>(); // creation d'un Hashset
        Marques.add("Adidas");
        Marques.add("Nike");
        Marques.add("Puma");
        Marques.add("Channel");
        System.out.println(Marques);

        //System.out.println( Marques.contains("Nike")); // pour verifier si un élément éxiste on utilise la methode clé ".contains()"

        boolean exist =  Marques.contains("Feragamo");
        System.out.println(exist);

        HashSet<Integer> Cacao = new HashSet<Integer>(); // creation d'un Hashset
        Cacao.add(200);
        Cacao.add(600);
        Cacao.add(2000);
        Cacao.add(800);
        for (int i : Cacao) {
            System.out.println(i);}

        for (int i : Cacao){
            System.out.println("Bosco a vendu : " + i + " tonnes de Cacao");}

















    }


}


//}