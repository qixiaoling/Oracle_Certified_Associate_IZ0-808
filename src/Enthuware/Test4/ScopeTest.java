package Enthuware.Test4;

import java.util.ArrayList;
import java.util.List;

public class ScopeTest {
    static int x = 5;
    public ScopeTest(int x){
        this.x = x;
    }

    public static void main(String[] args) {
//        int x = ( x=3 )* 4;
//        int x = 6;
//        System.out.println(x);
//        Integer i=9;
//        System.out.println(i);
//        List list = new ArrayList();
//        list.add(new String("hi"));
            Integer obj = 6;
            Integer obj_new = obj++;
        System.out.println(obj_new);

    }
}
