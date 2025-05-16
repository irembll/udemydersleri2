package Metotlar;

public class MetotlardaReturn {
    public static void main(String[] args) {

        System.out.println("Toplamları : " + toplama(1,2,3));

        System.out.println("Sonuc : " + dortilecarp(ikiyletoplam(ikiylecarp(8))));
    }

    public static int toplama(int a, int b, int c){

        return (a+b+c);
    }

    public static int ikiylecarp(int a){
        return a*2;
    }

    public static int ikiyletoplam(int a){
        return a+2;
    }

    public static int dortilecarp(int a){
        return a*4;
    }
}
