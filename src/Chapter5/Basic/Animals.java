package Chapter5.Basic;

public class Animals {
    private int age;
    public static final int YOUNGER_AGE = 3;
    public static final String NICK_NAME = "big_ears";
    private String name;
    public Animals(int givenAge, String givenName){
        this.age = givenAge;
        this.name = givenName;
    }
    public Animals(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }





}
