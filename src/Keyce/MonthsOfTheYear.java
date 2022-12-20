package Keyce;

public enum MonthsOfTheYear implements Animal{
    JANUARY,
    FEBUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER; // il faut conculure les enum avec un ";" dans la mesure ou on veut ajouter d'autes éléments dans l"enum

    public void animalsound(){
        System.out.println("les animaux ont des saisons ");
    };

    public void run(){
        System.out.println("les animaux courent par saisons");
    };
    public void sleep(){
        System.out.println("les ours hibernenet en hivers");
    };
}
