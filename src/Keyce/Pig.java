package Keyce;
// si toutes les methodes de l'interface ne sont pas appelées, il aura une erreur.
public class Pig implements Animal{ // cette classe accède aux methodes de l'interface grace au mot clé "implements"
    public void animalsound() {
        System.out.println("the pig said : wee wee");

    }

    public void run() {
        System.out.println("le porc fuit quand il voit Aaron!");
    }

    @Override
    public void sleep() {
        System.out.println("le porc dort après avoir mangé !");
    }
}
