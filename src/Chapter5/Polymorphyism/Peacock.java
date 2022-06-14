package Chapter5.Polymorphyism;

public class Peacock extends Bird{

    public String getName(){
        return "Peacock";
    }

    public static void main(String[] args) {
        Bird bird = new Peacock();
        bird.displayInformation();
        System.out.println(bird.getName());

        Bird bird1 = new Bird();
        bird1.displayInformation();
        System.out.println(bird1.getName());
    }
}
