package interviewSorulari;

public class Soru61RemoveWhiteSpaces {

              // Remove White Spaces
              public static void main(String[] args) {

                  String  str ="Java Interview Questions";

                 // \\s  -> boslugu temsil eder

                 str = str.replaceAll("\\s" ,"");
                  System.out.println(str);




              }

}
