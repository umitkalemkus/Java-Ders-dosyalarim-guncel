package j20_PassByvalue;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    /*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String data type ArrayList'leri depolayabilen 2D ArrayList create ediniz
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 ArrayListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */


    public static void main(String[] args) {

        ArrayList<String> Employees = new ArrayList<>(List.of("Turkey", " England","Wales"));
        ArrayList<String> Employers = new ArrayList<>(List.of("Istanbul","London","Cardiff"));
        ArrayList<String> Companies = new ArrayList<>(List.of("Clarusway","Ulker", "Eti"));

        ArrayList<ArrayList<String>> List = new ArrayList<>(java.util.List.of(Employers,Employees,Companies)); //2 boyutlu array list

        System.out.println(List);

        }

    }
