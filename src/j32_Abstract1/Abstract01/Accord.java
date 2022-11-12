package j32_Abstract1.Abstract01;

public class Accord extends Honda{
    @Override
    void sunrooff() {// override edilen method
        System.out.println(" hava sicak tavani ac");
    }

    @Override
    public void motor() { //implement edilen abstract method
        System.out.println(" agam 2.0  turbo atesle");
    }

    @Override
    void koltuk() {//implement edilen abstract method
        System.out.println(" deri koltuk kullaniyorum");
    }

    @Override
    void kapi() {//implement edilen abstract method

        System.out.println(" agam vakumlu kapi carpilma");

    }
}
