package Metotlar;

public class MetotlardaParametreKullanimi {
    public static void main(String[] args) {

        selamlama("iros");
        toplama(3,5,1);

    }

    public static void selamlama(String isim){

        System.out.println("Selamlar " + isim);
    }

    public static void toplama(int a, int b, int c){

        System.out.println("Toplamamları : " + a + " + " + b + " + " + c +" = " + (a + b + c));
    }
}
