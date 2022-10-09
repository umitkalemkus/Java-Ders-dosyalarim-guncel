package j12_Loops.L01_ForLoop.WhileLoopTasks.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();


        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();


        if (num1>num2){
            while(num1 > num2){
                System.out.println(num2);
                num2++;}
            }
        else if (num2>num1){
            while(num2>num1){
                System.out.println(num1);
                num1++;}

        }else {
                System.out.println("numbers are equal" );
            }





    }
}
