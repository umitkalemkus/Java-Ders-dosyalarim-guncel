package day7;

public class Q01_Whileloop {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
    public static void main(String[] args) {
        int sayi =2562;
        System.out.println(basamakToplami(sayi));
    }
    private static int basamakToplami(int sayi) {
        int toplam = 0;
        while (sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        return toplam;

    }
}
//do while



//for ile


    










