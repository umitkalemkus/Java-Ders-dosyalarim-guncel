package J02_DataTypes_WrapperClass;

public class C02_Datatypes {
    public static void main(String[] args) {
         /*
		 Java'da  2 farkli data type vardir.
		 1)Primitive Data Type (8 tane)

		   a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin memory'de az(bir bit'lik) alan kaplar

		   b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
		   		her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
		   		char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information Interchange") Table'daki degerlerini alır.

		   c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
		   		byte variable -> memory'de 8 bitlik alan kaplar.

		   d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
		   		short variable -> memory'de 16 bıt alan kaplar.

		   e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayi degerlerini alır.
		  		int variable -> memory'de 32 bit alan kaplar.

		   f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayi degerlerini alır.
		   		long variable -> memory'de 64 bit alan kaplar.

		   g)float : ondalikli sayilar icin kullanilır.
		   		float variable -> memory'de 32 bit kullanir.
		   		float variable -> ondalik kisimlarinda en fazla 7 rakam barindirabilir.
		   		0.1234567
		   		Bir ondalikli sayinin float oldugunu belirlemek icin en sona(1.23f veya 1.23F) 'f' veya 'F' yazılmalıdır aksi halde variable double olarak tanımlanır.


		   h)double : ondalikli sayilar icin kullanılır.
		   		double variable -> memory'de 64 bit kullanir.
		 		double variable -> ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
		 		0.1234567890123456

		 2)Non-Primitive Data Type
		 	String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusan variable.
		 */

        String name ="Ozgur";
        int yas  = 15;
        int age  = 34;
        int yil  = 1948;
        boolean EmekliMi = true;
        boolean itci = true;
        char ch ='$';
        char HRF ='A';

        int a = 2022 ;
        int b = 1999 ;
        int Yasiniz = a -b;

        System.out.println(Yasiniz );


        float f1=12.45f;
        float f2= 23.56F;
        double boy =1.85;
        System.out.println(f1*f2);

        // Iki farkli byte tanimlayip toplam ve farkinini print ediniz?

        byte x = 50 , y=40;
        System.out.println(x+y);
        System.out.println(x-y);
         // Task  Iki farkli tamsayi turunde sayi tanimlayip toplam farkini print ediniz
        int z = 185;
        byte t = 25;
        System.out.println(z-t);
        // Task  Tamsayi ve ondalikli sayi tanimlayip toplam print ediniz.
        int k = 250;
        double l = 50.6;
        System.out.println(k+l);

        // Task  Tamsayi ve char data type  iki variable  tanimlayip toplam print ediniz.

         int u = 63;
         char para = '$';

        System.out.println(u-para); // dolarin ASCI DEGERI 36'dir.



        // tASK  Ad ve soyadinizi ve yasinizi print ediniz.

        String adiniz = "Umit";
        String soyadiniz = "Kalemkus";
        int yasim = 37;
        System.out.println(adiniz+soyadiniz +yasim);


















    }









}
