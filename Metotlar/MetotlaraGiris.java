package Metotlar;

import java.util.Scanner;

public class MetotlaraGiris {
    public static void main(String[] args) {

        /*

        Erişim_Belirleyici(Opsiyonel) Ekstra_Özellikler Dönüş_Tipi Fonksiyon_Adı(Parametreler){
        //Burası Fonksiyon Bloğu

        //Fonksiyonun yapacağı işlemler burada olacak.
        }

         */

        selamlama();
        faktoriyel();
    }

    public static void selamlama(){

        System.out.println("Merhaba Nasılsınız ? ");
        System.out.println("Selamlar...");
    }

    public static void faktoriyel(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ekrana bir sayi giriniz : ");
        int sayi = input.nextInt();

        int faktoriyel = 1;

        while (sayi > 0){

            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("Fakoriyel : " + faktoriyel);
    }
}
