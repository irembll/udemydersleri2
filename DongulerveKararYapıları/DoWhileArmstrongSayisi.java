package DongulerveKararYapıları;

import java.util.Scanner;

public class DoWhileArmstrongSayisi {
    public static void main(String[] args) {

         /*
        Girilen bir sayının armstrong sayısını olup olmadığını bulmaya çalışın.
        Örneğin, 4 basamaklı bir sayının armstrong sayısı olması için şu şartı sağlaması gerekmektedir.
        1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4 basamak sayısı)
        371 = 3^3 + 7^3 + 1^3 (Buradaki 3 basamak sayısı)

        Bu programı do while döngüsü yardımıyla yapabilirsiniz.
        */
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        int sayi = input.nextInt();

        int orjinal_sayi = sayi;

        int gecici_sayi = sayi;

        int toplam = 0;
        int basamak_sayisi = 0;
        while (sayi >0){
            sayi /= 10;
            basamak_sayisi ++;
        }



        do{
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi /= 10;

            toplam += (int) Math.pow(basamak_degeri,basamak_sayisi);

        }while(gecici_sayi > 0);

        if (orjinal_sayi == toplam){
            System.out.println("Bu sayi bir armstrong sayisidir...");
        }
        else{
            System.out.println("Bu sayi bir armstrong sayisi değildir...");
        }

    }
}
