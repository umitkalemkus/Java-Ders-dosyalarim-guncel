package interviewSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru37ConvertArrayListtoArray {
    //Convert ArrayList to Array
    public static void main(String[] args) {


    List<String>arr=new ArrayList<>();

    arr.add("Mango");
    arr.add("Banana");
    arr.add("Apple");
    arr.add("Strawberry");
    arr.add("PineApple");
        System.out.println(arr);
        System.out.println("Convert ArrayList to Array");

      Object [] list =arr.toArray();
        System.out.println(Arrays.toString(list));


    }

}
