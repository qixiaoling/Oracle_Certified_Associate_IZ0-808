package Enthuware.Test6;

public class ProtectedClass {
    protected int n = 5;
}
class ChildFromProtected extends ProtectedClass {
    public static void main(String[] args) {
        ProtectedClass p = new ProtectedClass();
        p.n = 10;
        System.out.println(p.n);
    }
}
