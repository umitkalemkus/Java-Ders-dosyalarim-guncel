package UmitPractise;

import java.util.Arrays;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {


    LinkedList<String> list =new LinkedList<>(Arrays.asList("Umit", "Akif","Aysegul","Zeynep", "Rukiye", "Rukiye"));

    list.add("Bulent");
    list.add(3,"Nurten");
        System.out.println(list);

        System.out.println("list.removeFirstOccurrence(list) = " + list.removeFirstOccurrence("Umit"));
        System.out.println(list);

        System.out.println("list.get(3) = " + list.get(3));

    }
}