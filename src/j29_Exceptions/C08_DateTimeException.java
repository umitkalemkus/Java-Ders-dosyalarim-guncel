package j29_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {

    public static void main(String[] args) {


        //System.out.println("date = " + date);


        try {
            LocalDate date = LocalDate.of(2022, 11, 33);
            System.out.println("date = " + date);
        }catch (DateTimeException e){
            System.out.println("Hatali tarih girisi yaptiniz");


        }


    }




}