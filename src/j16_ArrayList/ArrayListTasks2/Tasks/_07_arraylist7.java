package j16_ArrayList.ArrayListTasks2.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _07_arraylist7 {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */

    public static void main(String[] args) {
        
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(8,7,9,6,7));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(6,7,12,3,1));


        System.out.println(common_values(arr1, arr2));


    }

    private static ArrayList<Integer> common_values(ArrayList<Integer> arr1, ArrayList<Integer> arr2 ) {
       ArrayList<Integer>commonvalues =new ArrayList<>();

        for (int i: arr1) {
            for (int j:arr2) {

                if (i==j && !commonvalues.contains(i))
                    commonvalues.add(j);

            }




        }
        return commonvalues;
    }


}
