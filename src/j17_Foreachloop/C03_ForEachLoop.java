package j17_Foreachloop;

public class C03_ForEachLoop { public static void main(String[] args) {
    // task array elamanlarının çarpımını print eden code create ediniz...-> with for-each

    int arr[][] = {{2, 3}, {4}, {5, 6, 7}};


    int crpm = 1;
    for (int kc[] : arr) {
        for (int a:kc){
            crpm*=a;
        }
    }
    System.out.println("crpm = " + crpm);//crpm = 5040

}





}
