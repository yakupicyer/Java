package day17_WileLoopveDoawhileLoop;

import java.util.Scanner;

public class c02_kullanicidanakalinansayilaritopla {
    public static void main(String[] args) {



        // kullanicidan toplanmak uzere sayilar alin
        // toplam 500'u gecerse
        // "Bu kadar sayi yeter, ... adet sayi girdiniz ve toplami ... oldu" yazdirin
        // ve islemi bitirin


        Scanner scanner = new Scanner(System.in);
        double sayi = 0;
        double toplam = 0;
        int sayac=0;
        while (toplam <=500){
            System.out.println("Lutfen toplanmak uzere sayi giriniz");
            sayi = scanner.nextDouble();
            sayac++;
            toplam += sayi;
        }
        System.out.println("Bu kadar sayi yeter, " + sayac + " adet sayi girdiniz ve toplami "+toplam);


    }
}
