package j32_Abstract1.Ornek3;

public abstract class Salad extends Food {

    public abstract void madeIn();//parent ve child larda ayni isimli iki method tanimlanabilir




    @Override
    public void taste() {
        System.out.println("Agam salatan coban,sogus, mevsim verelim");

    }
}


