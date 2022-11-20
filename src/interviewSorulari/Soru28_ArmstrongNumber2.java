package interviewSorulari;

import java.util.Scanner;

public class Soru28_ArmstrongNumber2 {

    public static void main(String[] args) {

       /*
         Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
             (0, 1, 153, 370, 371, 407, 1634)
             153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
             370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
             1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634
             5 basamakli : 54748 */




        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        String strSayi =sc.next();

        armstrongsayi(strSayi);




}

    private static void armstrongsayi(String strSayi) {

        String [] basamak =strSayi.split("");
        int toplam =0;


        for (int i = 0; i < basamak.length; i++) {
            toplam+=Math.pow(Integer.parseInt(basamak[i]),basamak.length);

        }
        System.out.println(Integer.parseInt(strSayi)==toplam ? "BU BIR ARMSTRONG SAYIDIR":"BU BIR ARMSTRONG SAYI DEGILDIR");

    }
}