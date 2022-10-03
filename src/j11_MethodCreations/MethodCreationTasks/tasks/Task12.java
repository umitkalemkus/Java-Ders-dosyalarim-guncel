package j11_MethodCreations.MethodCreationTasks.tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir email giriniz");
        String email = sc.next();

        System.out.println(emailkontrol(email));


    }

    private static boolean emailkontrol(String email) {


        return  ((email.contains("@") && email.contains(".") && email.substring(0, email.indexOf("@")).length() > 0)) ;

    }


}