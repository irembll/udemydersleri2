package OOP1.ConstructorPartBir;

public class ObjeReferanslari {
    public static void main(String[] args) {

        Account account1 = new Account("irem Bal","balirem375@gmail.com","12345");

        Account account2 = account1;

        Account account3 = new Account();

        if ( account1 == account2 ) {
            System.out.println("Aynı Objeyi gösteriyorlar");
        }
        else {
            System.out.println("Aynı Objeyi Göstermiyorlar");
        }

        new Account("Ahmet can","email@gmail.com","12345").bilgilerigoster();
    }
}
