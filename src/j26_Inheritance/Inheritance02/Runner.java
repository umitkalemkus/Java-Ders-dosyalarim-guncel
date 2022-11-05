package j26_Inheritance.Inheritance02;

import j26_Inheritance.Inheritance02.Kedi;
import j26_Inheritance.Inheritance02.Mammal;
import j26_Inheritance.Inheritance02.Hayvancık;

public class Runner {

    public static void main(String[] args) {
        //  datatype   objName             Const
            Kedi        k1     =     new    Kedi();
        System.out.println("k1.a = " + k1.a);//0 hayvancik clastan call edildi.
        System.out.println("k1.m = " + k1.m);//1 kedi classtan call edildi
        System.out.println("k1.c = " + k1.c);//2- kedi classtan call
        System.out.println("k1.d = " + k1.d);//5-kedi  classtan call

        /*
      Ayni isimli variable'lardan hangisinin kullanildi
     olusturulan object'in data type'ina göre bilinir
     Variable'i arastirmaya data type'i classindan baslanır.
       */





        k1.mA();//hayvancik class call
        k1.mC();// kedi class call
        k1.mM();//Mammal class call

       /*
         Method cagirilirken ayni isimli methodlardan
       hangisinin kullanilacagina Constructor karar verir.
       Methodlari arastirmaya Consctuctor ismini tasiyan
       class'dan baslayin ve parentlarda arastirmaya devam edin.

       Mammal k2 =new
 */
        Mammal k2 =new Kedi();// datatype -> Parent Mammal Class Cons. parametresiz
        System.out.println("k2.c = " + k2.c);//4 Mammala bakilir
        System.out.println("k2.a = " + k2.a);//0  Hayvancik bakilir
        System.out.println("k2.m = " + k2.m);//1 Mammala bakilir

        //k2.d--- cte verir obj datatype Mammal class d variable yok call edilemez
        k2.mA();//mA-> Hayvancik class method call. kedi() konstractirdan call
        k2.mC();//mC   kedi class method call.
        k2.mM(); //mM   Mammal class method call.



        Hayvancık k3 = new Kedi();//
        System.out.println("k3.m = " + k3.m);//3
        System.out.println("k3.a = " + k3.a);//0

        //k3.c data type hayvancik class oldugu icin c variable call edilemez.
        k3.mA();//System.out.println("Ma------- > Hayvancik class method call."
        k3.mM();//("mM------- > Mammal class method call.");

        Mammal m1 =new Mammal('$');
        System.out.println("m1.a = " + m1.a);//0
        System.out.println("m1.m = " + m1.m);//1
        System.out.println("m1.c = " + m1.c);//4


        // m1.d - parent Mammal class Child KEDI classindan varianle call edilemez.

        m1.mA();//Ma------- > Hayvancik class method call.
        m1.mC();//mC------- > Mammal class method call.
        m1.mM();//mM------- > Mammal class method call.


    }
}
