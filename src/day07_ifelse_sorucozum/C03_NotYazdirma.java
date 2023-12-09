package day07_ifelse_sorucozum;

import java.util.Scanner;

public class C03_NotYazdirma {
    public static void main(String[] args) {

        // kullanicidan 100 uzerinden notunu alin
        // negatif veya 100'den buyuk deger girerse "Gecersiz not",
        // 85 ile 100 arasinda ise (sinirlar dahil) AA
        // 65(dahil) buyuk ve 85'den kucukse BB
        // 50(dahil) buyuk ve 65'den kucukse CC
        // 50'den kucukse DD Kaldin Yazdirin

        /*  IF
        ELSE IF
        ELSE IF
        ,,,,
        ,,

        ELSE
        SEKLINDE YAZILAN BIR KOD ICIN

        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Notunuzu Giriniz");


        double not=scanner.nextDouble();

        if (not<0 || not>100) {
            System.out.println("Gecersiz Not");
        }else if (not>=85){

            System.out.println("Notunuz AA");

        } else if (not>=65){
            System.out.println("Notunuz BB");

        } else if (not>=50) {
            System.out.println("Notunuz cc");

        }else
            System.out.println("Notunuz DD,Maalesef Kaldin");

        }







        }




