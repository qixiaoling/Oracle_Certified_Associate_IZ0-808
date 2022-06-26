package Enthuware.Test4;

class TestFinal {
    final int num =1;
    public final void counter(){
        System.out.println("counter");
    }

}

class ChildTester extends TestFinal{
    final int num = 3;

    public static void main(String[] args) {
        TestFinal t = new TestFinal();
        System.out.println(t.num);
        ChildTester c = new ChildTester();
        System.out.println(c.num);
    }

}
