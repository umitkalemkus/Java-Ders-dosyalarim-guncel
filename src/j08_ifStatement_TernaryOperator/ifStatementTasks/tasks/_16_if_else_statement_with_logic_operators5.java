package j08_ifStatement_TernaryOperator.ifStatementTasks.tasks;

public class _16_if_else_statement_with_logic_operators5 {

    public static void main(String[] args) {

       /*   45 değerinde bir double oluşturun.
            Eğer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
            "able to divide by 5 and 8" yazdırınız.

            Eğer double 10'a bölününce kalan 5 ise ve double 9'a bölününce kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.  */
        double num = 45;
        if (num % 5 == 0 && num % 8 == 0) {
            System.out.println("able to divide by 5 and 8");
        }
        if (num % 10 == 5 && num % 9 == 0) {
            System.out.println("able to divide by 9 and divide by 10 reminder is 5");
        }


    }
}
