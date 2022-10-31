package day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Q04_NumberOfDaysInMonths {

    /*
Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

INPUT:
Ay Numarasi:
2
Yil :
2016
OUTPUT :
Subat 2016 29 Gundur.
 */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ay no : "); int month = scan.nextInt();
        System.out.println("yil no : "); int year = scan.nextInt();
        LocalDate date = LocalDate.of(year,month,1);
        System.out.println(date.getMonth() + " " + date.getYear() + " " + date.lengthOfMonth() + " days");
    }







}
