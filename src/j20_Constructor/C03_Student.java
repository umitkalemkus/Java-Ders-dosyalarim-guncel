package j20_Constructor;

public class C03_Student {
    // main olmayan sadece obj create etmek icin pojo ->plan  old object
    //fields
    String ad;
    String Soyad;
    int sinif;
    double ortalama;
    int okulNo;
    boolean takdir;


    @Override
    public String toString() {//obj referans degerini print etmemesi icin obj datalarini stringe ceviren method.
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", Soyad='" + Soyad + '\'' +
                ", sinif=" + sinif +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir +
                '}';
    }

    public void mezuniyet(){
        if(ortalama>=50){
            System.out.println("Diploman hayirli olsun");

        }else System.out.println("Sinifta kaldiniz");




    }





}
