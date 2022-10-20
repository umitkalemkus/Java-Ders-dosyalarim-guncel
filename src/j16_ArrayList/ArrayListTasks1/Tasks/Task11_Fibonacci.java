package j16_ArrayList.ArrayListTasks1.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {

    public static void main(String[] args) {
        /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

             Scanner sc = new Scanner(System.in);
             System.out.println("Enter a number");
             int num = sc.nextInt();

           ArrayList<Integer> FibonacciNumbers = new ArrayList<>(List.of(1,1));

              int i =2;
              while (FibonacciNumbers.get(i-1)+FibonacciNumbers.get(i-2)<=num){
                  FibonacciNumbers.add(FibonacciNumbers.get(i-1)+FibonacciNumbers.get(i-2));
                  i++;

              }
        System.out.println(FibonacciNumbers);




    }




}
