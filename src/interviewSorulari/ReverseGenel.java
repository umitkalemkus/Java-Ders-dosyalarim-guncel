package interviewSorulari;

public class ReverseGenel {

    public static void main(String[] args) {



    }

    private static void method1ForLastIndex(String str) {
        String s1 = "";
        String s2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s1 += str.charAt(i);
            s2 += str.substring(i, i + 1);
        }
        System.out.println("For Loop CharAt ile: " + s1);
        System.out.println("For Loop substring ile: " + s2);
    }
    private static void method3WhileSubstring(String str) {
        String s5="";
        while (str.length()>0){
            s5+= str.charAt(str.length()-1);
            str= str.substring(0,str.length()-1);
        }
        System.out.println("While ile "+s5);
    }
    private static void method6StrArray(String str) {
        String[] strArray = str.split("");
        System.out.print("StrinArray ile ");
        for(int i= strArray.length-1; i>=0; i--) {
            System.out.print(strArray[i]);
        }
        System.out.println();//dummy
    }
    private static void method7CharArray(String str) {
        char[] charArray = str.toCharArray();
        System.out.print("Char Array ile ");
        for(int i= charArray.length-1; i>=0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();//dummy
    }







}





