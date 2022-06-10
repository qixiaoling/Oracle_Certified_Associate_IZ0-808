package Chapter4.Tranditional;

public class CheckIfHopper implements CheckTrait{
    public boolean test(Animal a){
        return a.canHop();
    }

}
