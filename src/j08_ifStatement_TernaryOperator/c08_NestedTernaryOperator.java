package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class c08_NestedTernaryOperator {

    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        System.out.println("urun miktari giriniz ");
        int miktar=sc.nextInt();

        System.out.println("urun  fiyatini giriniz");
         int fiyat = sc.nextInt();

          /*
		 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
         %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
		 */


        System.out.println(miktar > 100 ? miktar * fiyat * 0.67 : miktar*fiyat);


    }





}
