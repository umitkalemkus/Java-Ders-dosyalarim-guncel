package j37_Enum.enum01;

public class Runner {
    public static void main(String[] args) {
        //Task -> verilen bir ay numarasına göre kaç gün çektiğini print eden code create ediniz
       Aylar ay =Aylar.MART; //Aylar enum'ından ay field value MART olarak tanımlandı
        System.out.println(ay);
        System.out.println(ay.name());
        System.out.println(ay.ordinal());

      //  int ay = 3;
        switch (ay) {
            case OCAK: {
                System.out.println("Ocak ayi 31 gundur");
                break;
            }
            case SUBAT: {
                System.out.println("Subat ayi 28 gundur");
                break;

            }
            case MART: {
                System.out.println("Mart ayi 31 gundur");
                break;
            }
            case NISAN: {
                System.out.println("Nisan ayi 30 gundur");
                break;
            }
            case MAYIS: {
                System.out.println("Mayis ayi 31 gundur");
                break;
            }
        }
    }
}