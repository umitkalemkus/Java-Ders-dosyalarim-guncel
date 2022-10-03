package j10_StringManipulations.tasks_string_manupilation.tasks;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        //Task-> girilen e-mail hesabının  @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print edn code creae ediniz.

        Scanner sc =new Scanner(System.in);
        System.out.println("Lutfen bir gmail hesabi giriniz");
        String email = sc.nextLine().toLowerCase();


        if (email.contains("gmail")){
            System.out.println("Hesabiniz onaylandi");
        }
        else{System.out.println("Gecerli hesap giriniz");
        }










    }








}
