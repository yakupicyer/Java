package day07_ifelse_sorucozum;

import java.util.Scanner;

public class c06_vucut_Kitleendeksi {
    public static void main(String[] args) {

        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        //         vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        //         vucut kitle endeksi 30’dan buyukse obez,
        //         25-30 arasi ise kilolu,
        //         20-25 arasi ise normal,
        //         20’den kucukse zayif yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("lUTFEN KILONUZU KG OLARAK GIRIN");
        double kilo= scanner.nextDouble();

        System.out.println("lUTFEN BOYUNUZU CM OLARAK GIRIN");
        double boy= scanner.nextDouble();

        double VKE= (kilo*10000/(boy*boy));
        System.out.println("Vucut kitle endeksiniz:"+VKE);

        if (VKE>50||VKE<10){
            System.out.println("Degerleri yanlis girdiniz");


        } else if (VKE>=30){
            System.out.println("OBEZSINIZ");

        } else if (VKE>=25) {
            System.out.println("KILOLUSUNUZ");


        } else if (VKE>=20) {
            System.out.println("Tebrikler, Normalsiniz");


        }else{
            System.out.println("Zayifsiniz");
        }

    }
}
