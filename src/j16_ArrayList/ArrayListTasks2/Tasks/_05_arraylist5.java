package j16_ArrayList.ArrayListTasks2.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {
     ArrayList<String> city = new ArrayList<>(List.of("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
        System.out.println(rotateList(city));


    }

    private static  ArrayList<String> rotateList( ArrayList<String> city) {

        ArrayList<String>Terscity = new ArrayList<>();
        for (int i = city.size()-1; i >=0 ; i--) {

            Terscity.add(city.get(i));

        }





     return Terscity;
    }
}

