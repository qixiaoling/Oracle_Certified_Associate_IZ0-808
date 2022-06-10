package Chapter4.Tranditional;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("fish", false, true));
        animalList.add(new Animal("kangaroo", true, false));
        animalList.add(new Animal("rabbit", true, false));
        animalList.add(new Animal("turtle", false, true));

        print(animalList, new CheckIfHopper());

    }

    private static void print(List<Animal> animalList, CheckTrait checker){
        for(Animal animal : animalList){
            if(checker.test(animal)){
                System.out.println(animal + " ");
            }
        }
        System.out.println();
    }





}
