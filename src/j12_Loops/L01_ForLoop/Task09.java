package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir boyut  giriniz");
        int boyut = sc.nextInt();




        for (int i = 1; i <boyut ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

        }
        }
        System.out.println();


        
        
        
        
    }
       
    
    
    
    

    
}
