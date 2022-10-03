package J02_DataTypes_WrapperClass;



import java.util.Locale;

public class C04_WrapperClass {

    public static void main(String[] args) {

       String name="Umit";
       int yas = 33;
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
         // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.


        String tc = "1234455";
        String id = "98765";
        int yeniTC = Integer.valueOf(tc);// tc String degerini int cevirdi ve yeni Tc ye atandi.
        System.out.println(tc);

        int yeniId = Integer.valueOf(id); //  tc String degerini int cevirdi ve yeni Id atandi.
        System.out.println(id);
        System.out.println(id+tc);// Concat -> birlestirme yapti
        System.out.println(yeniTC+yeniId);  // Aritmetik toplama 

        System.out.println("yeniTC = " + yeniTC);
        System.out.println("yeniId = " + yeniId);


        String okulNo="2345431";// sayinin sonuna l yazarsam hata alirim  2345431l
        int yeniOkulNo=Integer.valueOf(okulNo);// run time Exception -> caslisma zamani hatasi
        System.out.println("yeniOkulNo = " + yeniOkulNo);



       // TASK-> Bbyte short int maximun ve minimum degerlerini print eden code yaziniz.
               //    primitive data (kutu)   non- primitive data   wrapper class (butuk harfle baslar)

          byte maxByteDegeri = Byte.MAX_VALUE;   // WrapperClass
          byte minByteDegeri = Byte.MIN_VALUE;  // WrapperClass
        System.out.println("minByteDegeri = " + minByteDegeri);
        System.out.println("maxByteDegeri = " + maxByteDegeri);


        //Integer.MAX_VALUE.soutv

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);


    }


}
