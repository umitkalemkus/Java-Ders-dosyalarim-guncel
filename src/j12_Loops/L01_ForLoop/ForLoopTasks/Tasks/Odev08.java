package j12_Loops.L01_ForLoop.ForLoopTasks.Tasks;

public class Odev08 {

    public static void main(String[] args) {

        /*100'den 0'a kadar bütün tek sayıları yazdırınız.
        99-98-97-96....
        100 ve 0 dahil değildir.*/
        for (int i = 1; i <100 ; i++) {

            if (i%2==1){
                System.out.println(i);
            }

        }


    }
}
