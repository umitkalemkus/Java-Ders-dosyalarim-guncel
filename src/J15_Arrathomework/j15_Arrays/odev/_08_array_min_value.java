package J15_Arrathomework.j15_Arrays.odev;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */
        int arr1[] = {14, 19, 5, 21};
        Arrays.sort(arr1);
        System.out.println(arr1[0]);

    }

}


