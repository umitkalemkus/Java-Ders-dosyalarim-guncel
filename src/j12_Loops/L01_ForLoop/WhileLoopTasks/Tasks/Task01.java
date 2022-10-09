package j12_Loops.L01_ForLoop.WhileLoopTasks.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını print eden code create ediniz.
 */



        int number = 0;
        int sum = 0;

        while (sum<=333){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int num = sc.nextInt();
            sum += num; // sum = sum + number
            number++;

        }

        System.out.println( "number of entereed :  " +number+ "and" + sum  );





    }
}
