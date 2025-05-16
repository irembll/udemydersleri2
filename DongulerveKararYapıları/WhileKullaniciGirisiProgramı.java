package DongulerveKararYapıları;

import java.util.Scanner;

public class WhileKullaniciGirisiProgramı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int giris_hakki = 3;
        String sys_kullanici = "irem";
        String sys_parola = "2424";

        System.out.println("Kullanıcı Girişine Hoşgeldiniz: ");

        while (true) {
            System.out.println("Kullanıcı Adı : ");
            String kullanici = input.nextLine();

            System.out.println("Parola : ");
            String parola = input.nextLine();

            if (kullanici.equals(sys_kullanici) && parola.equals(sys_parola)) {
                System.out.println("Hoşgeldiniz " + kullanici);
                break;

            } else if (kullanici.equals(sys_kullanici) && !parola.equals(sys_parola)) {
                System.out.println("Parolanız Yanlış");
                giris_hakki--;
                System.out.println("Kalan Giriş Hakkınız : " + giris_hakki);

            } else if (!kullanici.equals(sys_kullanici) && parola.equals(sys_parola)) {
                System.out.println("Kullanıcı Adınız Yanlış");
                giris_hakki--;
                System.out.println("Kalan Giriş Hakkınız : " + giris_hakki);

            }
            else {
                System.out.println("Kullanıcı Adınız ve Parolanız Yanlış");
                giris_hakki--;
                System.out.println("Kalan Giriş Hakkınız : " + giris_hakki);

            }
            if (giris_hakki == 0) {
                System.out.println("Giriş Hakkınız Bitti.");
                break;
            }
        }
    }
}
