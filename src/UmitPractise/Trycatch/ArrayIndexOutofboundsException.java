package UmitPractise.Trycatch;

import java.util.Arrays;

public class ArrayIndexOutofboundsException {
    public static void main(String[] args) {


        int arr [] ={24,45,41,54};
      //  System.out.println("arr[7] = " + arr[7]);

        try {
            System.out.println("arr[7] = " + arr[7]);


        }catch (ArithmeticException e){
            System.out.println("0 rakam girdiniz");

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("yuksek rakam girdiniz");


        }finally {

        }
        System.out.println("kod buraya geldi");

    }
}
