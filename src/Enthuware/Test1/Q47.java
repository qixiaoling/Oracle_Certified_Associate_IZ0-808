package Enthuware.Test1;

public class Q47 {

    public static void main(String[] args) {
        boolean a = false || true;
        boolean z = false && true;
        System.out.println(a);

        int i = 0 ;
        boolean bool1 = true ;
        boolean bool2 = false;

        boolean b  = false;
        boolean c = false;
        b = ( bool1 && method1(i++) ); //2
        c = ( bool2 || method1(i++) ); //4
        System.out.println(i);
        System.out.println(b);
        System.out.println(c);
        System.out.println(z);
    }
    public static boolean method1(int i){
        return i>0 ? true : false;
    }

    public float parseFloat(String s){
        float f = 0.0f;
        try{
            f = Float.valueOf(s).floatValue();
            return f ;
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid input " + s);
            f = Float.NaN ;
            return f;
        }
        finally { System.out.println("finally");  }
    }


}
