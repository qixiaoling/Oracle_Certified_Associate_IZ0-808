package Chapter5.CallingConstructor;

public class CallingChimpanzee extends CallingApe{

    public CallingChimpanzee(){
        System.out.println("Chimpanzee");
    }
    public static void main(String[] args) {
        new CallingChimpanzee();
    }
}
