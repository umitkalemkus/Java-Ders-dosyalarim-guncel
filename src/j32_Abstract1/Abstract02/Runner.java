package j32_Abstract1.Abstract02;

public class Runner {
    public static void main(String[] args) {
        Isci mrb1 = new Isci();
        mrb1.maasBilgisi();//Agam marabalar cay-cüğara hariç günde 8 saat kürek mahkumu :(
        mrb1.maasHesapla();///agam marabalara en çok yeymiye 499 gayme verilir..
        mrb1.name="Ebubekir bey";
        System.out.println("mrb1.name = " + mrb1.name);//mrb1.name = Ebubekir bey
        mrb1.sigorta();//

        
        IdariPersonel cncCdr = new IdariPersonel();

        cncCdr.name="Dilek Hanim";
        System.out.println("cncCdr.name = " + cncCdr.name);
        cncCdr.sigorta();//methodlar constractor ile call edilir kendi methodunu cagirir.
        cncCdr.maasBilgisi();
        cncCdr.maasHesapla();



    }







}
