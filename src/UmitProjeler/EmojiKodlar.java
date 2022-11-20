package UmitProjeler;

import java.util.Scanner;

public class EmojiKodlar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Isletim sistemize hosgeldiz\n"+ "1-EKLEME \n"+ "2-SILME\n"+"3-KONTROL\n"+"4-CIKIS\n");
        System.out.println("Bir tercih yapiniz");
        int sayi=sc.nextInt();
        switch (sayi){
            case 1 :
                System.out.println("EKLEME");
            break;
            case 2 :
                System.out.println("CIKARMA");
                break;
            case 3 :
                System.out.println("KONTROL");
                break;
            case 4 :
                System.out.println("CIKIS");
                break;
            case 0:
                System.out.println("Tekrar bekleriz");

        }



    }



}
