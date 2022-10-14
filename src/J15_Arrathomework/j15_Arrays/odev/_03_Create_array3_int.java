package J15_Arrathomework.j15_Arrays.odev;

import java.util.Arrays;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.




     */
        int arr1[]={25,30,30,35,100};

        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
             sum += arr1[i];

        }

        System.out.println(sum);

    }
}