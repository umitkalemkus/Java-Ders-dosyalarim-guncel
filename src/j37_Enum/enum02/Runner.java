package j37_Enum.enum02;

public class Runner {
    public static void main(String[] args) {


        user kll1 = new user();
        kll1.name = "Umit Kalemkus";
       // kll1.role = 0;
       // kll1.status = 2;

        kll1.yetki=Role.ADMIN;
        kll1.durum=Status.INACTIVE;

        user kll2 = new user();
        kll2.name = "Aysegul Kalemkus";

        kll2.yetki=Role.CUSTOMER;
        kll2.durum=Status.LOGIN;


        if(kll1.yetki==Role.ADMIN){
            System.out.println("Patron sensin");
        }else System.out.println("Sen musterisin");

        if(kll2.yetki==Role.ADMIN){
            System.out.println("Patron sensin");
        }else System.out.println("Sen musterisin");



    }
}