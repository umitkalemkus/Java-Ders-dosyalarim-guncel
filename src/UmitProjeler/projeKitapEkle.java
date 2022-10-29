package UmitProjeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class projeKitapEkle {

    public static int count = 1000;

    public static List<projeEklenenKitaplar> liste = new ArrayList<>();


    public static List<projeEklenenKitaplar> kitapEkle() {
        boolean flag = true;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen kitap adiniz, yazarini ve fiyatini giriniz\n"
                    + "Kitap ekleden cikmak icin 0'a basiniz");
            String kitapAd1 = scan.nextLine();

            if (kitapAd1.equals("0")) {
                flag = false;
                break;
            }
            String yazarAd1 = scan.nextLine();
            int fiyat1 = scan.nextInt();

            projeEklenenKitaplar eklenenKitaplar1 = new projeEklenenKitaplar(count, "", "", 0);
            liste.add(eklenenKitaplar1);
            System.out.println("Kitaplariniz basariyla eklendi");
            count++;


        } while (flag);
        return liste;

    }

    public static void KitapNoileKitap() {
        boolean flag = true;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen bir kitap giriniz: \n\" Kitap No ile sorgulamadan cikiniz");
            int kitapNO = scan.nextInt();

            if (kitapNO == 0) {
                flag = false;
                break;

            }
            String a = scan.nextLine();//dummy


            boolean kitapvarmi = false;
            for (projeEklenenKitaplar kitap : liste) {

                if (kitap.kitap_no == kitapNO) {
                    System.out.println("Kitap No:" + kitap.kitap_no + ", Kitap adi " + kitap.kitap_adi + " , Yazar Adi: "
                            + kitap.yazar_adi + ", Fiyati:" + kitap.kitap_fiyati);
                    kitapvarmi = true;
                }

            }
            if (kitapvarmi == false) {
                System.out.println("Lutfen gecerli bir kitap numarasi giriniz");
            }

        } while (true);

    }

    public projeKitapEkle() {
    }

    public static void BilgiileKitap() {
        Scanner scan = new Scanner(System.in);

        do {
            String yazar1 = " ";
            String kitap = "  ";
            int fiyat = 0;
            boolean flag = true;
            while (flag == true) {
                System.out.println("" +
                        "Ne sorgulamak istiyorsunuz?\n" +
                        "Yazar Adi icin       :1\n" +
                        "Kitap Adi icin       :2\n" +
                        "Kitap Fiyati icin   :3'e basin:");
                String sorgu = scan.nextLine();
                switch (sorgu) {
                    case "1":
                        System.out.println("Lutfen yazar adi giriniz");
                        yazar1 = scan.nextLine();
                        flag = false;
                        break;
                    case "2":
                        System.out.println("Lutfen kitap adi giriniz");
                        kitap = scan.nextLine();
                        flag = false;
                        break;
                    case "3":
                        System.out.println("Lutfen kitap fiyati giriniz");
                        fiyat = scan.nextInt();
                        flag = false;
                        break;
                    default:
                        System.out.println("Gecerli bir islem giriniz");

                }


            }
            boolean gecerliMi = false;
            for (projeEklenenKitaplar kitap1 : liste) {

                if (
                        kitap1.yazar_adi.equalsIgnoreCase(yazar1) ||
                                kitap1.kitap_adi.equalsIgnoreCase(kitap) ||
                                kitap1.kitap_fiyati == fiyat) {


                    System.out.println(
                            "Kitap No:" + kitap1.kitap_no +
                                    "Kitap Adi:" + kitap1.kitap_adi +
                                    "Yazar Adi:" + kitap1.yazar_adi +
                                    "Fiyati:" + kitap1.kitap_fiyati);

                    gecerliMi = true;
                }


            }
            if (gecerliMi == false) {
                System.out.println("Gecerli bir veri giriniz");
            }

            System.out.println("Baska bir kitap denemek istermisniz? e/h");
            String isFinish = scan.next();

            scan.nextInt();// Dummy kukla next()'den kurtulmak icin

            if (isFinish.equalsIgnoreCase("h")) {
                break;
            }
        } while (true);


    }

    public static void numaraIleKitapSil() {
        boolean sil = false;

        while (sil == false) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Silmek istediginiz kitap numarasini girin");

            int silinecekKitapNo = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < liste.size(); i++) {

                if (silinecekKitapNo == liste.get(i).kitap_no) {
                    liste.remove(liste.get(i));
                    System.out.println("Silme islemi basarili");
                    sil = true;
                    break;

                }


            }
            if (sil == false) {
                System.out.println("Silmek icin gecerli bir veri girin");

            }
        }


    }

    public static void tumKitaplariListele(){

        System.out.println("********* Guncel kitap listesi ********");

        for (projeEklenenKitaplar kitap1: liste){
            System.out.println(
                    "Kitap No:" + kitap1.kitap_no +
                            "Kitap Adi:" + kitap1.kitap_adi +
                            "Yazar Adi:" + kitap1.yazar_adi +
                            "Fiyati:" + kitap1.kitap_fiyati);


        }


    }


}
