package Enthuware.Test3;

class Base {
    public void methodA(){
        System.out.println("A IN Q48");
    }
}
class Sub extends Base {
    public void methodA(){
        System.out.println("A IN SUB");
    }
    public void methodB(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        Base b = new Sub();
        b.methodA();
        Sub sub = (Sub)b;
        sub.methodA();
        sub.methodB();
    }
}
