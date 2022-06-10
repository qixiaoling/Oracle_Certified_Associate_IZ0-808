package Chapter4;

public class OrderOfInitialization {

    public static int mouses = 55;
    static {
        System.out.println("2");
    }

    ;

    static void add(int num) {
        System.out.println("num");
    }

    OrderOfInitialization() {
        System.out.println("5");
    }



    {
        System.out.println(mouses);
        System.out.println("6");
    }

    static {
        new OrderOfInitialization();
        System.out.println(" toch maar deze static printen.");
    }

    static {
        System.out.println("4");
    }

    {
        System.out.println("8");
    }

    public static void main(String[] args) {

    }


//    public static long main(String[] args) {
//
//        System.out.println(" hello");
//        return 10L;
//}
}
