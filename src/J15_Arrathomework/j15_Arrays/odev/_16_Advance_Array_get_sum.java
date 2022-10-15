package J15_Arrathomework.j15_Arrays.odev;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
          */
           String a =  ("$12 $23 $10 $2 $5 $2");
          System.out.println("Paranin string hali :"+a);
          int toplam =0;
          String money [] = a.split(" ");
        System.out.println(Arrays.toString(money));
        for (int i = 0; i < money.length ; i++) {
            if(money[i].contains("$")){
                toplam +=Integer.parseInt(money[i].replace("$",""));
            }
        }
        System.out.println(toplam);
    }
}