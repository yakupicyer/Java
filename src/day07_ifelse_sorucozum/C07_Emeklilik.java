package day07_ifelse_sorucozum;

import java.util.Scanner;

public class C07_Emeklilik {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("LUTFEN CINSIYETINIZI GIRINIZ E:ERKEK, K:KADIN");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);


        System.out.println("LUTFEN YASINIZI GIRINIZ");
        int yas = scanner.nextInt();


        if (cinsiyet == 'E' && yas > 65) {
            System.out.println("65 YAS UZERI ERKEK EMEKLI OLABILIR");


        } else if (cinsiyet == 'E' && yas < 65) {
            System.out.println("Emekli olmak icin " + (65 - yas) + " yil daha calismaniz lazim");

        } else if (cinsiyet == 'K' && yas > 60) {
            System.out.println("60 YAS UZERI kadin EMEKLI OLABILIR");

        } else if (cinsiyet == 'K' && yas < 60) {
            System.out.println("Emekli olmak icin " + (60 - yas) + " yil daha calismaniz lazim");

        } else {
            System.out.println("Hatali Giris");

        }


    }
}


