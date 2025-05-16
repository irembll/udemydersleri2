package DongulerveKararYapıları;

import java.util.Scanner;

public class FaizUygulamasi {
    public static void main(String[] args) {

        /*
        Kullanıcıdan ana para değerini ve parasını kaç yıl vadeli yatırmak istediği
        bilgisini alın ve her sene sonunda toplam para miktarini ekrana yazdirin.

        Faiz oranı : %6 Faiz Oranı
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Bankamiza Hoşgeldiniz.\n"
                + "Faiz Oranı %6");
        System.out.println("**************************");

        int anapara;
        int vade;

        System.out.println("Yatırmak istediğiniz tutar : ");
        anapara = input.nextInt();

        System.out.println("Paranizi kaç yıl vadeli yatırmak istiyorsunuz : ");
        vade = input.nextInt();

        double toplampara = anapara;
        double FaizOrani = 0.06;

        for (int i = 1; i <= vade; i++) {
            toplampara = (toplampara * FaizOrani) + toplampara;

            System.out.println(i + ".yılın sonunda toplam para " + (int)toplampara);
        }

    }
}
