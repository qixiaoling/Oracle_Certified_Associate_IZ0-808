package Enthuware.UniqueTest;

public class Q28 {
    public int int_q28 = 11;
    public void perform_work(){
        System.out.println("I am in Q28");
    }


}

class B extends Q28{

    public int int_b = 22;
    public void perform_work(){
        System.out.println("I am in B");
        super.perform_work();

    }
}

class C extends B {
    public int int_c = 33;
    public void perform_work(){
        System.out.println("I am in C");
        super.perform_work();

    }

    public static void main(String[] args) {
        C c = new C();
        c.perform_work();

        System.out.println("----------------");

        B b = new C();
        b.perform_work();

        System.out.println("----------------");

        Q28 q28 = new Q28();
        q28.perform_work();

        System.out.println("----------------");

        Q28 anotherQ = new B();
        anotherQ.perform_work();

        System.out.println("----------------down casting -----------------");

        C cc = new C();
        Q28 aa = cc;
        B bb = cc;

        C ccc = (C)bb;
        System.out.println(ccc.int_b);
        System.out.println(ccc.int_q28);
        System.out.println(ccc.int_c);
        ccc.perform_work();








    }
}
