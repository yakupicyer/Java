package day17_WileLoopveDoawhileLoop;

import java.util.Scanner;

public class c01_whileloop {
    public static void main(String[] args) {

        /*



        KULLANICIDAN
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("lÜTFEN BASLANGIC VE BITIS DEGERLERI OLARAK 2 TAMSSYI GIRINIZ");

        int baslangic= scanner.nextInt();
        int bitis=scanner.nextInt();

        int sayi=baslangic;
        int toplam=0;
        while (sayi<=bitis){
            toplam+=sayi;
        sayi++;
    }


        System.out.println("TOPLAM:"+toplam);

    }
}
