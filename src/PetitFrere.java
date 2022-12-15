abstract class PetitFrere {
    public String fname = "Choupette";
    public int age = 17;



    public abstract void obeir();





}

class Student extends PetitFrere{
    public int graduationYear = 2018;

    public void obeir() {
        System.out.println("studing all day long");

    }
}

