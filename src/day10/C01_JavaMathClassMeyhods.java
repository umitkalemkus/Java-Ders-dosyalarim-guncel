package day10;

import java.util.Random;

public class C01_JavaMathClassMeyhods {
    public static void main(String[] args) {
        int a = -12;
        int b = 4;

        System.out.println("a nın mutlak degeri =  " + Math.abs(a)); // 12
        System.out.println("a ve b den en buyuk olani = " + Math.max(a, b)); // 4
        System.out.println("2,6,8 den en buyuk olani = " + Math.max(2, Math.max(6, 8))); // 8
        System.out.println("a ve b den en kucuk olani = " + Math.min(a, b)); // -12
        System.out.println("b nin kare koku = " + Math.sqrt(b)); // 2
        System.out.println("2 nin 3.kuvveti" + Math.pow(2, 3)); // 8  -> pow(taban, us)
        System.out.println("round 3.1 i yuvarla = " + Math.round(3.1)); // 3
        System.out.println("round 3.5 i yuvarla = " + Math.round(3.5)); // 4
        System.out.println("3.1 sayisinin ust tamsayiya yuvarlama = " + Math.ceil(3.1)); // 4 -> tavan
        System.out.println("3.5 sayisinin ust tamsayiya yuvarlama = " + Math.ceil(3.5)); // 4
        System.out.println("3.1 sayisinin alt tamsayiya yuvarlama = " + Math.floor(3.1)); // 3 -> taban
        System.out.println("3.5 sayisinin alt tamsayiya yuvarlama = " + Math.floor(3.5)); // 3

        //Math.random() : double veri tipine sahip olarak algılar ve 0.0-1.0 arasında rastgele sayı üretir.
        // random methoduyla rasgele deger verme
         double sayi = Math.random()*100;
        System.out.println(sayi);
       // int degerler uretme
        int sayi1 = (int) (Math.random()*50);
        System.out.println(sayi1);

        int max=20;
        int x = (int) (Math.random()*max);
        int y = (int) (Math.random()*max);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println(x<y ? "x min": "y min");


        // java Math.random Class

        for (int i = 0; i <10 ; i++) {
            System.out.println((i+1) +  ". sayi"+ Math.random());



        //Random CLASS

            Random random = new Random();
            for (int j = 0; j <10 ; j++) {
                int randomsayi = random.nextInt(100);
                System.out.println("intsayi ="+randomsayi);

            }

              for (int j = 0; j <10 ; j++) {
                int randomsayi = new Random().nextInt(10);
                System.out.println("intsayi ="+randomsayi);

            }


        }




    }








}
