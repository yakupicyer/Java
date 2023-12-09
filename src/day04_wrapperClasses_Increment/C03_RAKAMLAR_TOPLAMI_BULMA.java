package day04_wrapperClasses_Increment;

import java.util.Scanner;

public class C03_RAKAMLAR_TOPLAMI_BULMA {
    public static void main(String[] args) {

        //kullanicidan 4 basamakli bir sayi alip
        //Sayinin rakamlar toplamini yazdirin

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli sayi girin");

        int girilensayi= scanner.nextInt();

        //Kullanici375 sayisisni girdi
        //bize birler basamagini ve rakamlar toplamini kaydedecegimiz 2 variable lazim

        int birlerbasamagi=0;
        int rakamlartoplami=0;

        birlerbasamagi=girilensayi%10;

        rakamlartoplami=rakamlartoplami+birlerbasamagi;

        //5 I RAKAMALAR TOPLAMINA EKLEDIK VE 5 TEN KURTULDUK

        girilensayi=girilensayi/10;
        birlerbasamagi=girilensayi%10;


        rakamlartoplami=rakamlartoplami+birlerbasamagi;
        girilensayi=girilensayi/10;

        rakamlartoplami=rakamlartoplami+girilensayi;
        System.out.println("girilen sayinin rakamalar toplami"+rakamlartoplami);





        //7 I EKLEdik ve 7 den kurtulduk







    }
}
