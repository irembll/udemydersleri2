package OOP1.ConstructorPartBir;

public class Account {

    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNO;

    public Account() {

       // System.out.println("Kendi Yazdığımız Constructor...");

        /*
        this.hesapNo = "Bilgi yok";
        this.bakiye = 0;
        this.isim = "Bilgi yok";
        this.email = "Bilgi yok";
        this.telefonNO = "Bilgi yok";

         */

        this("Bilgi yok",0,"Bilgi yok","Bilgi yok","Bilgi yok");

    }

    public Account(String isim, String email, String telefonNO) {

       /*

       this.isim = isim;
        this.email = email;
        this.telefonNO = telefonNO;

        this.bakiye = 0;
        this.hesapNo = "Bilgi yok";

        */

        this("Bilgi yok",0,isim,email,telefonNO);

    }

    public Account(String hesapNo, double bakiye, String isim, String email, String telefonNO) {

        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNO = telefonNO;

    }

    public void bilgilerigoster(){

        System.out.println("Hesap No : " + hesapNo);
        System.out.println("Bakiye : " + bakiye);
        System.out.println("Isim : " + isim);
        System.out.println("Email : " + email);
        System.out.println("TelefonNO : " + telefonNO);

    }


    public void parayatır(double miktar) {

        bakiye += miktar;
        System.out.println("Yeni Bakiye : " + bakiye);
    }

    public void paracek(double miktar) {

        if(miktar > 1500) {
            System.out.println("Bir günde 1500TL'den fazla para çekemezsiniz. ");
        }
        if(bakiye-miktar < 0) {
            System.out.println("Yeterli Bakiye yok. Bakiyeniz : " + bakiye);
        }
        else{
            bakiye -= miktar;
            System.out.println("Yeni bakiye : " + bakiye);
        }
    }


    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }
    public String getHesapNo() {
        return hesapNo;
    }
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public double getBakiye() {
        return bakiye;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getIsim() {
        return isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNO() {
        return telefonNO;
    }

    public void setTelefonNO(String telefonNO) {
        this.telefonNO = telefonNO;
    }
}
