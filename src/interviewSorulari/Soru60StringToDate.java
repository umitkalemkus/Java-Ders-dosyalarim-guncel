package interviewSorulari;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Soru60StringToDate {
    public static void main(String[] args) throws ParseException {


        String k ="01/01/2020";

        Date date =new SimpleDateFormat("dd/MM/yyyy").parse(k);
        System.out.println(date);









    }
}
