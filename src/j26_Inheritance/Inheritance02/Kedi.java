package j26_Inheritance.Inheritance02;

public class Kedi extends Mammal {//mammal parent class mammal child-torun
// Child class obj parent class variable ve methodlara ulasilabilir

    public Kedi() {//PARAMETRESIZ
        super();
        System.out.println("Agam ahan da kedi p'siz cons...");


    }
    public Kedi(String str) {//PARAMETREli
        this();


        System.out.println(super.c);
        System.out.println("Agam ahan da kedi p'siz cons...");
    }



    public void cırmala(){

        System.out.println("Kedi fena cirmalar miyavlar.....");




    }

    int c=2;
    int d=5;

    @Override
    public void mC() {//Mammal parenten den method
        System.out.println("mC------- > kedi class method call.");
    }
}//class sonu
