package OOP2.Encapsulation;

public class Main {
    public static void main(String[] args) {

       /*

       Abone abone = new Abone();

        abone.isim = "irem bal";
        abone.bakiye = 200;
        abone.sehir = "İstanbul";

        abone.dogalgaz_kullan(200);

        */

        GelismisAbone abone = new GelismisAbone("İrem",200,"İstanbul");

        abone.bakiye_ogren();
    }
}
