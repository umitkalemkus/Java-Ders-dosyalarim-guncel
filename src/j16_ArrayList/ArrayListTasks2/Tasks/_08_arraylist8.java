package j16_ArrayList.ArrayListTasks2.Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>(List.of(5,3,4,6,7));
        System.out.println(secondMax(arr1));

    }

    private static int secondMax(ArrayList<Integer> arr1) {
        int ikinciBuyuk =0;
        Collections.sort(arr1);
        ikinciBuyuk = arr1.get(arr1.size()-2);

   return ikinciBuyuk;
    }

}

