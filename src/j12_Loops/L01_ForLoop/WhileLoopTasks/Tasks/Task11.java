package j12_Loops.L01_ForLoop.WhileLoopTasks.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:  ");
            int num1 = sc.nextInt();

            int sum = 0;
            int numbers = 1;

            while (num1 !=0) {
                numbers++;
                sum += num1;
                num1 = sc.nextInt();
            }
        System.out.println("girilen sayi adedi: " + numbers + "\ngirilen sayi toplami: " + sum );









    }
}
