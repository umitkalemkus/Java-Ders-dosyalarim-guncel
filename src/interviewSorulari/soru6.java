package interviewSorulari;

import java.util.Scanner;

public class soru6 {

         //Question -6 Quotient and remainder

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = sc.nextInt();
        System.out.println("Enter second number");
        int number2  = sc.nextInt();


        int Quotient = number1/number2;
        System.out.println("Quotient = " + Quotient);

        int Remainder = number1%number2;
        System.out.println("Remainder = " + Remainder);






    }





}
