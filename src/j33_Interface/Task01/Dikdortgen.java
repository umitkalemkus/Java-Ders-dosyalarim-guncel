package j33_Interface.Task01;

public class Dikdortgen implements Sekil{
    @Override
    public int cevre(int... boyut) {
        return (boyut[0]+boyut[1])*2;
    }

    @Override
    public int alan(int... boyut) {
        return 0;
    }
}
