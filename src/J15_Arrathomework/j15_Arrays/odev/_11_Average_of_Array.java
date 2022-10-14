package J15_Arrathomework.j15_Arrays.odev;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

            int arr [] = {12, 14 , 21 ,23 , 10 ,4};
            int Toplam=0;
            int Ortalama=0;

             for (int i = 0; i < arr.length ; i++) {
                 Toplam+=arr[i];
                 Ortalama=Toplam/arr.length;


        }
               System.out.println("Bu sayilarin ortalamasi :" +Ortalama);
    }
}