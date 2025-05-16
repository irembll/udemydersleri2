package OOP1.Inheritance_Kalitim_Bir;

public class Calisan {  //Superclass veya BaseClass   ana klas

    private String isim;
    private int maas;
    private String departman;

    public Calisan(String isim, int maas, String departman) {
        this.setIsim(isim);
        this.setMaas(maas);
        this.setDepartman(departman);
    }

    public void calıs(){

        System.out.println("Çalışan Çalışıyor...");
    }

    public void bilgilerigoster(){

        System.out.println("İsim : " + isim);
        System.out.println("Maas : " + maas);
        System.out.println("Departman : " + departman);
    }

    public void departman_degistir(String yeni_departman){

        System.out.println("Departman değiştiriliyor...");
        this.departman = yeni_departman;

        System.out.println("Yeni departman : " + this.getDepartman());
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
