package OOP1.ConstructorPartBir;

public class AccountMain {
    public static void main(String[] args) {

        Account account1 = new Account();

        System.out.println(account1.getEmail());

        Account account2 = new Account("12313",1000,"irem","kfaşlfk@gmail.com","4534");

        account2.parayatır(500);
        account2.paracek(100);

        Account account3 = new Account("Ahmet can","exam@gmail.com","4654323");

        System.out.println(account3.getEmail());
        System.out.println(account3.getBakiye());

        account3.bilgilerigoster();
    }
}
