package Enthuware.Test2;

public interface Flyer {
    String getName();
}
class Bird implements Flyer {
    public String name;
    public Bird(String name){
        this.name = name;
    }
    public String getName(){
        System.out.println("i am from bird");
        return name;
    }

}
class Eagle extends Bird {
    public Eagle(String name){
        super(name);
    }
}



