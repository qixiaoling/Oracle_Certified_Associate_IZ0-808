package Enthuware.Test7;

public class q39 {
}

class A{
    static {
        System.out.println(5);
    }
    {
        System.out.println(6);
    }
public A() { }
public A(int i) {   System.out.println(i );    }
        }
class B{

    static A s1 = new A(1);
    static {
        System.out.println(7);
    }
    A a = new A(2);
    public static void main(String[] args){
        B b = new B();
        A a = new A(3);
    }
    static A s2 = new A(4);
}