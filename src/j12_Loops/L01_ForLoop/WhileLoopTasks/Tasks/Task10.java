package j12_Loops.L01_ForLoop.WhileLoopTasks.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int num1 = sc.nextInt();

        int oddnumber = 0;


        while (oddnumber<=num1)
        { if(num1%2==1) {
            System.out.println(num1);
            num1++;
        } else
            System.out.println(" This is even number");
            break;
        }










    }
}
