package interviewSorulari;


import java.util.Scanner;

public class Soru26_PalindromeNumber {
    public static void main(String[] args) {

      ;
        int number =343;

        int reverse =0;

        int polidrom = number;



        while (number!=0){
            int n = number%10;  //3
            reverse= reverse*10+n;

            number=number/10;
        }

        System.out.println("reverse = " + reverse);


        if (polidrom==reverse){
            System.out.println("polidrom number");

        }else {
            System.out.println("is not polidrom number");

        }










    }



}
