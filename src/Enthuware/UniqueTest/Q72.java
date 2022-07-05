package Enthuware.UniqueTest;

import java.util.ArrayList;
import java.util.List;

public class Q72 {
    public static void main(String[] args) {
        List<String> s1 = new ArrayList<String>();
        String s = null;
        s1.add("a");
        s1.add(s);
        s1.add("b");
        System.out.println(s1);
    }
}
