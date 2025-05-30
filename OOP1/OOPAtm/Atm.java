package OOP1.OOPAtm;

import java.util.Scanner;

public class Atm {

    public void calis(Hesap hesap) {

        Login login = new Login();

        Scanner input = new Scanner(System.in);

        System.out.println("Bankamıza Hoşgeldiniz...");

        System.out.println("**************************");
        System.out.println("Kullanıcı Girişi " );
        System.out.println("**************************");

        int giris_hakki =3;

        while (true){
            if(login.login(hesap)){
                System.out.println("Giriş Başarılı...");
                break;
            }
            else{
                System.out.println("Giriş Başarısız...");
                giris_hakki--;
                System.out.println("Kalan Giriş Hakkı : " + giris_hakki);
            }
            if(giris_hakki==0){
                System.out.println("Giriş Hakkınız Bitti...");
                return;
            }
        }

        System.out.println("********************************");
        String islemler = "1.Bakiye Görüntüle \n" +
                "2.Para Yatırma\n" +
                "3.Para çekme\n" +
                "Çıkış için q'ya basın";
        System.out.println(islemler);
        System.out.println("********************************");


        while(true){
            System.out.println("İşlem Seçiniz : ");
            String islem = input.nextLine();
            if(islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.println("Yatırmak istediğiniz miktar : ");
                int miktar = input.nextInt();
                input.nextLine();
                hesap.parayatirma(miktar);
            }
            else if(islem.equals("3")){
                System.out.println("Çekmek istediğiniz miktar : ");
                int miktar = input.nextInt();
                input.nextLine();
                hesap.paracekme(miktar);
            }
            else{
                System.out.println("Geçersiz İşlem...");
            }
        }
    }
}
