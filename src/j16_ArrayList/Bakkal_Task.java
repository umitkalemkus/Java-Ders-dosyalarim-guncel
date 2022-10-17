package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bakkal_Task {

     static ArrayList<String> DayList=new ArrayList<>(List.of("Monday","Tuesday","Wendesday","Thursday","Friday","Saturday","Sunday"));
     static ArrayList<Integer> GunlukKazanclar=new ArrayList<>();

    public static void main(String[] args) {
        /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak göstere n bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */
        int i = 0;
        while (i<DayList.size()){
            Scanner sc =new Scanner(System.in);
            System.out.println("Gunluk kazancinizi giriniz  :");
            double kazanc = sc.nextDouble();
            GunlukKazanclar.add((int) kazanc);
            i++;
        }
        System.out.println(GunlukKazanclar);

        System.out.println(getOrtalamaKazanc(DayList, GunlukKazanclar));

        getOrtalamaninUstundeKazancGünleri(DayList,GunlukKazanclar);

        getOrtalamaninAltindaKazancGünleri(DayList,GunlukKazanclar);


    }




    private static double getOrtalamaKazanc(ArrayList<String>gun , ArrayList<Integer>kazanc) {
        double toplam=0;
        for (int i = 0; i <gun.size() ; i++) {

            toplam+=kazanc.get(i);

        }
        double ortalama = toplam / gun.size();



        return ortalama;
    }
    private static void getOrtalamaninUstundeKazancGünleri(ArrayList<String>gun,ArrayList<Integer>kazanc) {
        ArrayList<String> Ortalamaustu =new ArrayList<>();
        for (int i = 0; i <gun.size() ; i++) {
            if (GunlukKazanclar.get(i)>getOrtalamaKazanc(gun, kazanc)){
                Ortalamaustu.add(gun.get(i));
            }

        }
        System.out.println("Ortalama ustu kazanc gunleriniz :"+Ortalamaustu);


    }
    private static void getOrtalamaninAltindaKazancGünleri(ArrayList<String>gun,ArrayList<Integer>kazanc) {
        ArrayList<String> Ortalamaalti =new ArrayList<>();
        for (int i = 0; i <gun.size() ; i++) {
            if (GunlukKazanclar.get(i)<getOrtalamaKazanc(gun, kazanc)){
                Ortalamaalti.add(gun.get(i));
            }

        }
        System.out.println("Ortalama ustu kazanc gunleriniz :"+Ortalamaalti);





    }


}
