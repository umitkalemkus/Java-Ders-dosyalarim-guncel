package j20_Constructor;

public class ElektirikHesap {


    /*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */

    int toplamTuketim;
    double oran=0.7;
    double fatura;


    public ElektirikHesap(int toplamTuketim, double fatura) {
        this.toplamTuketim = toplamTuketim;
        this.fatura = fatura;

    }

    public double odenecekTutar(){

    return toplamTuketim*oran;
    }

    public int TuketimEkle(int tuketim){


    return toplamTuketim +=tuketim;
    }

}
