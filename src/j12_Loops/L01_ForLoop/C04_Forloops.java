package j12_Loops.L01_ForLoop;

public class C04_Forloops {

    public static void main(String[] args) {

     /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri

        */
        int harf=65;

        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.println((char)(harf + j)+" ");

            }
        }








    }



}
