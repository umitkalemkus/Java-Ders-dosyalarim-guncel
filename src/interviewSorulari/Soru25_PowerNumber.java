package interviewSorulari;

import java.util.Scanner;

public class Soru25_PowerNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("first number");
        double number =sc.nextDouble();
        System.out.println("second number");
        double number2 =sc.nextDouble();

        System.out.println("Math.pow(number,number2) = " + Math.pow(number, number2));


    }
}
