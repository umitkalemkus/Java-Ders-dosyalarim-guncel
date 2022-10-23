package UmitPractise;

import java.util.Scanner;

public class Q05_ArabaRunnerStatic {

    public static void main(String[] args) {

        Q05_Araba nesne1 = new Q05_Araba(200,"Mavi",5);
        nesne1.model=2022;
        System.out.println("nesne1.renk = " + nesne1.renk);
        System.out.println("nesne1.hiz = " + nesne1.hiz);
        System.out.println("nesne1.vites = " + nesne1.vites);
        System.out.println("nesne1.model = " + nesne1.model);


        Q05_Araba nesne2 = new Q05_Araba(100,"Sari",3);
        System.out.println("nesne2.renk = " + nesne2.renk);
        System.out.println("nesne2.hiz = " + nesne2.hiz);
        System.out.println("nesne2.vites = " + nesne2.vites);
        System.out.println("nesne2.model = " + nesne2.model);

        Q05_Araba nesne3 = new Q05_Araba(150,"Yesil",2);
        System.out.println("nesne3.renk = " + nesne3.renk);
        System.out.println("nesne3.hiz = " + nesne3.hiz);
        System.out.println("nesne3.vites = " + nesne3.vites);
        System.out.println("nesne3.model = " + nesne3.model);

        System.out.println("Q05_Araba.model = " + Q05_Araba.model);

        Q05_Araba.bilgi();


    }



}
