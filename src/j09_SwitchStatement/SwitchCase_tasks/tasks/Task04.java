package j09_SwitchStatement.SwitchCase_tasks.tasks;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Ayı giriniz: ");
		String ay = sc.next().toUpperCase();
		switch (ay){
			case "ARALIK":
			case "Ocak":
			case  "Mart":
			case  "Agustos":
			case  "Temmuz":
			case  "Ekim":
				System.out.println("ay 31 cekiyor");
				break;
			case  "Nisan":
			case  "Haziran":
			case   "Eylul  ":
			case   "Kasim ":
				System.out.println("ay 30 cekiyor");
			break;

			case "Subat":
				System.out.println("yiliniz giriniz");
				int yil = sc.nextInt();
				if(yil%4==0){
					System.out.println("29 gun");
				}else System.out.println("28 gun");
				break;
			default:










		}






























	}

}
