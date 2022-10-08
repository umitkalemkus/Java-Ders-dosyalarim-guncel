package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class C3_Forloopsexample8 {
    public static void main(String[] args) {

             /*
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :3
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir boyut kelime giriniz");
        String kelime = sc.nextLine();
        System.out.println("Sayilacak harfi giriniz");
        char harf =sc.next().charAt(0);
        int harfsayisi=0;


        for (int i = 0; i <=kelime.length()-1 ; i++) {

            if(kelime.charAt(i)==harf){
                harfsayisi++;

            }
            System.out.println(kelime + "   istediginiz"+ harf+harfsayisi );
        }
    }






}
