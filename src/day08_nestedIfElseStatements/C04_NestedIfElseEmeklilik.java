package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C04_NestedIfElseEmeklilik {
    public static void main(String[] args) {



        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
        // “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("LUTFEN CINSIYETINIZI GIRINIZ E:ERKEK, K:KADIN");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);


        System.out.println("LUTFEN YASINIZI GIRINIZ");

        int yas = scanner.nextInt();
        //ANA DEGISKEN CINSIYET OLSUN

        if (cinsiyet=='E'){

            if (yas>80||yas<15){

                System.out.println("BU YASLAR ICIN EMEKLILIK SORGUMUZ CALISMIYOR");
            } else if (yas>=65) {

                System.out.println("ERKEK EMEKLI OLABILIR");

            }else{

                System.out.println("Emekli olmak icin "+(65-yas)+" Yil daha calisman gerekir");
            }


        } else if (cinsiyet=='K') {
            if (yas>70||yas<15){

                System.out.println("BU YASLAR ICIN EMEKLILIK SORGUMUZ CALISMIYOR");



        } else if (yas>=60)  {

                    System.out.println("Kadin EMEKLI OLABILIR");

            }else{
                System.out.println("Emekli olmak icin "+(60-yas)+" Yil daha calisman gerekir");


            }

            }else{

            System.out.println("CINSIYET ICIN E VE K SECMELISINIZ");
        }


    }
}
