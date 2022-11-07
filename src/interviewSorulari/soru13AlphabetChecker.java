package interviewSorulari;

import java.util.Scanner;

public class soru13AlphabetChecker {


    public static void main(String[] args) {

      //  Alphabet Checker
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a letter");
        char letter = sc.next().charAt(0);


        if(letter>'a' && letter<'z'|| letter>'A' && letter<'Z' ){
            System.out.println("Alphabetic Charchter");
        }else System.out.println("is not Alphabetic Charchter");










    }
}
