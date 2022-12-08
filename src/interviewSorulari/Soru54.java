package interviewSorulari;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Soru54 {
    public static void main(String[] args) throws Exception {


       String data = ReadTextAsString("src/interviewSorulari/soru54file");
        System.out.println(data);
    }

    private static String ReadTextAsString(String fileName) throws Exception {
        String data = "";

        data =new String(Files.readAllBytes(Paths.get("src/interviewSorulari/soru54file")));

       return data;
    }


}
