package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C14_ListConvertArray {

    public static void main(String[] args) {

        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya", "Amerigonya", "ingiltere", "isvec"));
        System.out.println(listUlke);

        String arrUlke []=listUlke.toArray(new String[0]);
        System.out.println("listUlke = " + listUlke);


        System.out.println(Arrays.toString(arrUlke));


        Object arrUlkeler []=listUlke.toArray();
        System.out.println(Arrays.toString(arrUlkeler));


        ArrayList<String> team = new ArrayList<>(List.of("Galatasaray", "Besiktas", "Fenerbahce", "Trabzonspor"));
        System.out.println(team);


        Object teams [] = team.toArray();
        System.out.println(Arrays.toString(teams));


    }








}
