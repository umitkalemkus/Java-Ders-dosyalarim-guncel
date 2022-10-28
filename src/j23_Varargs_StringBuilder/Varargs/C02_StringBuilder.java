package j23_Varargs_StringBuilder.Varargs;

public class C02_StringBuilder {
    public static void main(String[] args) {


    StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length());
        sb1.append("JAVATAR");
        System.out.println("sb1.capacity() = " + sb1.capacity());
        System.out.println("sb1 = " + sb1);
        sb1.append(" selam ").append("olsun").append(" ").append(24).append(" ").append(true);
        System.out.println("sb1.capacity() = " + sb1.capacity());
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());
        sb1.append("basari gayrete asiktir");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());


    }
}