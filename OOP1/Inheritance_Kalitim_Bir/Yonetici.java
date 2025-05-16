package OOP1.Inheritance_Kalitim_Bir;

public class Yonetici extends Calisan {   //Subclass      alt sınıfı

    private int sorumlu_kisi;  // Ekstra Özellik

    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {

        super(isim, maas, departman);

        this.sorumlu_kisi = sorumlu_kisi;
    }

        public void zamYap(int zam_miktari){

            System.out.println("Çalışanlara " + zam_miktari + " tl zam yapıldı.");
        }

    public void bilgilerigoster(){
        /*
        System.out.println("İsim : " + getIsim());
        System.out.println("Maas : " + getMaas());
        System.out.println("Departman : " + getDepartman());

         */

        super.bilgilerigoster();

        System.out.println("Sorumlu Kişi Sayısı : " + this.sorumlu_kisi);
    }
}
