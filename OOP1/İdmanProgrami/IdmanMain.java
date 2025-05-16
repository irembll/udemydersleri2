package OOP1.İdmanProgrami;

import java.util.Scanner;

public class IdmanMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("İdman Programina Hoşgeldiniz...");

        String idmanlar = "Geçerli Hareketler...\n" +
                "Burpee\n" +
                "Pushup(Şınav)\n" +
                "Situp(Mekik)\n" +
                "Squat";
        System.out.println(idmanlar);

        System.out.println("Bir idman oluşturun...");

        System.out.println("Burpee sayisini giriniz : ");
        int burpee_sayisi = input.nextInt();
        System.out.println("Pushup sayisini giriniz : ");
        int pushup_sayisi = input.nextInt();
        System.out.println("Situp sayisini giriniz : ");
        int situp_sayisi = input.nextInt();
        System.out.println("Squat sayisini giriniz : ");
        int squat_sayisi = input.nextInt();

        input.nextLine();

        Idman idman = new Idman(burpee_sayisi,pushup_sayisi,situp_sayisi,squat_sayisi);

        System.out.println("İdmanınınız Başlıyor...");

        while (idman.idmanBittiMi() == false) {

            System.out.println("Hareket Türü (Burpee, Pushup, Situp, Squat) : ");
            String tur = input.nextLine();
            System.out.println("Bu hareketten kaç tane yapacaksınız : ");
            int sayi = input.nextInt();
            input.nextLine();

            idman.hareketYap(tur, sayi);
        }
    }
}
