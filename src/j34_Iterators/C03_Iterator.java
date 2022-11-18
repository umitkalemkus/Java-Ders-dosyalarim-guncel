package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C03_Iterator {

    public static void main(String[] args) {


        List<Integer> list1 =new ArrayList<>(Arrays.asList(12,3,34,56,96));

        System.out.println(list1);

        ListIterator<Integer> k1 = list1.listIterator();

        while (k1.hasNext()){

            k1.next();

        }
        System.out.println(list1);

        while (k1.hasPrevious()){

            System.out.print(k1.previous()*2+" ");
        }











    }




}
