package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class Lamda {

    public static void main(String[] args) {


        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        ciftsayilar(arr);

        System.out.println("*********************************************\n");

        karesayilar(arr);

        System.out.println("*********************************************\n");


        kupbirfazlasi(arr);

        System.out.println("*********************************************\n");


        kupleri(arr);

        System.out.println("*********************************************\n");

        System.out.println(arr);

        System.out.println("*********************************************\n");


        karekoku(arr);


    }
    public static void yazdir(int a) {//normal allahın mmethodu tek aksiyonlu->seed method(tohum)->refere edilecek method
        System.out.print(a + " ");
    }



    private static void ciftsayilar(ArrayList<Integer> arr) {

        arr.stream().filter(t->t%2==1 && t>34 ).forEach(Lamda::yazdir);

    }

    private static void karesayilar(ArrayList<Integer> arr){

        arr.stream().map(t->t*t).forEach(Lamda::yazdir);

    }

    public static void kupbirfazlasi(ArrayList<Integer> arr){

        arr.stream().filter(t->t%2==1).map(t->(t*t*t)+1).forEach(Lamda::yazdir);

    }
    public static void kupleri(ArrayList<Integer> arr){

        arr.stream().filter(t->t%2==0).map(t->(int)Math.pow(t,3)).forEach(Lamda::yazdir);

    }
     public  static  void karekoku(ArrayList<Integer> arr){

        arr.stream().filter(a->a%2==0).map(Math::sqrt).forEach(t-> System.out.print(t+" "));
     }

}