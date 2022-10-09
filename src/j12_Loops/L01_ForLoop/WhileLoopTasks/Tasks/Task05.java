package j12_Loops.L01_ForLoop.WhileLoopTasks.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your name");
		String name = sc.nextLine();


		System.out.println(" Enter your surname");
		String surname = sc.nextLine();
		int x = 0;
		String nameSurname = (name + surname).replaceAll("\\s"," ");

		while (x<nameSurname.length()){
			System.out.print(nameSurname.charAt(x)+" ");
			x++;
		}




		
			

	}

}
