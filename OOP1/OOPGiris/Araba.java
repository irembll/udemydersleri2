package OOP1.OOPGiris;

public class Araba {

     private String renk;
     private int kapilar;
     public  int tekerlekler;
     public String motor;
     public String model;

     public void setRenk(String renk) {

          this.renk = renk;
     }

     public String getRenk() {

          return renk;
     }

     public int getKapilar() {
          return kapilar;
     }

     public void setKapilar(int kapilar) {
          if(kapilar<0){
               System.out.println("Kapı sayısı 0'dan kücük olamaz. ");
          }
          else{
               this.kapilar = kapilar;
          }
     }
}
