package Metotlar;

import java.util.Scanner;

public class MetotOverloadingHesapMakinesi {
    public static void main(String[] args) {
        /*
        Toplama ve Çarpma metodlarını 2 veya 3 parametre alacak şekilde tasarlayın.
         */

        Scanner input = new Scanner(System.in);

        String islemler = "1. Toplama İşlemi \n" +
                "2.Çıkarma İşlemi\n" +
                "3.Çarpma İşlemi\n" +
                "4.Bölme İşlemi\n" +
                "Çıkış için q'ya basın.";

        System.out.println("********************************");
        System.out.println(islemler);
        System.out.println("********************************");

        while(true){
            System.out.println("İşlem Seçiniz : ");
            String islem = input.nextLine();

            if(islem.contains("q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("Kaç değer kullanacaksınız ? (2 veya 3) :  ");
                int kacsayi = input.nextInt();

                if(kacsayi == 2){
                    System.out.println("sayi1 : ");
                    int sayi1 = input.nextInt();
                    System.out.println("sayi2 : ");
                    int sayi2 = input.nextInt();
                    System.out.println("Girilen sayıların toplamları : "+ toplama(sayi1, sayi2));
                }
                else if (kacsayi == 3){
                    System.out.println("sayi1 : ");
                    int sayi1 = input.nextInt();
                    System.out.println("sayi2 : ");
                    int sayi2 = input.nextInt();
                    System.out.println("sayi3 : ");
                    int sayi3 = input.nextInt();
                    System.out.println("Girilen sayıların toplamları : "+ toplama(sayi1, sayi2, sayi3));
                }
                else{
                    System.out.println("Bunun için uygun metot bulunmuyor...");
                }
            }
            else if (islem.equals("2")){
                System.out.println("sayi1 : ");
                int sayi1 = input.nextInt();
                System.out.println("sayi2 : ");
                int sayi2 = input.nextInt();
                System.out.println("Girilen sayıların farkı : " + cikarma(sayi1, sayi2));
            }
            else if (islem.equals("3")){
                System.out.println("Kaç değer kullanacaksınız ? (2 veya 3) :  ");
                int kacsayi = input.nextInt();

                if(kacsayi == 2){
                    System.out.println("sayi1 : ");
                    int sayi1 = input.nextInt();
                    System.out.println("sayi2 : ");
                    int sayi2 = input.nextInt();
                    System.out.println("Girilen sayıların çarpımı : "+ carpma(sayi1, sayi2));
                }
                else if (kacsayi == 3){
                    System.out.println("sayi1 : ");
                    int sayi1 = input.nextInt();
                    System.out.println("sayi2 : ");
                    int sayi2 = input.nextInt();
                    System.out.println("sayi : ");
                    int sayi3 = input.nextInt();
                    System.out.println("Girilen sayıların carpımı : "+ carpma(sayi1, sayi2, sayi3));
                }
                else {
                    System.out.println("Bunun için uygun metod bulunmuyor...");
                }
            }
            else if (islem.equals("4")){
                System.out.println("sayi1 : ");
                int sayi1 = input.nextInt();
                System.out.println("sayi2 : ");
                int sayi2 = input.nextInt();
                System.out.println("Girilen sayıların bölümü : "+ bolme(sayi1, sayi2));
            }
            else{
                input.nextLine();
                System.out.println("Geçersiz işlem girdiniz.");
            }
        }
    }

    public static int cikarma(int sayi1, int sayi2){
        return sayi1-sayi2;
    }

    public static double bolme(double sayi1, double sayi2){
        return ((double)sayi1/sayi2);
    }

    public static int toplama(int sayi1, int sayi2){
        return sayi1+sayi2;
    }

    public static int toplama(int sayi1, int sayi2, int sayi3){
        return sayi1+sayi2+sayi3;
    }

    public static int carpma(int sayi1, int sayi2){
        return sayi1*sayi2;
    }

    public static int carpma(int sayi1, int sayi2, int sayi3){
        return sayi1*sayi2*sayi3;
    }
}
//irem kodlamada kötü
