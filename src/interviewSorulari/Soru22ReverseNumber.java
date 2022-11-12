package interviewSorulari;

import java.util.Scanner;

public class Soru22ReverseNumber {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number =sc.nextInt();
         int reverse =0;
        while (number!=0){

            int n =  number%10;   //4
            reverse = reverse* 10 +n;
            number=number/10; //123




        }

        System.out.println(reverse);


}
}