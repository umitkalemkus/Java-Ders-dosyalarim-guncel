package j08_ifStatement_TernaryOperator.ifStatementTasks.tasks;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Trafik cezasının değerini hesaplayın.
        45 hız sınırıdır.

        Eğer hızınız 55-74 arasında ise:
        Ceza 100 $'dır.

        Eğer hızınız 75 - 84 arasında ise:
        Ceza 150 $'dır.

        Eğer hızınız 85 -94 arasında ise:
        Ceza 320 $'dır.

        Eğer hızınız 94'den daha fazla ise:
        Ceza 500 $'dır.

        ve ayrıca,
        Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


-----------------------------------------


Örn;

currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

sonuç 300 olmalıdır.  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Trafik cezasının değerini hesaplayın.");
        int Speed = scan.nextInt();

        int penalty= 0 , Speedceza = 0;
//Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        if (Speed >= 94) {
            System.out.println(" Ceza 500 $'dır");
        } else if (Speed< 94 && Speed > 85) {
            System.out.println(" Ceza 320 $'dır");
        } else if (Speed<84 && Speed >75) {
            System.out.println(" Ceza 150 $'dır");}
          else if (Speed<74 && Speed >55) {
                System.out.println("Ceza 100 $'dır");}
        boolean isDriverLicenceAvailable = scan.nextBoolean();
          if (isDriverLicenceAvailable == false) penalty+= 200; {
        System.out.println("Cezanız = " + penalty +"$");}
        if (isDriverLicenceAvailable == true) penalty+= 0;
        System.out.println("Cezanız = " + penalty +"$");




    }
}


