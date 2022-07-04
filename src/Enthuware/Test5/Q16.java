package Enthuware.Test5;

public class Q16 {
    public static void main(String[] args) {
        System.out.println(Sub.ID);
    }
}
class Super{
    static String ID = "QBANK";
}

class Sub extends Super {
    static {
        System.out.println("In Sub");
    }
}
