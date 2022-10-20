package j17_Constructor;

public class C05_Arac {
    //Fields (objenin uretilirken alacagi deger variablaari)
    // Bir classa da birden cok cons tanimlanabilir.

    int maxHiz;
    String model;
//Fields-> obj'nin uretilirken alacgı değer variables
    //bir class'da bir den çok cons tanımlanabilir
     /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
    Aksi takdirde Compile Time Error alirsiniz.
            2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
    birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
            */




    public C05_Arac(int maxHiz) {//Bir parametreli constractir.
        this (180,"hacimurat"); // 2parametrili call edilir. ilk satra yazilmali yoksa CTE verir
        this.maxHiz = maxHiz; //this keyword parametre degeri instance variable atama yapar
        // maxHiz = maxHiz  this olmadigi icin parametre degeri instan .

    }



    public C05_Arac(int maxHiz, String model) {

        this.maxHiz = maxHiz;
        this.model = model;
        System.out.println("iki parametleri constractir call edilmistir");
    }
}
