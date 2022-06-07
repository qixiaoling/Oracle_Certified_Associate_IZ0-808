package Chapter2;

public class Practice {

//    long xp = 5;
//    int yp = 3;


    public static void main(String[] args) {
//        Practice p = new Practice();
////        p.yp = (int)(p.yp * p.xp);
//        p.yp *= p.xp;
//        System.out.println(p.yp);


        long a = 10;
        int b = 2;

        b *= a;
        System.out.println(b);

        long c = 9;
        int d = 8;
        double e = 8.00;

        System.out.println(c <= d);
        System.out.println(d == e);

        int[][] complexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        OUTER_LOOP: for(int[] simpleArray : complexArray) {
           INNER_LOOP: for(int i=0; i< simpleArray.length; i++){
               System.out.print(simpleArray[i] + "\t");
           }
            System.out.println();
        }
    }

}
