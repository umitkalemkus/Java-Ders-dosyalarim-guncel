package UmitPractise;

public class vaargs {
    public static void main(String[] args) {


        int sayi1 = 45;
        int sayi2 = 56;
        int sayi3 = 77;
        SayiToplam1(sayi1,sayi2,sayi3,10);
        sayiToplam(sayi1,sayi2,sayi3);


    }//main sonu

    private static int sayiToplam(int sayi1, int sayi2, int sayi3 ) {
        int toplam=0;

        System.out.println(sayi1+sayi2);
        System.out.println(sayi3+sayi2);
        System.out.println(sayi1+sayi2+sayi3);
        return toplam;
    }
    public static int SayiToplam1(int...a){
        int toplam1= 0;

        for (Integer w:a) {
            toplam1+=w;

        }


        System.out.println(toplam1);
        return toplam1;
    }


}



