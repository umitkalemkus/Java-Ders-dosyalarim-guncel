package j35_Collections.C02Set;

import java.util.Arrays;
import java.util.HashSet;

public class C01_HashSet {
    public static void main(String[] args) {

        HashSet<String > hs=new HashSet<>();//bos bir hasset
        HashSet<String > hs1=new HashSet<>(Arrays.asList("Ercan","Yakup","Adem","Rukiye","Nur"));//elelman ataması yapılan bir hasset
        //Set print etme...
        System.out.println("hs1 = " + hs1);//[Ercan, Adem, Nur, Yakup, Rukiye]

        //set add()-> eleman ekleme...
        hs1.add("Kevser");
        System.out.println("hs1 = " + hs1);//[Ercan, Adem, Kevser, Nur, Yakup, Rukiye]

        hs1.add("Adem");//tekrarlı eleman ekleme
        System.out.println("hs1 = " + hs1);//[Ercan, Adem, Kevser, Nur, Yakup, Rukiye]

        hs1.add(null);
        hs1.add(null);
        hs1.add(null);
        System.out.println("hs1 = " + hs1);// [null, Ercan, Adem, Kevser, Nur, Yakup, Rukiye]

        HashSet<String > hs2=new HashSet<>(Arrays.asList("Basarı","Gayrete ","Asıktır"));
        System.out.println("hs2 = " + hs2);//[Basarı, Asıktır, Gayrete ]
        hs1.addAll(hs2);
        System.out.println("hs1 = " + hs1);//[null, Basarı, Ercan, Adem, Kevser, Asıktır, Nur, Yakup, Rukiye, Gayrete ]

        //set remove()-> ğistenene eleman set'ten silinir
        System.out.println("hs1.remove(\"asıktır\") = " + hs1.remove("asıktır"));//omayan eleman silinirse->false
        System.out.println("hs1.remove(\"Asıktır\") = " + hs1.remove("Asıktır"));//varolan eleman silinirse ->true
        System.out.println("hs1 = " + hs1);//[null, Basarı, Ercan, Adem, Kevser, Nur, Yakup, Rukiye, Gayrete ]

        System.out.println("hs1.removeAll(hs2) = " + hs1.removeAll(hs2));//true
        System.out.println("hs1 = " + hs1);//[null, Ercan, Adem, Kevser, Nur, Yakup, Rukiye]

        System.out.println("hs1.size() = " + hs1.size());// 7

        System.out.println("hs1.isEmpty() = " + hs1.isEmpty());// false

        hs1.clear();

        System.out.println("hs1.isEmpty() = " + hs1.isEmpty());// true

        System.out.println("hs1.size() = " + hs1.size());//0
        System.out.println("hs1 = " + hs1);// []

        System.out.println("hs2.contains(\"Basarı\") = " + hs2.contains("Basarı"));// true

        System.out.println("hs2.contains(\"javaNAZZZ\") = " + hs2.contains("javaNAZZZ"));// false
        System.out.println("hs2.hashCode() = " + hs2.hashCode());//1769718834


    }

}
