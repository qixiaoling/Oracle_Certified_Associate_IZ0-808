package Chapter5.questions.Constructor_questions;

import java.lang.reflect.AnnotatedArrayType;

public class Zebra extends Animal{

    public int youngerAge;
  public Zebra(int zebraAge){
      super(zebraAge);
  }
  public Zebra(){
      super(20);
  }

    public static void main(String[] args) {
        Zebra z = new Zebra(10);
        Animal a = new Animal(5);
        Animal mixedA = new Zebra(10);
        Animal mixedB = new Zebra();
        System.out.println(mixedB.getAge());

    }
}
