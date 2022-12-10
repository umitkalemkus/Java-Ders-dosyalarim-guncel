package interviewSorulari;

import java.util.Arrays;

public class Soru63SortNumber {

   // Sort Numbers
   public static void main(String[] args) {


       int arr [] ={12,25,45,-12,34,67,890,345};
       Arrays.sort(arr);

       System.out.println(Arrays.toString(arr));

       System.out.println("Arrays.stream(arr).sum() = " + Arrays.stream(arr).sum());


   }

}
