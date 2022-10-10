package j12_Loops.L01_ForLoop.WhileLoopTasks.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a chracter ");
        char chracter = sc.next().charAt(0);

        do {
            if (chracter=='x'){
                System.out.println("JAVATAR");
                break;
            }
            else System.out.println("javaCAN");
                 break;
        }while (chracter !='x');








    }
}
