package j29_Exceptions;

public class C06_NumberFormatException {


    public static void main(String[] args) {

        String str = "1453";
        System.out.println("str+ 5 = " + str+ 5);

        int sayi = Integer.parseInt(str);
        System.out.println(sayi);
        System.out.println(sayi + 5);


        String id ="1k53";
        System.out.println("id = " + id);
        //int sayi2 = Integer.parseInt(id);

        try {
            int sayi2 = Integer.parseInt(id);
        }catch (NumberFormatException e){
            System.out.println("Sayi girmeniz gerekiyor");
            System.out.println(" Catch bloctan selamlar");
            System.out.println(e.getMessage());
        }
        try {
            int sayi2 = Integer.parseInt(id);
            System.out.println( "Try blocktan selamlar");
        }catch (NumberFormatException e){
            System.out.println("Sayi girmeniz gerekiyor");
        }


    }
}
