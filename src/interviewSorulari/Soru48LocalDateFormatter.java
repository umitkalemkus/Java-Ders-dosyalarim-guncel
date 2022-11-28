package interviewSorulari;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Soru48LocalDateFormatter {


    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate now  =LocalDate.now();
        System.out.println("df.format(now) = " + df.format(now));


    }


}
