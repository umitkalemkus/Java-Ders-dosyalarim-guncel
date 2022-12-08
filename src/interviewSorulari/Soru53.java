package interviewSorulari;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Soru53 {
    public static void main(String[] args) throws Exception {

        String fileContent ="This is Java interview questions";
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/interviewSorulari/Soru53filebos"));
        writer.write(fileContent);
        writer.close();




    }

}
