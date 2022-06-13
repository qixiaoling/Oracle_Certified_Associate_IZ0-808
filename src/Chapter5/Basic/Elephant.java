package Chapter5.Basic;

public class Elephant extends Animals {
    private int elephantAge;
    private String elephantName;
    public Elephant(int anotherAge){
        super(anotherAge, NICK_NAME);
    }
//    //parents has to have one parameter, therefore super=calling parent constructor and that one NEEDS int givenAge!

    public Elephant(){
        super(YOUNGER_AGE);
    }

    public static void main(String[] args) {
        Elephant e = new Elephant();
        System.out.println(e.getAge());
        Elephant eAge = new Elephant(7);
        System.out.println(eAge.getAge() + " her name is:" + eAge.getName());
    }


}
