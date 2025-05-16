package OOP1.Inheritance_Calisanlar_Programi;

public class Yonetici extends Calisan{

    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {

        super(ad, soyad, id);

        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Yöneticinin Sorumlu Olduğu Kişi Sayisi : " + sorumlu_kisi_sayisi);
    }

    public void zamYap(int zamMiktari){

        System.out.println(getAd() + " çalışanlara " + zamMiktari + " tl kadar zam yapılıyor...");
    }
}
