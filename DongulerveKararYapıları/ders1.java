package DongulerveKararYapıları;

import java.util.Scanner;

public class ders1 {
    public static void main(String[] args) {

        /*
        for ( baslatma ; kosul ; arttırma veya azaltma islemleri){
             Döngü kosulumuz dogru olduğu sürece burası calısacak.
             }
         */


        for(int i = 0 ; i < 5 ; i++ ){
            System.out.println("i = "+i);
        }

        //Faktöriyel Hesaplama
        Scanner sc = new Scanner(System.in);
        int faktoriyel=1;
        System.out.println("Bir sayi giriniz : ");
        int sayi = sc.nextInt();

        for (int i =1 ; i<=sayi ; i++ ){
            faktoriyel *=i;
        }
        System.out.println("faktoriyel : " + faktoriyel);


        /*
        while(döngü koşulu){
            //Koşul doğru olduğu sürece çalışır
            arttırma-azaltma  işlemini yapmayı kendin yap!
            }
         */


        int i = 0 ;
        while (i < 10){
            System.out.println("i = "+i);
            i++;
        }

        //While faktöriyel hesabı

        System.out.println("Bir sayı giriniz : ");
        int sayı = sc.nextInt();
        int faktoriyel2 = 1;

        while (sayı >0){
            faktoriyel2 *= sayı;
            sayı--;
        }
        System.out.println("faktoriyel : " + faktoriyel2);
    }
}

