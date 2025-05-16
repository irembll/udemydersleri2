package DongulerveKararYapıları;

import java.util.Scanner;

public class WhileATM {
    public static void main(String[] args) {
        Scanner ınput = new Scanner(System.in);
        System.out.println("*************************");
        System.out.println(
                " 1.islem = Bakiye Öğrenme\n" +
                " 2.islem = Para Çekme\n" +
                " 3.islem = Para yatırma\n" +
                " 4.islem = Çıkış ");
        System.out.println("*************************");


        int bakiye = 500;

        while (true){
            System.out.print("İşlemi Seçiniz: ");
            int islem = ınput.nextInt();
            if (islem == 4 ){
                System.out.println("programdan çıkılıyor... ");
                break;
            }
            else if (islem == 1){
                System.out.println(bakiye);
            }
            else if (islem == 2){
                System.out.println("çekmek istediğiniz tutarı giriniz : ");
                int tutar = ınput.nextInt();
                if ( bakiye - tutar < 0){
                    System.out.println("yeterli bakiye yok. Bakiyeniz : " + bakiye);
                }
                else {
                    bakiye -= tutar;
                    System.out.println("Bakiyeniz : " + bakiye);
                }
            }
            else if (islem == 3){
                System.out.println("yatırmak istediğiniz tutarınız giriniz : ");
                int tutar = ınput.nextInt();
                bakiye += tutar;
                System.out.println("Bakiyeniz : " + bakiye);
            }
            else {
                System.out.println("Geçersiz işlem...");
            }
        }



    }
}
