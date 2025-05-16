package OOP1.OOPAtm;

public class Main {

    public static void main(String[] args) {

        Atm atm = new Atm();

        Hesap hesap = new Hesap("irem bal","2424",2000);

        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor...");
    }
}
