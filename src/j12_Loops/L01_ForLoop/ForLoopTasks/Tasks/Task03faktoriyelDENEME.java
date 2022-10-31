package j12_Loops.L01_ForLoop.ForLoopTasks.Tasks;

import java.util.Scanner;

public class Task03faktoriyelDENEME {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int number = sc.nextInt();


        System.out.println("faktorial(5) = " + faktorial(number));


    }

    private static int faktorial(int number) {
        int faktoriyal=1;

        for (int i = 0; i <=number ; i++) {

            faktoriyal*=i;
        }

     return faktoriyal;
    }
}
