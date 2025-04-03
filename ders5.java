import java.util.Scanner;

public class ders5 {
    public static void main(String[] args) {
        //Kullanıcıdan Alınan 3 Sayıdan En Büyük Sayıyı Bulma
        Scanner sc = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz : ");
        int sayi1 = sc.nextInt();
        System.out.println("2.sayıyı giriniz : ");
        int sayi2 = sc.nextInt();
        System.out.println("3.sayıyı giriniz : ");
        int sayi3 = sc.nextInt();

        int max = sayi1;
        if (sayi2 > sayi1) {
            max = sayi2;
        }
        if (sayi3 > sayi2) {
            max = sayi3;
        }
        if (sayi1 > sayi3) {
            max = sayi1;
        }
        System.out.println("En büyük sayi : " + max);

        /*Kullanıcıdan alınan boy ve kilo değerlerine göre beden kitle indeksini hesaplayın ve aşağıdaki kurallara göre yapın.

            Beden Kitle Endeksi : Kilo / Boy * Boy

            BKİ 18.5'un altındaysa  :  zayıf

            BKİ 18.5 - 25 : normal

            BKİ 25 - 30 : fazla kilolu

            BKİ 30'un üstündeyse : Obez
         */
        System.out.println("Boyunuzu giriniz (Örnek : 1,58) : ");
        double boy = sc.nextDouble();
        System.out.println("Kilonuzu giriniz : ");
        int kilo = sc.nextInt();

        double BKI = kilo / (boy * boy);
        System.out.println("BKI : " + BKI);

        if (BKI < 18.5){
            System.out.println("zayıf");
        }
        else if (BKI >= 18.5 && BKI < 25){
            System.out.println("normal");
        }
        else if (BKI >= 25 && BKI < 30){
            System.out.println("fazla kilolu");
        }
        else if (BKI >= 30){
            System.out.println("obez");
        }

        // Switch Case Kullanarak 4 işlem yapan bir hesap makinesi
        System.out.println("Islem giriniz  ( 1 = Toplama  2= Çıkarma  3= Çarpma  4= Bölme ) : ");
        int islem = sc.nextInt();
        System.out.print("Birinci sayiyi giriniz : ");
        double birincisayi = sc.nextDouble();
        System.out.print("Ikinci sayiyi giriniz : ");
        double ikincisayi = sc.nextDouble();

        switch (islem) {
            case 1:
                System.out.println("Toplama : " + (birincisayi+ikincisayi));
                break;
            case 2:
                System.out.println("Çıkarma : " +  (birincisayi-ikincisayi));
                break;
            case 3:
                System.out.println("Çarpma : " + (int)(birincisayi*ikincisayi));
                break;
            case 4:
                System.out.println("Bölme : " + (birincisayi/ikincisayi));
                break;
                default:
                    System.out.println("Gecersiz Islem");
        }

    }
}