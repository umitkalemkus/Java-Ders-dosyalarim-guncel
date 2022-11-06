package j25_Encapsulation.Task2;

public class Account {

    int accountNumber;
    int balance;

    public Account(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
   private static int number =1;
    public void deposit(double income){
        balance += income;


    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(double outcome){
        if(outcome>5000){
            System.out.println("limiti astiniz");

        if(outcome>this.balance){
            System.out.println("Yetersiz bakiye");
        }
        }

        balance -= outcome;


    }

}
