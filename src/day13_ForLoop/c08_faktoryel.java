package day13_ForLoop;

import java.util.Scanner;

public class c08_faktoryel {
    public static void main(String[] args) {

        /*
        Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.
        Konsolda faktoryel hesabinin yapilisini da yazdirin.

        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

         */

        Scanner scanner= new Scanner(System.in);

        System.out.println("lütfen 20 den kucuk bir pozitif tamsayilar giriniz");

        int sayi= scanner.nextInt();

        long faktoryel=1;

        System.out.print(sayi +"! = ");// 6!=

        for (int i = sayi; i >=1 ; i--) {//6 5 4 3 2 1
            faktoryel*=i;

            if (i!=1){
                System.out.print(i+" * ");//6*5*4*3*2*1
            }else{
                System.out.print(i+" = ");//6*5*4*3*2*1=
            }

        }

        System.out.print(faktoryel);
    }
}
