package j20_Constructor;

import java.util.Scanner;

public class Bisiklet {
    /*Task 04->
    Bisiklet Class :Properties(fields) : hiz, vites
    method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
    vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
    vites 5 den büyük ve 1 den küçük olamaz.
    yukarıdaki methodları seçtirilen islemYap methodu ile Runner class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
            */


    static int hiz ;
    static int vites;

    public int secim;








    public static void hizdegistir(int yeniHiz) { hiz=yeniHiz;}


    public static void vitesArtir() {
        vites++;
     if(vites>5){

         System.out.println("Vites 5 den buyuk olamaz");
         vites=5;
     }

    }



    public static void vitesAzalt() {

        vites--;
     if(vites<1){
         System.out.println("Vites 1 den kucuk olamaz");
         vites=1;
     }
    }



    public static void durumugoster() {

        System.out.println("Simdiki hiziniz =  "+ hiz  +  "   Simdiki vitesiniz  = "+  vites  +"dir.");

    }

    public static void IslemYap(Bisiklet bisiklet , int secim){
        switch (secim) {
            case 1:
                System.out.println("Hiz giriniz : ");
                Scanner sc = new Scanner(System.in);
                int yeniHiz = sc.nextInt();
                bisiklet.hizdegistir(yeniHiz);
                break;
            case 2:
                vitesArtir();
                break;
            case 3:
                vitesArtir();
                break;
            case 4:
                durumugoster();
                break;
            default:


        }
    }







    public  void MenuYaz() {

            System.out.println("Asagidaki islemlerden biriniz seciniz");
                System.out.println("1- Hiz degistir\n" +
                        "2- Vites Artir\n" +
                        "3- Vites Azalt\n" +
                        "4- Durumu goster\n" +
                        "5- Cikmak icin 5'e basin");

        }
    }
