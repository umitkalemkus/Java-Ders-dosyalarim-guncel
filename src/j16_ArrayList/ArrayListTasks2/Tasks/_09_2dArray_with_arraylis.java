package j16_ArrayList.ArrayListTasks2.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _09_2dArray_with_arraylis {

    /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {


            int arr1 [][]={{1,2,3},{4,5,6},{7,8,9}};

            ArrayList<Integer> num =new ArrayList<>();
             for (int i = 0; i <arr1.length ; i++) {
                 for (int j = 0; j < arr1[i].length; j++) {
                     num.add(arr1[i][j]);


                 }

        }

        System.out.println(num);










    }
}