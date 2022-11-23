package interviewSorulari;

import java.util.*;

public class Soru36firsttwomaxnumberinArray {

   // Find first two max number in Array

    // Find firsttwomaxnumberinArray
    public static void main(String[] args) {

        ArrayList<Integer> arr =new ArrayList<>(List.of(12,-24,45,67,100,49,50));
        System.out.println("arr = " + arr);

        Collections.sort(arr);
        System.out.println("arr = " + arr);

        System.out.println("arr.get(arr.size()-1) = " + arr.get(arr.size() - 1));
        System.out.println("arr.get(arr.size()-2) = " + arr.get(arr.size() - 2));



    }

}
