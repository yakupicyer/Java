package day14_nestedForLoop;

import java.util.Scanner;

public class c01_RakamlarToplmi {
    public static void main(String[] args) {


/*

Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.


 */
        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayilar giriniz");

        int sayi= scanner.nextInt();
                                               //Önce bana basamak sayisi lazim
        int basamaksayisi=(sayi+"").length();



        int Birlerbasamagi=0;
        int rakamlarToplami=0;
        int girilenSayi=sayi;

        for (int i = 0; i < basamaksayisi; i++) {
            Birlerbasamagi=girilenSayi%10;
            rakamlarToplami+=Birlerbasamagi;
            girilenSayi /=10;

        }
        System.out.println(" Girilen " +sayi+ " sayisinin rakamlari toplami:"+rakamlarToplami);

    }
}
