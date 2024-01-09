package j32_Abstract1.Abstract01;

public class Civic extends Lastik{// Honda parent abs Class extend child concrete class

   // public  abstract  void absMethod();
   @Override
    public void motor() {

        System.out.println("1.6 eco motor az yakar cok kacar");

    }

    @Override
    void koltuk() {
        System.out.println("Agam ucuz diye kumas temiz kullanin");
    }

    @Override
    void kapi() {

        System.out.println("5 kapidan sedan");

    }


    public int vites(){//concrete child class method

        return 5;
    }

    @Override
    public void lastikebati() {
        System.out.println(" lastik ebati 2.4 inc");
    }

    //Honda obj = new Civic();//
    //Civic obj1 = new Civic();//
}
