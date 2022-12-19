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



    }















    }








//}