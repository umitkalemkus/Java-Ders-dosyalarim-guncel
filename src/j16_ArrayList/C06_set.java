package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {

    public static void main(String[] args) {
    /// set()--> listin indexe istenen elemani update eder
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "Londra", "stockholm"));
        listSehir.set(3,"Angara");
        System.out.println(listSehir);
        //listSehir.set(11,"pataGonya");// olmayan index set edilirse run time alirsinzi
        System.out.println(listSehir);


    }



}
