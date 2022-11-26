package interviewSorulari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru38Unmodifiable {


    public static void main(String[] args) {

        List<String> arr=new ArrayList<>();

        arr.add("Mango");
        arr.add("Banana");
        arr.add("Apple");
        arr.add("Strawberry");
        arr.add("PineApple");


        List<String>unmodifiableList = Collections.unmodifiableList(arr);
        unmodifiableList.add("kivi");
        System.out.println(arr);











    }
}
