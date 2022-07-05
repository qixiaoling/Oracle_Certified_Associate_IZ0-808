package Chapter5.Polymorphyism.Down_Up_Casting;

public class Dog extends Animal {

    @Override
    public void makeNoise(){
        System.out.println("Woof Woof");
    }
    public void growl(){
        System.out.println("Grrrrr");
    }
}
