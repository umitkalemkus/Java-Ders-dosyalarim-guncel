package day9;

import java.util.Scanner;

public class Q04_Arrays {

    //Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir cumle tanimlayiniz");
        String a = sc.nextLine();
        String arr[] = a.split(" ");
        System.out.println(arr.length);
    }
}
