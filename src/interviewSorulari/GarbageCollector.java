package interviewSorulari;

public class GarbageCollector {
    public static void main(String[] args) {


        GarbageCollector t1 = new GarbageCollector();
        t1 = null;
        System.gc();
        System.out.println("Umit kalemkus");


    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Rukiye Sena Kalemkus");
    }
}