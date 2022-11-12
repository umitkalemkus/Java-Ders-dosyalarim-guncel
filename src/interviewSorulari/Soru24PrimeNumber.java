package interviewSorulari;

import java.util.Scanner;

public class Soru24PrimeNumber {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int number =sc.nextInt();

    Boolean flag= true;


    if(number>2){

        for (int i = 2; i <number ; i++) {
            if(number%i==0){
             flag=false;

            }

        }
        if(flag==true){
            System.out.println("prime number");
        }else System.out.println("is not prime number");
    }else System.out.println("is not prime number");

}
}