package OCP_Collections;

import java.util.*;

public class OCP_Collections {


    public static void main(String[] args) {
        Queue<Integer> queueTest = new LinkedList<>();
        queueTest.add(10);
        queueTest.add(4);
        queueTest.poll();
        System.out.println(queueTest.peek());

        Deque<Integer> deque = new LinkedList<>();
        deque.pollLast();

        Deque<Integer> stack = new ArrayDeque<>();

        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);
        bunnies.sort((b1, b2)-> b1.compareTo(b2));
        System.out.println(bunnies);

        String me = "hi";
        System.out.println(" not getting it" + me.compareTo("aa"));

        System.out.println(false || 7>9 ? "3 > 5" : "3 < 5");







    }



}
