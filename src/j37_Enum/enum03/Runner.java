package j37_Enum.enum03;

import java.util.ArrayList;

public class Runner {
     /*  TASK :
1- Bir Kitap calss'i create ediniz, fields : name ve kategori(Enum)
2- KitapKategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
3- 3 kitap tanımlayınız bir ArrayList e atınız.
4- bir kategoriye gore listeletiniz.*/
     public static void main(String[] args) {

         Kitap kt1 =new Kitap();
         kt1.name="Suc ve ceza";
        // kt1.kategori="Roman";
         kt1.kategori=KitapKategori.ROMAN;

         Kitap kt2 =new Kitap();
         kt2.name="Marti";
       //  kt2.kategori="roman";
         kt1.kategori=KitapKategori.ROMAN;


         Kitap kt3 =new Kitap();
         kt3.name="Ogretmenimin not defteri";
       //  kt3.kategori="Rooman";
         kt1.kategori=KitapKategori.ROMAN;



         ArrayList<Kitap> kutuphane =new ArrayList<>();
         kutuphane.add(kt1);
         kutuphane.add(kt2);
         kutuphane.add(kt3);

         /*for (Kitap k:kutuphane) {
             if (k.kategori.equals("roman")){
                 System.out.println(k.name);
             }
         }
*/

         for (Kitap k :kutuphane) {
             if(k.kategori==KitapKategori.ROMAN);
             System.out.println(k.name);

         }





     }
}