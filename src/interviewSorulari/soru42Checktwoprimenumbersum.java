package interviewSorulari;

public class soru42Checktwoprimenumbersum {

    public static void main(String[] args) {

        int num=6;


        System.out.println("addNum(num) = " + addNum(num));


    }

    private static int addNum(int num) {
        if (num!=0) {
            return num+addNum(num-1);


        }else return num;


    }




}
