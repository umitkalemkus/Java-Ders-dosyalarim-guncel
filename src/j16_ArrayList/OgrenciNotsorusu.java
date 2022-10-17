package j16_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciNotsorusu {
    public static void main(String[] args) {
        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */

        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter a student size :");
        int size =sc.nextInt();
         int toplam =0;
         int ortalama =0;
        ArrayList<Double> NoteList=new ArrayList<>();

        for (int i = 0; i <size ; i++) {
            System.out.println("Lütfen " + (i+1) + " . ögrencinin notunu giriniz:");
            int not = sc.nextInt();
            NoteList.add((double) not);
            toplam+=not;


        }
        ortalama = (toplam / size);



    }




}
