package interviewSorulari;

import java.io.IOException;

public class Soru52OpenNotPad {
    public static void main(String[] args) {

        Runtime rs = Runtime.getRuntime();
        try {
            rs.exec("notepad");
        }catch(Exception e){

            System.out.println(e);
        }








    }


}
