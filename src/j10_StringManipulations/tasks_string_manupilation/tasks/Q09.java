package j10_StringManipulations.tasks_string_manupilation.tasks;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sehir ismi giriniz");
        String sehir = sc.nextLine();

        if (sehir.length()%2==0){
            System.out.println(sehir.substring(0,sehir.length()/2));
        }else{
            System.out.println("Girdiginiz sehir kelimesi ikiye bolunemiyor");
        }

       ;









    }
}
