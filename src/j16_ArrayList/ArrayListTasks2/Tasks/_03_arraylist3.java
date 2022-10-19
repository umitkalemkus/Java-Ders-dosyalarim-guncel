package j16_ArrayList.ArrayListTasks2.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {

        ArrayList<String> city = new ArrayList<>(List.of("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));

        System.out.println(getLength(city));


    }

    private static List<Integer> getLength( ArrayList<String> city) {
        ArrayList<Integer> Citylength = new ArrayList<>();
        for ( String a : city ) {

            Citylength.add(a.length());


        }return Citylength;


    }
}