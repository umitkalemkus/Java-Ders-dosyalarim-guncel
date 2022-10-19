package j16_ArrayList.ArrayListTasks2.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {

        ArrayList<String>colour =new ArrayList<>(List.of("yellow" , "red" , "blue" , "red" , "blue"));
        String s1= "blue";
        String s2= "yellow";
        System.out.println(colour);
        System.out.println(changeInArraylist(colour, s1, s2));


    }

    private static ArrayList<String> changeInArraylist( ArrayList<String> colour, String s1, String s2) {
        for (int i = 0; i < colour.size(); i++) {
            if(colour.get(i).equals(s1)){
                colour.set(i,s2);
            }

        }


     return colour;
    }
}
