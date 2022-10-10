package j12_Loops.L01_ForLoop.WhileLoopTasks.Tasks;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a text: ");
		String str=sc.nextLine().toLowerCase();
		int letters=0;
		int numbers=0;
		int Specialcharcter=0;
		int index=0;
		do {
			if (str.charAt(index)>='a'&&str.charAt(index)<='z'){
				letters++;
			} else if (str.charAt(index)>='0'&&str.charAt(index)<='9') {
				numbers++;

			}else Specialcharcter++;
			index++;

		}while (index<=str.length()-1);

		System.out.println("karakter sayısı: "+Specialcharcter+"\nrakam sayısı: "+letters+"\nharf sayısı: "+letters);








	}
}