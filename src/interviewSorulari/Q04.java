package interviewSorulari;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        String pin= "Umit12345";
        int GirisHakki =3;
        Scanner sc=new Scanner(System.in);

        System.out.println("****Hosgeldiniz*********");


        while (true) {
            System.out.println("Lutfen bir pin kodu giriniz");
            String GirilenPin = sc.nextLine();

            if (pin.equals(GirilenPin)){
                System.out.println("Basarili giris yaptiniz");
                break;
            }else System.out.println("Lutfen tekrar deneyiniz");
            GirisHakki--;
            System.out.println("Kalan giris hakkiniz"+ GirisHakki);
            if (GirisHakki==0){
                System.out.println("Giris hakkiniz kalmadi sim kartiniz bloke oldu");
                break;

        }
        }





    }


}
