package day11;

public class Vaargs02 {
    // Create a multiply method with double varargs (return double)
    public static void main(String[] args) {


        System.out.println("multiply(2,8,15,9) = " + multiply(2, 8, 15, 9));


    }

    private static double multiply(int ...sayi) {
       double carpim =1;
        for (double number:sayi) {

            carpim*=number;

        }
       return carpim;

    }
}