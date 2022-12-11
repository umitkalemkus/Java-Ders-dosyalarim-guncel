package UmitPractise.Hashset;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue {


    public static void main(String[] args) {

        java.util.Queue<String>Q1=new LinkedList<>(Arrays.asList("Kayserispor","Alanyaspor","Umraniyespor","Basaksehir"));

        System.out.println("Q1.element() = " + Q1.element());
        System.out.println("Q1 = " + Q1);
        System.out.println("Q1.add(\"Besiktas\") = " + Q1.add("Besiktas"));
        System.out.println(Q1);


        java.util.Queue<String>Q2=new PriorityQueue<>(Arrays.asList("serispor","yesilspor","Rizespor","aksehir"));
        System.out.println(Q2);

        System.out.println("Q1.poll() = " + Q1.poll());
        System.out.println(Q1);

        System.out.println("Q1.peek() = " + Q1.peek());

        System.out.println();


    }


}
