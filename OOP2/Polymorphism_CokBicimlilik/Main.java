package OOP2.Polymorphism_CokBicimlilik;

class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus(){
        return " Hayvan konuşuyor...";
    }
}

class Kedi extends Hayvan {

    public Kedi(String isim) {
        super(isim);
    }

    public String konus(){
        return this.getIsim() + " miyavliyor...";
    }
}

class Kopek extends Hayvan {

    public Kopek(String isim) {
        super(isim);
    }

    public String konus(){
        return getIsim() + " havlıyor...";
    }
}

class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    public String konus(){
        return getIsim() + " kişniyor...";
    }
}


public class Main {

    public static void konustur(Hayvan hayvan) {
        System.out.println(hayvan.konus());
    }


    public static void main(String[] args) {

        //Bir objenin hangi classtan olduğunu anlamak için : instanceof

        Kopek kopek = new Kopek("Karabaş");

        if (kopek instanceof Hayvan) {
            System.out.println("Bu nesne Hayvan sınıfından...");
        }

       /*
       Hayvan hayvan1 = new Kedi("Tekir");
        Hayvan hayvan2 = new Kopek("Karabş");
        Hayvan hayvan3 = new At("Şahbatur");

        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());
        */


        konustur(new Kedi ("Tekir"));
        konustur(new Kopek("Karabaş"));
        konustur(new At ("Şahbatur"));

    }
}
