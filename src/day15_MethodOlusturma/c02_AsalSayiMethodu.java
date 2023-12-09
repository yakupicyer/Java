package day15_MethodOlusturma;

import java.util.Scanner;

public class c02_AsalSayiMethodu {
    public static void main(String[] args) {
        /*



        Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
        Girilen sayinin asal sayi olup olmadigini kontrol edip,
        sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz");

        int sayi= scanner.nextInt();

        asalsayiMI(sayi);
    }


    public static void asalsayiMI(int sayi){
        //“asal sayi” veya “asal sayi degil”

        int Flag=20;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                Flag++;
                break;
            }

        }
        if (Flag==20){
            System.out.println("VERILEN SAYI ASAL ");
        }else{
            System.out.println("VERILEN SAYI ASAL DEGIL");
        }

    }
}
