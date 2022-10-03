package j11_MethodCreations;

public class C01_MethodCreationdeneme {
    public static void main(String[] args) {

        System.out.println("Bugun hava cok guzel");
        int maas =topla();
        System.out.println("maas = " + maas);
        System.out.println(carp1());
        topla2();
        System.out.println(bol());
        System.out.println(topla4("selam", 48));

        System.out.println(topla5(10, 20));
        System.out.println(topla5(15, 25));
        System.out.println(topla5(105, 205));
        System.out.println(topla5(30, 50));


    }

    private static int topla5(int g ,int h  ) {






       return 2*(g+h);





    }

    public static int topla4(String str, int a) {


        System.out.println(str);








     return a*2;

    }

    public static int bol() {

        int k = 25;
        int l = 5 ;


        return (k/l);
    }

    private static int carp1() {
       int x =72;
       int y = 3 ;

        return (x*y);
    }


    public static int topla (){

        int a = 51;
        int b  = 102;

        return (a+b);




    }

     public  static void topla2(){


        int z = 14;
        int i = 13;

         System.out.println(z+i);
         System.out.println("Umit Kalemkus");







     }




}
