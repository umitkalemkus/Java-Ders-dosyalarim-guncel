package j04_Aritmatic_Operators.AritmeticOperatorTasks.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */

		System.out.print("3 basamaklı bir sayı giriniz : ");
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		System.out.println("İlk Rakam ve rakamın toplamı = " + (t/100) +"+"+ (t%10) + "=" + ((t/100) + (t%10)));



		
	}

}
