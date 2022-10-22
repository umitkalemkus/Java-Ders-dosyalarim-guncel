package j16_ArrayList.ArrayListTasks1.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3));
        int kare_toplam=0;
        for (int i = 0; i < arr.size() ; i++) {

            kare_toplam+= arr.get(i) * arr.get(i);

        }
        System.out.println("kare_toplam = " + kare_toplam);
    }

}

