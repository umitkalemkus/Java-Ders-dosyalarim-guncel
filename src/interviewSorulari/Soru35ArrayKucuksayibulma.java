package interviewSorulari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru35ArrayKucuksayibulma
{

                 // Largest number in Array using Collections


    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>(List.of(120,24,45,-67,49));
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get(0));



    }






}
