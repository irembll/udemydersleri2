package OOP1.OOPGiris;

public class ArabaMain {
    public static void main(String[] args) {

        Araba araba1 = new Araba();


        araba1.tekerlekler = 4;
        araba1.motor = "16V";
        araba1.model = "Renault";

        System.out.println(araba1.motor);



        araba1.setRenk("Krmızı");

        System.out.println("Arabanın rengi : " + araba1.getRenk());

        araba1.setKapilar(-4);
    }
}
