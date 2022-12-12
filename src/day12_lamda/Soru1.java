package day12_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Soru1 {

    public static void main(String[] args) {
          //listi aralarinda bosluk brirakarak yazdiriniz
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

        yazdir(list);
        System.out.println("\n************************");
        negativeyazdir(list);
        System.out.println("\n************************");
        positivelist(list);
        System.out.println("\n************************");
        karelist(list);
        System.out.println("\n************************");
        bksiralama(list);
        System.out.println("\n************************");
        kbsiralama(list);
        System.out.println("\n************************");
        karelisttekrarsiz(list);
        System.out.println("\n************************");
        sonbesbasamak(list);
        System.out.println("\n************************");
        sonbesbasamakdegil(list);
        System.out.println("\n************************");
        elemanlaritopla(list);
        negatifkarelist(list);








    }

    private static void negatifkarelist(List<Integer> list) {

        System.out.println(list.stream().filter(t -> t < 0).peek(t -> System.out.println("Negatifler :" + t)).map(t -> t * t).peek(t -> System.out.println("Kareleri" + t)).collect(Collectors.toList()));


    }

    private static void elemanlaritopla(List<Integer> list) {

        //List elemanlarinin toplamini bulun


        System.out.println("list.stream().reduce(0,(t,k)->(t+k)) = " + list.stream().reduce(0, (t, k) -> (t + k)));


    }

    private static void sonbesbasamakdegil(List<Integer> list) {
        //S9 list pozitif elemanlari icin karelerini bulup birler basmagi 5 olmayanlardan yeni bir list olusturalim

        System.out.println("list.stream().filter(t->t>0).map(t->t*t).filter(t->t%10!=5).collect(Collectors.toList()) = " + list.stream().filter(t -> t > 0).map(t -> t * t).filter(t -> t % 10 != 5).collect(Collectors.toList()));

    }

    private static void sonbesbasamak(List<Integer> list) {
        // s8 list pozitif elemanlari icin kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim.


        System.out.println("list.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).collect(Collectors.toList()) = " + list.stream().filter(t -> t > 0).map(t -> t * t * t).filter(t -> t % 10 == 5).collect(Collectors.toList()));


    }

    private static void karelisttekrarsiz(List<Integer> list) {

        list.stream().map(t->t*t).distinct().forEach(t->System.out.print(t+" "));

    }

    private static void kbsiralama(List<Integer> list) {
        //listin elemanlari buyukten kucuge siralayalim.
        list.stream().sorted(Comparator.naturalOrder()).forEach(t-> System.out.print(t+" "));



    }

    private static void bksiralama(List<Integer> list) {

        list.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.print(t+" "));




    }

    private static void karelist(List<Integer> list) {
        //listin elemanlarindan karebir list olusturma

        list.stream().map(t -> t * t).forEach(t-> System.out.print(t+ " "));


    }

    private static void positivelist(List<Integer> list) {

        list.stream().filter(t->t>0).forEach(t-> System.out.print (t +" "));




    }

    private static void negativeyazdir(List<Integer> list) {
         //sadece negatif olanlari yazdir
        list.stream().filter(t->t<0).forEach(System.out::print);



    }

    private static void yazdir( List<Integer> list) {

        list.stream().forEach(t-> System.out.print(t+ " "));

    }



    // peek ornegi cozelim negatiflerin karelerinden list olusturalim




}
