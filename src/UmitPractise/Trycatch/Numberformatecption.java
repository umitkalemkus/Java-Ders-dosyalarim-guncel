package UmitPractise.Trycatch;

public class Numberformatecption {

    public static void main(String[] args) {
        String str ="1453";


        System.out.println(str+5);

       int sayi =Integer.parseInt(str);
        System.out.println(sayi);
        System.out.println(sayi+5);


        String id = "12345k8";



         try {
             System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));
         }catch (NumberFormatException e){

             System.out.println("id e harf girdiniz");
             System.out.println(e);
             System.out.println(e.getMessage());
             e.printStackTrace();

         }
    }
}
