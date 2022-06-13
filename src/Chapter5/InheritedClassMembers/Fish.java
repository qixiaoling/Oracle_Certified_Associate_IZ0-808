package Chapter5.InheritedClassMembers;

public class Fish {
    protected int size;
    private int age;

    protected String country = "Fish_Village";

    public Fish(int age){
        this.age = age;

    }

    public int getAge(){
        return this.age;
    }
    public static boolean hasEggs(){
        return false;
    }

    public void getFishCountry(){
        System.out.println("Fish comes from: " + country);
    }
    public void getFishEggsReport(){
        System.out.println("Fish has eggs?" + hasEggs());
    }

    public final static void eatGrass(){
        System.out.println("Grass is nice.");
    }


}
