package j20_Constructor;

public class C02_Arac {
    //field alan
    String marka;
    String model;
    int km;
    double motorHcm;
    boolean vitesAuto=false;
    boolean ikinciEl;
    int yil;


    public static void main(String[] args) {

        C02_Arac arac1 = new C02_Arac();//default cons ile arac obj
       arac1.ikinciEl=true;
       arac1.marka="volvo";
       arac1.km=50000;
       arac1.model="xc60";
       arac1.motorHcm=2.4;

        System.out.println(arac1.marka+" "+arac1.model+"  "+arac1.km+" "+arac1.ikinciEl+" "+arac1.motorHcm+" "+arac1.yil);


        //Task-> 2. bir aracin tum field"larini atayarak print ediniz.



        C02_Arac myCar = new C02_Arac();
        myCar.ikinciEl=false;
        myCar.marka="honda";
        myCar.km=11;
        myCar.model="accord";
        myCar.motorHcm=2.0;
        myCar.yil=2022;
        myCar.vitesAuto=true;
        System.out.println(myCar.marka+" "+myCar.model+"  "+myCar.km+" "+myCar.ikinciEl+" "+myCar.motorHcm+" "+myCar.yil);





    }
}
