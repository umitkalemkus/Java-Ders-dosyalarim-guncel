package j23_Varargs_StringBuilder.Varargs;

public class Task5methodlarTersYazim {
    public static void main(String[] args) {
        /*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Method yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I
	        It is not a palindrome"

		 */





    StringBuilder sb =new StringBuilder("i love you");

        System.out.println("sb.reverse() = " + sb.reverse());

        System.out.println("tersString(\"ey edip adanada pide ye;\") = " + tersString("ey edip adanada pide ye;"));
        System.out.println(isPolidrom("ey edip adanada pide ye"));
        System.out.println("isPolidrom(\"aga\") = " + isPolidrom("aga"));
        tersSB(new StringBuilder("merhaman"));

    }//main sonu


    public static String tersString (String str){ /// amele kod
        String tersString="";

        for (int i =str.length()-1; i >=0 ; i--) {
            tersString+=str.charAt(i);
        }

     return tersString;
    }

      public static void tersSB(StringBuilder sb){

          System.out.println("sb.reverse() = " + sb.reverse());


      }
      public static boolean isPolidrom(String str){
        if(str==null){
            return false;
        }
        return new StringBuilder(str).reverse().toString().equals(str);

    }







}



