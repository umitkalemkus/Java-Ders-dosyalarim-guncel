package j33_Interface.Task02;

public class ToyotaPrius extends Vehicle implements Electric, Gas{


    @Override
    public void ChangeBattery() {

        System.out.println(" Toyota Battery cok saglam");

    }

    @Override
    public void changeOil() {

        System.out.println(" Toyota yagi degistir");


    }
}
