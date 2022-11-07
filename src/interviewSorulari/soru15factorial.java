package interviewSorulari;

import java.util.Scanner;

public class soru15factorial {
    public static void main(String[] args) {

      //factorial

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        System.out.println("factorial(number) = " + factorial(number));

    }

    private static int factorial(int  number) {


        int factorial=1;
        for (int i = 1; i <=number ; i++) {
            factorial*=i;

        }
        System.out.println(factorial);
    return factorial;
    }


}
