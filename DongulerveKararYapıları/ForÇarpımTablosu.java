package DongulerveKararYapıları;

import java.util.Scanner;

public class ForÇarpımTablosu {
    public static void main(String[] args) {
        //İç içe for döngüsünü kullanarak çarpim tablosu olusturun.

        Scanner input = new Scanner(System.in);

        for(int i = 1 ; i <= 10 ; i++){
            System.out.println("****************");
            for(int j = 1 ; j <= 10 ; j++){
                System.out.println( i + " * " + j + " = " + (i*j));
            }
            System.out.println("****************");
        }
    }
}
