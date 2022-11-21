package interviewSorulari;

import java.util.Arrays;

public class soru34ArrayBuyuksayiBULMA {

    ///Largest number in Array using Arrays
    public static void main(String[] args) {


    int [] arr ={12,55,49,45,101};
    Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Greatest number = " + (arr.length-1));


    }
}