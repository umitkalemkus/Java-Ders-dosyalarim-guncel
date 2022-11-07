package interviewSorulari;

import java.util.Scanner;




public class Soru14SumoftheNaturalNumber {

    public static void main(String[] args) {

        //Sum of the Natural Number
        int toplam=0;


        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        int sum = number * (number + 1) / 2;
        System.out.println(sum);

        // Second way
        System.out.println("******************");
        for (int i = 0; i <=number ; i++) {
            toplam =toplam+i;

        }
        System.out.println(toplam);






    }
}
