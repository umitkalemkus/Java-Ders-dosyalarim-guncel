package interviewSorulari;

import java.util.Scanner;

public class Soru28_ArmstrongNumber1 {
     /*
         Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
             (0, 1, 153, 370, 371, 407, 1634)
             153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
             370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
             1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634
             5 basamakli : 54748 */

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int sayi =sc.nextInt();

        ArmstrongNumber(sayi);





    }

    private static void ArmstrongNumber(int sayi) {
        double sayininKupleritoplami =0;
        double basmaktakisayi =0;
        int girilensayi=sayi;

        while (sayi>0){

            basmaktakisayi=sayi%10;
            sayininKupleritoplami+=(basmaktakisayi*basmaktakisayi*basmaktakisayi);
            sayi=sayi/10;


        }
        if (girilensayi==sayininKupleritoplami){
            System.out.println(girilensayi  +"   armstrong bir sayidir");

        }else System.out.println("girilensayi+\"armstrong bir sayidir\"");


    }
}
