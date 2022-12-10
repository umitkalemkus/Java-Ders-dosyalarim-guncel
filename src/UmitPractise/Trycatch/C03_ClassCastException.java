package UmitPractise.Trycatch;

public class C03_ClassCastException {
    public static void main(String[] args) {

      Object obj ="UMIT KALEMKUS";

      String str = (String) obj;
        System.out.println(str);


      Object sayi1 =12345;



        try {
            String sayi2 = (String) sayi1;

            System.out.println(sayi2);

        }catch (ClassCastException e){
            System.out.println("sayi yazdirilamaz");
        }





    }


}
