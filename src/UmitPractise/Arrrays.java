package UmitPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class Arrrays {


    public static void main(String[] args) {



    ArrayList<String>list=new ArrayList<>(Arrays.asList("Akif ","Zeynep","Bilal","Mustafa","Nadir"));

        System.out.println(list);
        list.add("Sule");
        System.out.println(list);
        System.out.println(list.remove(3));
        System.out.println(list);



        LinkedList<String>list1=new LinkedList<>(Arrays.asList("javaCAN", "Ebubekir", "Gülsüm", "Ebubekir", "Adem", "İlker", "javaCAN", "Merve"));
        System.out.println(list1);
        System.out.println(list1.element());
        System.out.println(list1.add("IBRAHIM"));
        System.out.println(list1);
        list1.add(2,"Ayse");
        System.out.println(list1);
        System.out.println(list1.remove("Merve"));
        System.out.println("list1 = " + list1);
        System.out.println(list1.removeFirst());
        System.out.println(list1);
        System.out.println("list1.removeFirstOccurrence() = " + list1.removeFirstOccurrence("Ebubekir"));
        System.out.println(list1);

        System.out.println("list1.addAll(list) = " + list1.addAll(list));
        System.out.println("list = " + list1);


        LinkedList<Object> list3 =new LinkedList<>();
        System.out.println(list3.add(1453));
        System.out.println(list3);
        list3.add("Galatasaray");
        System.out.println(list3);
        list3.add('£');
        System.out.println("list3 = " + list3);
        System.out.println(list3.getFirst());
        System.out.println("list3.getLast() = " + list3.getLast());
        System.out.println("list3.get(1) = " + list3.get(1));


    }
}