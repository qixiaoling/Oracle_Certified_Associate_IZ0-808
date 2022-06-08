package Chapter1;

import java.util.Arrays;
import java.util.List;

public class Practice {
//    private static int yesterday = 1;
//    int tomorrow = 10;
//    public static void main(String[] args){
//        Practice p = new Practice();
//        int today = 20, tomorrow = 40;
//        System.out.println(today + p.tomorrow + p.yesterday);
//    }



//    private static boolean heatWave = true;

    public static void main(String[] args) {
//        boolean heatWave = false;
//        String a;
//        System.out.println(heatWave);
//        a = "hap";
//        System.out.println(a);
//        Integer integer = new Integer(4);
//        System.out.println(integer.byteValue());

//        String[] nyc= new String[] { "Downtown", "Uptown", "Brooklyn" };
//        String[] times = new String[] { "Day", "Night" };
//        for (int i=0, j = 0; i< nyc.length && j< times.length; i++,j++){
//            System.out.println(nyc[i] + "" + times[j] + "-" );
//
//        }

        List<String> exams = Arrays.asList("OCA", "OCP");
        for(String e1: exams){
            for(String e2: exams){
                System.out.println(e1+"space"+e2);
            }
        }

    }


//   Integer a = Integer.valueOf("1");
//    float pi = (float)3.14;


}
