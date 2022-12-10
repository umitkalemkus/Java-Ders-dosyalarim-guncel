package j29_Exceptions;

import java.util.Scanner;

public class C07_IllegalargumentException01 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("agam yasini giriniz");

        int age = sc.nextInt();

        try {
            if (age<0){
                throw new IllegalArgumentException();
            }else System.out.println(age);

        }catch (IllegalArgumentException e){

            System.out.println("catch bloktan selamlar dogru yas giriniz");



        }






    }



}
