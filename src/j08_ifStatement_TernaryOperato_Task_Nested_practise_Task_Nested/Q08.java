package j08_ifStatement_TernaryOperato_Task_Nested_practise_Task_Nested;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Musteri Karti var mi:");
        char MusteriKarti= sc.next().toUpperCase().charAt(0);


        if(MusteriKarti=='V') {
            System.out.println("Urun_adetini_giriniz:");
            int Urun_Adeti=sc.nextInt();
            if(Urun_Adeti>10){
                System.out.println("%20 indirim hakki kazandiniz");
            }
            else {
                System.out.println("%15 indirim hakki kazandiniz");
            }
        }
        if(MusteriKarti=='Y') {
            System.out.println("Urun_adetini_giriniz:");
            int Urun_Adeti=sc.nextInt();
            if(Urun_Adeti>10){
                System.out.println("%15 indirim hakki kazandiniz");
            }
             else if (Urun_Adeti<10) {
                System.out.println("%10 indirim hakki kazandiniz");
            }
        }









    }

}
