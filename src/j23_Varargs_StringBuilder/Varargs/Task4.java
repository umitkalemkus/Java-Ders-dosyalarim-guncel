package j23_Varargs_StringBuilder.Varargs;

public class Task4 {
    public static void main(String[] args) {

        /*
        Task ->
        Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.

         */
       // toplaCarp(2,24,23,38,33,21,59,26,10)


       int toplanacaksayilar []={24,23,38,33,21,59,26,10 };


        System.out.println("toplaCarp(2,toplanacaksayilar) = " + toplaCarp(2, toplanacaksayilar));


    }

    public static int toplaCarp(int carpilacaksayi, int... toplanacaksayilar) {
        int toplam=0;
        for (int a :toplanacaksayilar) {

            toplam+=a;
        }



     return carpilacaksayi*toplam;
    }


}
