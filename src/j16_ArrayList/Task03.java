package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Task03 {
    public static void main(String[] args) {

        ArrayList<Integer> ListSayi = new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));

        Scanner sc = new Scanner(System.in);
        System.out.print("agam bir rakam gir bakam : ");
        int rakam = sc.nextInt();


        boolean Varmi = false;
        for (int i = 0; i < ListSayi.size(); i++) {
            if (ListSayi.get(i)==rakam){
                Varmi =true;
                System.out.println("aradigin sayi mevcut");
                break;
            }
        }
        if (!Varmi){
            System.out.println("aradigin sayi mevcut degil");
        }







    }



}
