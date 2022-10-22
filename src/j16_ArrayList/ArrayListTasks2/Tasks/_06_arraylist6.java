package j16_ArrayList.ArrayListTasks2.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(List.of(5,4,6,2,1));
        System.out.println(hillNum(num));

    }

    private static int hillNum(ArrayList<Integer> num) {
       int num1 =0;
        for (int i = 1; i <num.size()-1 ; i++) {
            if (num.get(i)<num.get(i-1)&&num.get(i)>num.get(i+1));
            num1=num.get(i);

        }



     return num1;
    }













}
