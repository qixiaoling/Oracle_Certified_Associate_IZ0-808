package Chapter5.InheritedClassMembers;

import Chapter5.Polymorphyism.Bird;
import org.w3c.dom.UserDataHandler;

public class Shark extends Fish {
        private int numberOfFins = 0;

        protected String country = "Shark_Village";
        public Shark(int givenAge){
            super(givenAge);
            this.size = 4;
        }
        public int getAge(){
            return 100;
        }

        public static void countEggs(){
            System.out.println("11 Shark eggs.");
        }

        public void getSharkCountry(){
            System.out.println("Shark comes from: " + country);
        }


        public void displaySharkDetails(){
            //super.getAge(), this.getAge() or getAge()
            System.out.println("Shark with age: " + getAge() );
            //super.size, this.size, size
            System.out.println(" and " + size + " meters long");
            //this.numberOfFins, numberOfFins
            System.out.println(" with" + numberOfFins + " fins");
            super.getFishEggsReport();
            this.getFishEggsReport();
            System.out.println("Fish.hasEggs() => " + super.hasEggs());
            System.out.println("Shark.hasEggs() => " + hasEggs());
            System.out.println("Fish.hasEggs() => " + Fish.hasEggs());
            System.out.println("Shark.hasEggs() => " + this.hasEggs());
            eatGrass();

            System.out.println(super.country);
            System.out.println(this.country);
            System.out.println(country);


        }


    public static  boolean hasEggs(){
        return true;
    }
    public void getSharkEggsReport(){
        System.out.println("Shark has eggs?" + hasEggs());
    }


    public static void main(String[] args) {
        Shark s = new Shark(55);
        Fish f = new Fish(33);
//        s.displaySharkDetails();
//        s.getFishEggsReport();
//        s.getSharkEggsReport();
//        System.out.println(Fish.hasEggs());
//        System.out.println(Shark.hasEggs());
//        Fish.eatGrass();
//        Shark.eatGrass();
//        f.getFishCountry();
//        s.getSharkCountry();
//        System.out.println(s.country);
//        System.out.println(f.country);
        System.out.println("----" + f.getAge());
        System.out.println(" -----" + s.getAge());

        Fish fishPolly = new Shark(155);
        System.out.println(fishPolly.getAge());
        System.out.println(fishPolly.age);








    }

}
