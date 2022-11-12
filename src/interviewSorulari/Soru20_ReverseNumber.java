package interviewSorulari;

public class Soru20_ReverseNumber {
    public static void main(String[] args) {

        String cumle = "HAVA BUGUN COK GUZEL";
        String reverse ="";
        for (int i =cumle.length()-1 ; i >=0 ; i--) {

            reverse +=cumle.charAt(i);


        }
        System.out.println(reverse);





    }
}
