package UmitPractise;

public class practise2 {
    public static void main(String[] args) {
        StringBuilder strB1 = new StringBuilder("AVATAR");

        strB1.subSequence(1,5);

        strB1.reverse();
        System.out.println("strB1 = " + strB1);
        strB1.deleteCharAt(2);

        System.out.println(strB1);
    }


}

