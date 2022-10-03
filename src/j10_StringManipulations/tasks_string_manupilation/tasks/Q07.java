package j10_StringManipulations.tasks_string_manupilation.tasks;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime =sc.nextLine();

          if (kelime.length()==3){

              char m1= kelime.charAt(0);
              char m2 =kelime.charAt(1);
              char m3 = kelime.charAt(2);

              System.out.println((m1 == m2 || m2 == m3 || m1 == m3) ? "Kullanilan hafrler aynidir" : "Kulanilan harfler farklidir");


          }else{
              System.out.println("Kelimeniz uc harfli olmalidir :(");
          }









    }
}