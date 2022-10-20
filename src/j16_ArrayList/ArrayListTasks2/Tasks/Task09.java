package j16_ArrayList.ArrayListTasks2.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        ArrayList<Integer> num = new ArrayList<>(List.of(2,5,7,11,12,9));
        int toplam=0;
        for (int i = 0; i < num.size() ; i++) {

            toplam+= num.get(i)* num.get(i);

        }

        System.out.println(toplam);
    }
}

