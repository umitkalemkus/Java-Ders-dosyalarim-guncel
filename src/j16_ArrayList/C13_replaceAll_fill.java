package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replaceAll_fill {
    public static void main(String[] args) {



    ArrayList<Integer> ListSayi = new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));

        System.out.println(ListSayi);



        Collections.replaceAll(ListSayi,1,20);
        System.out.println("ListSayi = " + ListSayi);
        
        
        
        Collections.fill(ListSayi , 33);
        System.out.println("ListSayi = " + ListSayi);


    }

}


