package Metotlar;

public class MetotOverloading {
    public static void main(String[] args) {

        toplama(1,2,3);
        toplama(2,3);
        toplama("irem","bal");

        skorhesapla("irem",1000);
        skorhesapla("irem");
        skorhesapla(1500);
    }

    public static void toplama(int a, int b, int c){

        System.out.println("Toplamlar : " + (a+b+c));
    }

    public static void toplama(int a, int b){

        System.out.println("Toplamlar : " + (a+b));
    }

    public static void toplama(String a, String b){

        System.out.println((a+ " " + b));
    }

    public static void skorhesapla(String isim, int puan){

        System.out.println(isim + " adlı oyuncunun " + puan + " puanı var");
    }

    public static void skorhesapla(int puan){

        System.out.println("İsimsiz oyuncunun " + puan + " puanı var");

    }

    public static void skorhesapla(String isim){

        System.out.println(isim + " adlı oyuncunun hiç puanı yok");
    }
}
