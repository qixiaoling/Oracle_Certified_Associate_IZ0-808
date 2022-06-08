package Chapter3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.*;

public class Practice {

    public static void main(String[] args) {
//        String a = "animals";
////        System.out.println(a.indexOf("a", 4));
////        System.out.println(a.substring(17, 19));
//
//        StringBuilder sb = new StringBuilder(10);
//        String z = sb.append("abc").substring(1,2);
//        System.out.println(z);

//        int[] myArray = {11,22,33};

//        String[] strings = {"a", "b"};
//        Object[] hello = strings;
//       String[] anotherStrings = (String[])hello;
//        hello[0] = new StringBuilder();
//        System.out.println(hello[0]);
//
//        int[] a;
//        int [] b;
//        int c[];
//        int d [];

//        int[][] a = {{1,4}, {3}, {9,8,7}};
//        for(int i = 0; i<a.length; i++){
//            for(int j = 0; j<a[i].length; j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println(a[2][0]);
//
//        for(int[] inner : a){
//            for(int num : inner){
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }

//        String[] h = {"ab","AB"};
//        int[] g = {1, 2, 3};
//        Arrays.sort(h);
//        Arrays.sort(g);
//        for(String e : h){
//            System.out.print(e+" ");
//        }
//        for(int e : g){
//            System.out.print(e + " ");
//        }

//        List<String> mondayList = new ArrayList<>();
//        mondayList.add("a");
//        mondayList.add("b");
//        mondayList.add("AB");
////        System.out.println(mondayList.remove("c"));
////        System.out.println(mondayList.set(0, "z"));
//        Collections.sort(mondayList);
//        System.out.println(mondayList);
//
//        List<Boolean> booleans = new ArrayList<>();
//        booleans.add(true);
//        System.out.println(booleans);
//
//        List<Double> doubles = new ArrayList<>();
//        doubles.add(new Double(90));
//        doubles.add(12.9);
//        doubles.add(Double.parseDouble("22.2"));
//        doubles.add(Double.valueOf("33.3"));
//        doubles.remove(0);
//        System.out.println(doubles);
//
//        List<Integer> integerList = new ArrayList<>();
//        integerList.add(1);
//        integerList.add(2);
//        integerList.add(3);
//        integerList.add(null);
//        integerList.remove(1);
//        integerList.remove(new Integer(1));
//        System.out.println(integerList);
//        List<String> list = new ArrayList<>();
//        list.add("hawk");
//        list.add("robin");
////        Object[] objects = list.toArray();
////        System.out.println(objects.length);
//        String[] a = new String[0];
//        String[] strings = list.toArray(a);
//        System.out.println(strings);
//        System.out.println(strings.length);
//
//        String[] b = new String[5];
//        String[] strings_b = list.toArray(b);
//        System.out.println(strings_b);
//        System.out.println(strings_b.length);

//        //from date time to string
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        LocalDateTime dateTime = LocalDateTime.of(2020, Month.JUNE, 06, 11,30);
//        System.out.println(dateTime.format(f));
//        System.out.println(f.format(dateTime));
//
        DateTimeFormatter fCustom = DateTimeFormatter.ofPattern("MM, dd, yyyy, HH:mm");
        System.out.println(dateTime.format(fCustom));
//
//
//        //from string to date time
//        DateTimeFormatter ff = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        LocalDateTime dateTime1 = LocalDateTime.parse("2016-03-04 11:30", ff);
//        System.out.println(dateTime1);
//        Period p1 = Period.ofWeeks(1).ofDays(3);
//        Period p2 = Period.ofDays(10);
//        System.out.println(p2);

//        LocalDate newYears = LocalDate.of(2017,1, 1);
//        Period period = Period.ofDays(1);
////        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM-dd-yyyy");
//        DateTimeFormatter ff = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
//        System.out.println(ff.format(newYears.minus(period)));

//        LocalDate xmas = LocalDate.of(2016, 12, 25);










    }
}
