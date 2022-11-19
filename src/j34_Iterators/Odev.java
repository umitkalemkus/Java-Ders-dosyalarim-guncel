package j34_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Odev {
     /*
        verilen bir int list in tek elemanlarının karesini tersten print eden code create ediniz
         */

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(List.of(9,5,8,11,13));
        System.out.println(arr);


        ListIterator<Integer> it1= arr.listIterator();
      while (it1.hasNext()){

          if (it1.next()%2==0){
              it1.remove();
          }
      }

      while (it1.hasPrevious()){

          System.out.print(Math.pow(it1.previous(), 2)+" ");
      }

    }







}
