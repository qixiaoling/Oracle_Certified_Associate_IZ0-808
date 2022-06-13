package Chapter4.JavaArray;

import java.util.ArrayList;
import java.util.List;

public class Rabbit {
    private String name;

    public Rabbit(String rabbitName){
        this.name = rabbitName;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public static void main(String[] args) {
        List<Rabbit> l = new ArrayList<>();
        Rabbit r1 = new Rabbit("Harry");
        Rabbit r2 = new Rabbit("Timo");
        Rabbit r3 = new Rabbit("Jerry");
        Rabbit r4 = new Rabbit("Hendry");
        Rabbit r5 = new Rabbit("Nino");
        l.add(r1);
        l.add(r2);
        l.add(r3);
        l.add(r4);
        l.add(r5);




        l.removeIf(a -> a.getName().startsWith("H"));

        for (Rabbit r:l){
            System.out.println(r.name);
        }
    }
}
