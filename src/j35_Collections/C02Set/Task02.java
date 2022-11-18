package j35_Collections.C02Set;

import j25_Encapsulation.Task5.Main;

import java.nio.LongBuffer;
import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {


    public static void main(String[] args) {

        long tsBasla=System.currentTimeMillis();
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Salim");
        ts.add("Umit");
        ts.add("Rukiye");
        System.out.println("tsBasla = " + tsBasla);

        long tsbitir=System.currentTimeMillis();

        System.out.println("tsbitir = " + tsbitir);

        System.out.println((tsbitir-tsBasla));

        System.out.println("****************************");
        long hsBasla=System.currentTimeMillis();

        HashSet<String> hs =new HashSet<>();
        hs.add("Ebik");
        hs.add("Gabik");
        hs.add("Swansea");
        System.out.println("hsBasla = " + hsBasla);
        long hsBitir=System.currentTimeMillis();
        System.out.println("hsBitir = " + hsBitir);
        System.out.println(hsBitir - hsBasla);


    }
}
