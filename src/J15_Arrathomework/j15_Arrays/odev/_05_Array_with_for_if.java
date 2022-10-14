package J15_Arrathomework.j15_Arrays.odev;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

         int arr1 []= {5,6,8,12,14,19};
         int sum=0;

        for (int i = 0; i <arr1.length ; i++) {
            if (arr1[i]%2==0){
                sum+=arr1[i];
            }else sum-=arr1[i];



        }
        System.out.println(sum);

    }
}
