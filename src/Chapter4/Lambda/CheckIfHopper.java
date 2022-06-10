package Chapter4.Lambda;

import Chapter4.Lambda.Animal;

public class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a){
        return a.canHop();
    }

}
