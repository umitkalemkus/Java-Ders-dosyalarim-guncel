package UmitPractise.Trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileinputStreamExceptions {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/UmitPractise/Trycatch/siir");


        int k;
        while ((k=fis.read())!=-1){

            System.out.println((char)k);

        }


       }



    }






