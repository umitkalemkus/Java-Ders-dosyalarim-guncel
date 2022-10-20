package j17_Constructor;

public class C04_TeacherRunner {
    public static void main(String[] args) {
        //class      obje          muteahhit
        C04_Teacher ogrtmen = new C04_Teacher();//ogretmen objesi create edildi. ()
        // kigs of trick -> parametleri contractor default consu ezer.




        ogrtmen.ad="Umit";
        ogrtmen.brans="Math";
        ogrtmen.maas=7000;
        ogrtmen.id=4950;
        ogrtmen.tecrube=10;
        ogrtmen.emekli=false;
        ogrtmen.dersSaati();


        System.out.println(ogrtmen);

        C04_Teacher ogrtmen2 = new C04_Teacher("Aysegul","Kalemkus","Eng",10,7500,4689,false);
        System.out.println(ogrtmen2);














    }




}
