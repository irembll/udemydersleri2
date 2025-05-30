package OOP1.OOPAtm;

public class Hesap {

    private String kullanici_adi;
    private String parola;
    private int bakiye;

    public Hesap(String kullanici_adi, String parola, int bakiye){
        this.kullanici_adi = kullanici_adi;
       this.parola = parola;
       this.bakiye = bakiye;
    }


    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void parayatirma(int miktar){
        bakiye += miktar;
        System.out.println("Yeni Bakiyeniz : " + bakiye);
    }

    public void paracekme(int miktar){
        if (miktar > bakiye){
            System.out.println("Yeterli Bakiyeniz Yok. Bakiyeniz : " + bakiye);
        }
        else {
            bakiye -= miktar;
            System.out.println("Yeni Bakiyeniz : " + bakiye);
        }
    }
}
