package J02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {

        String ad = "Umit";
        String soyad= "Kalemkus";

        int a = 7;
        int b = 11;

        // Birden cok String variable ile farkli data type variableller ile isleme alinirsa java birlestirme
        //birlestirme yaparak yeni bir String olusturur.

        System.out.println(ad+soyad+a+b); // UmitKalemkus711
        System.out.println(a+soyad+ad+b);
        System.out.println(a+b+ad+soyad);
        System.out.println(""+ a+b);
        System.out.println(ad+soyad+(a+b));
        System.out.println((a+b)+ad+soyad);
        System.out.println(ad+(a-b)+(a-b));
        System.out.println(ad+((a-b)+(a-b)));

        char ch = '1';
        System.out.println(ad+ch);
        System.out.println(a+ch+ad);
        System.out.println(ad+(ch+b));
        System.out.println(a+ad+ch);
         /* TRICK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
        eger isleme girdigi variables  aritmetik bir islemse  ascii değeri ile işelm yapar ->
       */











    }



}
