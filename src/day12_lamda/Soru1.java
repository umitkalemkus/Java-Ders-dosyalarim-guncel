package day12_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Soru1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

        yaz(list);
        System.out.println("negatifYazdir(list) = " + negatifYazdir(list));
        pozitifList(list);
        System.out.println("karelist(list) = " + karelist(list));


    }

    private static List<Integer> karelist(List<Integer> list) {
        System.out.println();
        return list.stream().map(t->t*t).collect(Collectors.toList());




    }

    private static void pozitifList(List<Integer> list) {
        System.out.println();
        System.out.println("list.stream().filter(t->t>0).collect(Collectors.toList()) = " + list.stream().filter(t -> t > 0).collect(Collectors.toList()));

    }

    private static    List<Integer> negatifYazdir(List<Integer> list) {

       return list.stream().filter(t->t<0).collect(Collectors.toList());

    }

    private static void yaz(List<Integer> list) {

        System.out.println();
        list.stream().forEach(t-> System.out.print(t+" "));


    }







}
