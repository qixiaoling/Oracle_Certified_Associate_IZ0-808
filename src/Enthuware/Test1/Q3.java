package Enthuware.Test1;

// Java code to illustrate order of
// execution of constructors, static
// and initialization blocks
class GFG {

    GFG(int x)
    {
        System.out.println("ONE argument constructor");
    }

    GFG()
    {
        System.out.println("No argument constructor");
    }
    static String bookName = "hello-world";

    static
    {
        System.out.println("1st static init");
    }

    {
        System.out.println("1st instance init");
    }

    {
        System.out.println("2nd instance init");
    }

    static
    {
        System.out.println("2nd static init");
    }

    public static void main(String[] args)
    {
        new GFG();
        new GFG(8);
    }
}


