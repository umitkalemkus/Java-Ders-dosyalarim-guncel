package j32_Abstract1.Abstract02;

public class IdariPersonel extends Personel {
    @Override //mecbur implemen edilemli
    public void maasHesapla() {//Personel parent class'dan override conc. meth.
        System.out.println(" Agam frapan idarecemize saati 120 dolar");
    }

    @Override//mecbur implemen edilemli
    public void maasBilgisi() {//Personel parent class'dan override conc. meth.
        System.out.println("Agam cincik code yazan idari personele bir ay ikramiye");

    }

    @Override //tercihen override edildi
    public void sigorta() {//Personel parent class'dan override conc. meth.
        System.out.println("Full sigorta");
    }
}
