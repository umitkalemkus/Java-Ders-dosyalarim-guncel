package j09_SwitchStatement.SwitchCase_tasks.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi = sc.nextInt();

        switch ((sayi/10)%10){
            case 0:
            System.out.println("Onlar basamagi sifirdir");
                break;
            case 1:
                System.out.println("Onlar basamagi birdir");
                break;
            case 2:
                System.out.println("Onlar basamagi ikidir");
                break;
            case 3:
                System.out.println("Onlar basamagi ucdur");
                break;
            case 4:
                System.out.println("Onlar basamagi dorttur");
                break;
            case 5:
                System.out.println("Onlar basamagi besdir");
                break;
            case 6:
                System.out.println("Onlar basamagi altidir");
                break;
            case 7:
                System.out.println("Onlar basamagi yedidir");
                break;
            case 8:
                System.out.println("Onlar basamagi sekizdir");
                break;
            case 9:
                System.out.println("Onlar basamagi dokuzdur");
                break;
            default:
                System.out.println("Gecersiz bir rakam girdiniz" );











        }











    }
}
