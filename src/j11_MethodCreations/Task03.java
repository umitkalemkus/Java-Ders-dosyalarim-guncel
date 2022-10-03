package j11_MethodCreations;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String name = sc.next();


        System.out.println("Soyadiniz giriniz");
        String surename = sc.next();

        adsoyadKontrol(name , surename);





    }//main sonu

    private static String adsoyadKontrol(String name , String surename) {

       name = name.substring(0,1).toUpperCase() +name.substring(1).toLowerCase();
       surename = surename.substring(0,1).toUpperCase() +surename.substring(1).toLowerCase();

        System.out.println("name + \" \" + surename = " + name + " " + surename);


        return name;
    }


}
