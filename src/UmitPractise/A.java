package UmitPractise;

public class A extends B{
    int age = 10;

    public static String sing(){

        return "fa";

    }

    public static void main(String[] args){

        A a = new A();

        B b = new B();

        System.out.println(a.sing() + " " + b.sing());

        System.out.println(a.age + " " + b.age);

    }
}
