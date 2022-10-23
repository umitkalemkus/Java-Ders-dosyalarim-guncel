package UmitPractise;

public class Q04_ArabaThis {
    int hiz =999;
    int model = 2015;
    int arabaniniHizi;
    String arabaninRengi;



    public Q04_ArabaThis(){
        this(150,"Black");
        System.out.println("Default");

    }


    public Q04_ArabaThis(int hiz){
        this();
        System.out.println("Tekli");

    }

    public Q04_ArabaThis(int hiz, String renk){
        arabaniniHizi=hiz;
        int model = 1998;
        arabaninRengi=renk;
        System.out.println("Ikili");
        System.out.println("consol  :"+ this.hiz);
        System.out.println("this.model = " + model);


    }
    public void durdur(){
        System.out.println("Araba durduruldu");
    }




}
