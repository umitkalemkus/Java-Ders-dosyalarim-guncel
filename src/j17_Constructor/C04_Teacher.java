package j17_Constructor;

public class C04_Teacher {

    String ad;    // default ()  kaliphane burasi
    String soyad;
    String brans;
    int tecrube;
    double maas;
     int id;
     boolean emekli;



     public void dersSaati(){
         System.out.println("Haftada 20 saaten sonra ekstraya girer");
     }

    public C04_Teacher() {//parametreli ezdigi defoult cons yerine parametresiz constractor create edildi.
    }

    public C04_Teacher(String ad, String soyad, String brans, int tecrube, double maas, int id, boolean emekli) {//parametreli constractor
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.tecrube = tecrube;
        this.maas = maas;
        this.id = id;
        this.emekli = emekli;
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", brans='" + brans + '\'' +
                ", tecrube=" + tecrube +
                ", maas=" + maas +
                ", id=" + id +
                ", emekli=" + emekli +
                '}';
    }
}
