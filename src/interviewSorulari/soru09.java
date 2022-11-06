package interviewSorulari;

public class soru09 {

    //  Question Check whether an alphabet is Vowel or Consonant
    public static void main(String[] args) {


    char ch ='k';


    if (ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'  ){
        System.out.println("Vowel");
    }else{
        System.out.println("Consonant");
    }


    //   Second way



         switch (ch){
             case 'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u':
             System.out.println("Vovel");
             break;
             default:
                 System.out.println("Consonant");




         }






    }
}
