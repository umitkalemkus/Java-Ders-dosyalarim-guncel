package interviewSorulari;

import java.util.Scanner;

public class Soru41SimpleCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        double first =sc.nextDouble();
        double second = sc.nextDouble();

        System.out.println("Please enter an operator (+ , - , * , / ) :");

        char operator = sc.next().charAt(0);


        double result =0;
        switch (operator){
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default :
                System.out.println("You entered wrong sign");
                break;


        }
        System.out.println(result);

        }











    }



