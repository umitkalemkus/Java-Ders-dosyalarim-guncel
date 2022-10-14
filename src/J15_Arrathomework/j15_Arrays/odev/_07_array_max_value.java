package J15_Arrathomework.j15_Arrays.odev;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */
          int arr1[] = {12,2,5,15,8};
          int max = arr1[0];

        for (int i = 0; i < arr1.length-1 ; i++) {

          max =  Math.max(max,arr1[i]);
        }
        System.out.println(max);

        System.out.println("******* if cozum**********");

        int arr2[] = {12,2,5,15,8};
        int max1 = arr2[0];

        for (int j = 0; j < arr2.length ; j++) {
            if(arr2[j]>max1)
                max1 = arr2[j];}

        System.out.println(max1);

    }




    }


