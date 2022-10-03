package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("agam notunu  gir : ");
        int not = scan.nextInt();
        if (not<0 || not>100){
            System.out.println("agam negatif ve 100 den buyuk not olmaz\nadam gibi bişeyler gir :(\n" +
                    "gelmiim oraya");
        }else if (not<50){//50 den kucuk not alma kontrolu
            System.out.println("D");//1,2,3..49
        }else if (not<60){//60 den kucuk not alma kontrolu
            System.out.println("C");
        }else if (not<80){//80 den kucuk not alma kontrolu
            System.out.println("B");//60,61,...79
        }else {//80 ve buyuk    not alma kontrolu
            System.out.println("A");//80,81...1000  Scanner sc = new Scanner(System.in);

        }









    }






}
