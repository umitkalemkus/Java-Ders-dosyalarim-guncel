package j34_Iterators;

import java.util.*;

public class iterator {
    //Not: ListIterator interface'inin previousIndex() method 'u verilen elemanin index'ini return eder. Bu method pointer list'in basina yerlestirildiginde -1 return eder.

    //Yukarida verilen bilgiye gore asagidakilerden hangileri dogrudur?


        public static void main(String args[]) {



                List<String> list = new ArrayList<>();

                list.add("AB");

                list.add("CD");

                list.add("EF");

                ListIterator<String> it = list.listIterator();

                Collections.reverse(list);

                while(it.hasNext()) {

                    System.out.print(it.next() + " ");

                }

            }

        }


