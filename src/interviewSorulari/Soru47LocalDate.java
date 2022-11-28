package interviewSorulari;

import java.time.LocalDate;

public class Soru47LocalDate {


    public static void main(String[] args) {


        LocalDate bugun = LocalDate.now();
        System.out.println(bugun);
        System.out.println("bugun.getMonth() = " + bugun.getMonth());
        System.out.println("bugun.getYear() = " + bugun.getYear());
        System.out.println("bugun.getChronology() = " + bugun.getChronology());
        System.out.println("bugun.getMonthValue() = " + bugun.getMonthValue());
        System.out.println("bugun.getEra() = " + bugun.getEra());
        System.out.println("bugun.plusMonths(5) = " + bugun.plusMonths(5));



        LocalDate bugun1 = LocalDate.of(1984,10,30);
        System.out.println("bugun1 = " + bugun1);


    }
}
