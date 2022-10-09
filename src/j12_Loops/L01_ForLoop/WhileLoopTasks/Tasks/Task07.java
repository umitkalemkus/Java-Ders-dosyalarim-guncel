package j12_Loops.L01_ForLoop.WhileLoopTasks.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        int num1 = sc.nextInt();

        int counter = 1;


        while(counter<=5){
            System.out.println("Enter a number again");
            int num2 =sc.nextInt();
        if (num1<num2){
            num1=num2;
        }
        counter++;






        }
        System.out.println("En buyuk sayi : "+num1);







    }



        }


