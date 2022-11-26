package interviewSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Soru40ReverseArraylist {


    public static void main(String[] args) {

        List<String> arr=new ArrayList<>();

        arr.add("Mango");
        arr.add("Banana");
        arr.add("Apple");
        arr.add("Strawberry");
        arr.add("PineApple");
        System.out.println(arr);

        System.out.println("\n****************************");

        Collections.reverse(arr);
        System.out.println("arr = " + arr);


    }

}
