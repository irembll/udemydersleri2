package Metotlar;

import java.util.Scanner;

public class IkiSayininEbobunuBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz: ");
        int sayi1 = input.nextInt();
        System.out.println("İkinci sayiyi giriniz: ");
        int sayi2 = input.nextInt();

        System.out.println("Ebob : " + EbobBulma(sayi1,sayi2));

    }

    public static int EbobBulma(int a, int b){
        int min = a;
        if(b < a) {
            min = b;
        }
            for(int i =min; i>=2; i--){
                if(a%i==0 && b%i==0){
                    return i;
                }
            }
        return 1;
    }
}

