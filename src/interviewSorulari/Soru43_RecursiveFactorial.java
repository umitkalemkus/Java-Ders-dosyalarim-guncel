package interviewSorulari;

public class Soru43_RecursiveFactorial {

    public static void main(String[] args) {

        System.out.println("multiplyNum(5) = " + multiplyNum(5));
        System.out.println("multiplyNum(6) = " + multiplyNum(6));


    }

    private static int multiplyNum(int num) {

        if (num>1){
            return num*multiplyNum(num-1);

        }else {

            return 1;
        }


    }


}







