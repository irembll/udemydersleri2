package OOP2.Encapsulation;

public class GelismisAbone {

    private String isim;

    private int bakiye = 120;

    private String sehir;

    public GelismisAbone(String isim, int bakiye, String sehir) {
        this.isim = isim;

        if(bakiye > 0 && bakiye <= 120){
            this.bakiye = bakiye;
        }

        this.sehir = sehir;
    }

    public void dogalgaz_kullan(int miktar){

        if (this.bakiye - miktar < 0){

            System.out.println("Yeterli Bakiye Yok.");
        }
        else{
            this.bakiye -= miktar;

            if (this.bakiye <= 0){

                System.out.println("Bakiyeniz bitmiştir . Lütfen en yakın abone merkezine giderek kredi yükleyin" +
                        " Kredi Limiti = 120TL");
            }
            else{
                System.out.println("Yeni Bakiye = " + bakiye);
            }
        }
    }

    public void bakiye_ogren(){
        System.out.println("Bakiye = " + bakiye);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
}
