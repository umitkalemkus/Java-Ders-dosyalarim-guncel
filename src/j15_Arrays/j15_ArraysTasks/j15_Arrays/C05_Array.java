package j15_Arrays.j15_ArraysTasks.j15_Arrays;

import java.util.Arrays;

public class C05_Array {
    public static void main(String[] args) {

        //Array  copyOf

        int sayi [] = { 63 ,21, 47, 35 ,12, 36 , 31 ,46, 24  };

        int yeniarr[]= Arrays.copyOf(sayi,5);

        System.out.println(Arrays.toString(yeniarr));

       int baskaArr[]=Arrays.copyOfRange(sayi , 3,8);

        System.out.println("Sayi arrden ozel kopyalanan array" + Arrays.toString(baskaArr));

        Arrays.fill(sayi,99);

        System.out.println(Arrays.toString(sayi));

        Arrays.fill(sayi,3,7,33);
        System.out.println(Arrays.toString(sayi));


    }



}
