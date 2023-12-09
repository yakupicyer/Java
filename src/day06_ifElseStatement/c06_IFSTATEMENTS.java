package day06_ifElseStatement;

import java.util.Scanner;

public class c06_IFSTATEMENTS {
    public static void main(String[] args) {

        //Kullanicidan bir ucgenin 3 kenarini alin ucgen eskenar ise "eskenar ucgen" yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("LUTFEN UCGENIN KENAR UZUNLUKLARINI GIRIN");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3)
        {System.out.println("girilen degerler eskenar ucgen olusturur");


        }





    }


}


