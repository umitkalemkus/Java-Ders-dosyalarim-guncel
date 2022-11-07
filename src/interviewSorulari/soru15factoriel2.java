package interviewSorulari;

import java.util.Scanner;

public class soru15factoriel2 {

    public static void main(String[] args) {



        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

          int toplam=0;
         int carpim=1;
        for (int i = 1; i <=number ; i++) {
         carpim*=i;
         toplam+=i;
        }
        System.out.println(carpim);
        System.out.println(toplam);






    }


}
