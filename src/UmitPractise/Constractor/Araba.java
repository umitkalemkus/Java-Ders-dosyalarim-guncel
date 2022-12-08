package UmitPractise.Constractor;

public class Araba {
    int hiz=100;
    String model = "Ford";
    double motor =1.6;
    String vites ="Manuel";

    public Araba() {
        hiz = 120;
        model="Volvo";
    }

    public static void marka(){

        int hiz =200;
        System.out.println(hiz);
    }
    public Araba(int hiz , String vites , int motor  ){

       this.vites = "otomatik";

    }

    @Override
    public String toString() {
        return "Araba{" +
                "hiz=" + hiz +
                ", model='" + model + '\'' +
                ", motor=" + motor +
                ", vites='" + vites + '\'' +
                '}';
    }
}
