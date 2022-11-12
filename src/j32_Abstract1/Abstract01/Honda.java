package j32_Abstract1.Abstract01;

public abstract class  Honda {//PARENT ABSTRACT CLASS

    public abstract void motor();
     void sunrooff(){
         System.out.println("Agam keyfini biliyorsun");

     }
     // SORU ABSTRACT  CLASSTA VARIABLE TANIMLANABILIR MI?


    String name = "Gulsum team lead";

     //variablellar abstract olur mu?

   // public abstract  int yas =48; kesinlikle hayir

    abstract void koltuk();
    abstract void kapi();



   // final void finalMethod(); // CONCRETE METHOD BODY SIZ OLAMAZ
    //final abstract void finalMethod();// ABS METHOD FINAL OLMAZ

    //private void privateMethod(); // CONCRETE METHOD BODY SIZ OLAMAZ

  //  private abstract void privateMethod();// ABS METHOD private  OLMAZ

   // static void gunesMethod(); //CONCRETE METHOD BODY SIZ OLAMAZ
   // static abstract void gunesMethod();ABS METHOD static OLMAZ

    // Honda obj = new Honda();// melekler dogurmaz ve obj uretmez



}
