package j33_Interface;

public interface disDonanim {

    public void kapi();//abs. method
    void kaporta();//abs method

    String RENK =" Kirmizi renk";//public static final variable




    public default String sisLamp(){// default conc. meth

        return "sisli havada dikkat ";
    }
      static void anten(){//STATIC CONC. METH

          System.out.println("AGAAM YINE ANTIN KUNTIN ISLERDESIN");
      }



    static void aga(){
        System.out.println("AGAM SENSIZ OLAMAZ");
    }

    //public static default void sorunMethod(){}//->Cte statik default ayni anda kullanilamaz


    //disDonanim obj =new disDonanim();// can not be instantinated -> obj olamaz olamaz

   //public static void main(String[] args) {//bad practise-> projede tek bir main method ve method class kullanilmali

   //    System.out.println("RENK = " + RENK);
   //    aga();//statik meth call


    }






