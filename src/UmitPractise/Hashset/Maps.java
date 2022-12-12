package UmitPractise.Hashset;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {


    HashMap<Integer,String>klm = new HashMap<>();

    klm.put(101, "Umit Kalemkus");
    klm.put(102, "Aysegul Kalemkus");
    klm.put(111,"Akif Kalemkus"  );
    klm.put(104,"Zeynep Kalemkus");
    klm.put(105,"Rukiye Sena Kalemkus");
    klm.put(106,"Ali,Can,Veli");


        System.out.println("klm.values() = " + klm.values());
        System.out.println("klm.keySet() = " + klm.keySet());
        System.out.println("klm.size() = " + klm.size());
        System.out.println("klm.containsKey(101) = " + klm.containsKey(101));
        System.out.println("klm.containsKey(101) = " + klm.containsKey(107));
        System.out.println(klm);
        System.out.println("klm.entrySet() = " + klm.entrySet());



        for (String w :klm.values()) {
            System.out.print(w+" ");
            
        }
        System.out.println();
        for (Integer k :klm.keySet()) {
            System.out.print(k+" ");

        }

        System.out.println("klm.get(101) = " + klm.get(101));
        System.out.println("klm.getOrDefault(101,\"Umit Kalemkus\") = " + klm.getOrDefault(101, "Umit Kalemkus"));

        System.out.println("klm.get(103) = " + klm.get(103));
        System.out.println("klm.containsValue(\"Umit KAlemkus\") = " + klm.containsValue("Umit Kalemkus"));

        System.out.println("klm.remove(111) = " + klm.remove(111));
        System.out.println(klm);
        System.out.println("klm.putIfAbsent(123,\"Bulent Kalemkus\") = " + klm.putIfAbsent(123, "Bulent Kalemkus"));
        System.out.println(klm);

    }
}