package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterators {

    public static void main(String[] args) {

        ArrayList<String> l1= new ArrayList<>(Arrays.asList("Umit", "Rukiye", "Aysegul", "Zeynep","Akif"));
        System.out.println(l1);

        l1.add("Bulent");


        for (int i = 0; i <l1.size() ; i++) {
            System.out.print(l1.get(i)+" ");

        }


        System.out.println("********************************");


        for (String w:l1) {
            System.out.print(w+" :)");

        }
        ArrayList<String> l2= new ArrayList<>(Arrays.asList("Galatasaray", "Fenerbahce", "Trabzon", "Besiktas","Basaksehir"));
        Iterator<String> k1 = l2.iterator();







    }



}
