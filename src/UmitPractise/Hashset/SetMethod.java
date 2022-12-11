package UmitPractise.Hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetMethod {


    public static void main(String[] args) {

        HashSet<String> list =new HashSet<>(Arrays.asList("UMIT","UMIT","SENA","RUKIYE"));
        System.out.println(list);


        TreeSet<String>list1=new TreeSet<>(Arrays.asList("umit","akif","zeynep","rukiye","aysegul"));
        System.out.println(list1);


        LinkedHashSet<String>list2=new LinkedHashSet<>(Arrays.asList("Fenerbahce","Galatasaray","Fenerbahce","Besiktas","Trabzonspor","Basaksehir"));


        System.out.println(list2);
        list2.add("Sivasspor");
        System.out.println(list2);
        System.out.println("list2.contains(\"Galatasaray\") = " + list2.contains("Galatasaray"));
        System.out.println("list2.hashCode() = " + list2.hashCode());
        System.out.println("list2.isEmpty() = " + list2.isEmpty());
        System.out.println("list2.size() = " + list2.size());



    }
}
