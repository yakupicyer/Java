package day06_ifElseStatement;

import java.util.Scanner;

public class C08_IFELSESUSLUPARANTEZKULL {
    public static void main(String[] args) {

        //kull.2 tam sayi alin
        // EGER SSAYI 1 SAYI2 DEN BUYUKSE SAYI1 I BIR AZALTIP SAYI2 YI 2ARTTIRIN
        // SAYI1 SAYI2 DEN BUYUYK DEGILSE SAYI1 I 3 ILE CARPIN SYI2 YI 2 ILE CARPIN
        // SAYI1 VE SAYI2 NIN DEGERLERI

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi1 > sayi2) {
            sayi1--;
            sayi2++;

            System.out.println("sayi1 = " + sayi1 + ",sayi2=" + sayi2);

        } else {
            sayi1 *= 3;
            sayi2 *= 2;


            System.out.println("Sayi1:" + sayi1 + ",Sayi2:" + sayi2);


        /*
            eger if ve else'den sonra { } kullanmazsak
            Java if body ve else body olarak ilk ;'e kadar olan kismi alir
            Eger if ve else body'leri TEK BIR SATIR'dan olusuyorsa {} kullanmasak da olur
            AMMA if body'sinde veya else body'sinde bir satirdan fazla kod varsa
            MUTLAKA {} kullanmaliyiz
         */





        }

    }
}

