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


      int hiz;
      int vites;

      int islem;

    public Bisiklet(int hiz, int vites) {
        this.hiz = hiz;
        this.vites = vites;

    }
    public int hizdegistir(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen hizinizi giriniz");
        hiz = sc.nextInt();
        return hiz;
    }

    public int vitesArtir(){
        vites +=1;
        if(vites>5){
            System.out.println("vites 5'den buyuk olmamali");
            vites=5;
        }

     return vites;
    }

    public int vitesAzalt(){
        vites +=1;
        if(vites<1){
            System.out.println("vites 1'den kucuk olmamali");
            vites=1;
        }

        return vites;
    }

    public void durumGoster(){
        System.out.println("Simdiki hiziniz =" +hiz + " Simdiki vitesiniz ="+ vites);

    }

    public void islemYap(){

        Scanner sc = new Scanner(System.in);
        do {


        System.out.println("Lutfen yapmak istediginiz islemi seciniz \n 1- Hiz degistirmek icin (1)\n Vites arttırmak için (2)" +
                " \n Vites azaltmak için (3) \n Mevcut durum için (4) \n Çıkış için (0)\n");
        islem = sc.nextInt();

        switch (islem){
            case 1 :
                hizdegistir();
            break;

            case 2 :
                vitesArtir();
            break;

            case 3 :
                vitesAzalt();
            break;

            case 4 :
                durumGoster();
            break;

            case 0 :
                System.out.println("Dikkatli surun");
            break;

            default:
                System.out.println("Yanlis bir giris yaptiniz");

        }


        }while(islem!=0);
    }

}
