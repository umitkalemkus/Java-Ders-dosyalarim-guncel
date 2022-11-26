package interviewSorulari;

import java.util.*;

public class soru39RemoveDublicateInArraylist {
    public static void main(String[] args) {





        List<String> arr=new ArrayList<>();

        arr.add("Mango");
        arr.add("Banana");
        arr.add("Apple");
        arr.add("Apple");
        arr.add("Strawberry");
        arr.add("PineApple");
        System.out.println(arr);


        LinkedHashSet<String> newList =new LinkedHashSet<>(arr);
        System.out.println("newList = " + newList);




    }



}
