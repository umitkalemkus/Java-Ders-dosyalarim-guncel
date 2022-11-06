package j25_Encapsulation.Task2;



public class Banka {
    public static void main(String[] args) {


    // 1- bir Account sınıfı oluşturunuz, fieldları accountNumber ve balance (bakiye).
    // 2- bir consructor ekleyiniz.
    // 3- Account sınıfına deposit (ParaEkle) metodu ekleyiniz.
    // 4- Account sınıfına withdraw (ParaÇıkar) metodu ekleyiniz.
    // 5- withdraw de 5000 inin üzerine Günlük limiti aştınız uyarısı verelim
    // 6- main metodunda  account oluşturarak ihtimalleri deneyiniz.
     Account hesap =new Account(455666, 3000);

        System.out.println("hesap.accountNumber = " + hesap.accountNumber);
        System.out.println("hesap.balance = " + hesap.balance);
        hesap.deposit(5000);
        hesap.withdraw(7700);


        System.out.println("hesap.getBalance() = " + hesap.getBalance());
    }
}

