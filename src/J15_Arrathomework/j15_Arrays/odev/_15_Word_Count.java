package J15_Arrathomework.j15_Arrays.odev;

import java.util.Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */
           String str = "Removes white space from both ends of a string";
           String arr[] =str.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Kelime sayisi ="+ arr.length);


    }
}