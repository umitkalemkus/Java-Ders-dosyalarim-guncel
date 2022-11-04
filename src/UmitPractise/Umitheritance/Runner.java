package UmitPractise.Umitheritance;

public class Runner {
    public static void main(String[] args) {

        Wales sehir =new Wales();

        sehir.Castle();
        System.out.println("sehir.a = " + sehir.a);


        System.out.println("**************************");


        Swansea sehir2 = new Swansea();
        sehir2.mumbles();
        System.out.println("sehir2.a = " + sehir2.a);
        System.out.println("sehir2.population = " + sehir2.population);

        System.out.println("**************************");

        Cardiff sehir3 = new Cardiff();
        sehir3.largeCity();
        System.out.println("sehir3.bus = " + sehir3.bus);
        System.out.println("sehir3.population = " + sehir3.population);
        System.out.println("sehir3.a = " + sehir3.a);

        System.out.println("**************************");
    }


}
