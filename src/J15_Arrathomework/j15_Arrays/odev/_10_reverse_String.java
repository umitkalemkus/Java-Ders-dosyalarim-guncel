package J15_Arrathomework.j15_Arrays.odev;

import java.util.Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String arr[]={"Hello World"};
        String strarr= Arrays.toString(arr);
        for (int i = strarr.length()-1; i >=0 ; i--) {
            System.out.print(strarr.charAt(i));
        }




    }
}