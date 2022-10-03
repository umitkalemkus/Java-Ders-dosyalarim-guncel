package day4;

import java.util.Scanner;

public class Q07_StringManupulation {
    /* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)
       ORNEK:          INPUT     OUTPUT
                       goat        gat
                      photo        hoto
                      ghost        ghost
                      kalem        lem
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string");
        String s = scan.next().toLowerCase();
        if(s.startsWith("gh")){
            System.out.println(s);
        }else if(s.startsWith("g")){
            System.out.println(s.charAt(0) + s.substring(2));
        }else if(s.charAt(1) == 'h'){
            System.out.println(s.substring(1));
        }else
            System.out.println(s.substring(2));
    }















}
