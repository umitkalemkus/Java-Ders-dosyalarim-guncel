package j25_Encapsulation.Task01;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
        public static void main(String[] args) {


        Okul okl = new Okul("Cumhuriyet Lisesi",3);
                 ArrayList<String> OklOgrencileri = okl.getOgrenciler();


                 int Ogrencisayisi  =0;
                Scanner sc = new Scanner(System.in);
                do {
                    System.out.println(Ogrencisayisi+ "   Ogrenci adi");
                    String OgrAdi =sc.nextLine();

                    System.out.println(Ogrencisayisi+ "  Ogrenci soyadi");
                    String OgrSoyadi  =sc.nextLine();

                    System.out.println(Ogrencisayisi+ "  Ogrenci yasi");

                    int OgrYas =sc.nextInt();



                    try {
                        Ogrenci ogr1 = new Ogrenci(OgrAdi, OgrSoyadi, OgrYas);
                        OklOgrencileri.add(String.valueOf(ogr1));
                       Ogrencisayisi++;
                    } catch (Exception e) {
                        System.out.println("Yeni Öğrenci giriniz");

                    }



                }while (Ogrencisayisi <= okl.getMaxOgrenciSayisi());


            for (String ogr1 : okl.getOgrenciler()) {
                System.out.println("ogr = " + ogr1);
            }


        }



}