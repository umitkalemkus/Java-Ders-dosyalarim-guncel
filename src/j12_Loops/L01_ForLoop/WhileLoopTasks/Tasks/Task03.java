package j12_Loops.L01_ForLoop.WhileLoopTasks.Tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
		System.out.println("********* FOR DONGUSU **********");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num1 = sc.nextInt();

		for (int product = 1; product <=10 ; product++) {
			System.out.println(product + " x " + num1+"=" + (product * num1) );

		}
		System.out.println("********* WHILE DONGUSU **********");

		System.out.println("Enter a number : ");
		int num2 = sc.nextInt();
		int y= 1;

		while (y<=10){
			System.out.println( y + " x " + num2+"=" + (y * num2) );
			y++;
		}









	}

}
