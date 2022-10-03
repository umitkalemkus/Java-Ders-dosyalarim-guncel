package j06_Comparation_Karsilastirma_Operators.ComparisonTasks.tasks;

import java.util.Scanner;

public class _18_ComparisonOperators_equal_equal2 {

    public static void main(String[] args) {

    /*    Oluşturulan double'lar hakkında (num1, num2)
          birbirine eşit olup olmadıklarını doğrulayın.
          Eğer eşitlerse konsolda true yazacaktır.  */

        double num1;
        double num2;
        try (Scanner dp = new Scanner(System.in)) {
            System.out.println("Double bir değer girin: ");
            double num5 = dp.nextDouble();//5.75
            System.out.println("Double ikinci değer girin: ");
            double num6 = dp.nextDouble();//8.78
            System.out.println(num5==num6);
        }

        // Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
    }
}
