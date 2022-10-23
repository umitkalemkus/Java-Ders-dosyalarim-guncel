package UmitPractise;

public class Q02_Araba3 {
    public Q02_Araba3() {

        this(200);
        System.out.println("Default");

    }

    public Q02_Araba3(int hiz) {
        this(180,"siyah");
        System.out.println("Tekli");
    }

    public Q02_Araba3(int hiz , String renk) {//once bunu yazdiri thisi paramtrine bakar.
        System.out.println("ikili");

    }



}
