package j17_Foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop1 {

    public static void main(String[] args) {


    List<Integer>sayilist =new ArrayList<>(List.of(16,5,2,33,22,27,41,24));

        for (int i = 0; i <sayilist.size() ; i++) {
            System.out.print(sayilist.get(i) + " ");

        }


        for (Integer a :sayilist) {
            System.out.print(a + " ");

        }

        System.out.println("task2");
        for (Integer a :sayilist.subList(3, sayilist.size())) {
            if (a %2==1) {
                System.out.print(a + " ");

            }

        }
        System.out.println("************task3**********");
         int toplam =0;
        for (Integer a :sayilist.subList(2,6)){
            toplam +=a;
        } System.out.println(toplam);
}
}