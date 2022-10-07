package j12_Loops.L01_ForLoop.ForLoopTasks.Tasks;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */


		Scanner sc=new  Scanner(System.in);

		System.out.println("Bir kelime giriniz : ");
		String kelime=sc.nextLine();


		for (int i = 0; i <kelime.length() ; i++) {

			System.out.println(i);
		}



	
	}
	
	
	
	
}
