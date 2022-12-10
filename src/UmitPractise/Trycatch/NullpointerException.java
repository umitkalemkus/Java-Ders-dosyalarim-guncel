package UmitPractise.Trycatch;

public class NullpointerException {

    public static void main(String[] args) {

        String str ="";
        System.out.println("str.length() = " + str.length());




        try {
            String str2 =null;
            System.out.println("str2.length() = " + str2.length());

        }catch (NullPointerException e){
            System.out.println("boslugu degeri yoktur");
        }


    }
}
