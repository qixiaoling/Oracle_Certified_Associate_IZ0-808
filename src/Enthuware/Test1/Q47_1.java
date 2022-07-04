package Enthuware.Test1;

public class Q47_1 {
    public static void main(String[] args) {
        int i = 0 ;
        boolean bool1 = false ;
        boolean bool2 = true;

        boolean a;
        boolean b;
        boolean c;
        boolean d;


        a = ( bool2 &  method1(i++) ); //1
        b = ( bool2 && method1(i++) ); //2
        c = ( bool1 |  method1(i++) ); //3
        d = ( bool1 || method1(i++) ); //4
        System.out.println(i);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
    public static boolean method1(int i){
        return i>0 ? true : false;
    }

}
