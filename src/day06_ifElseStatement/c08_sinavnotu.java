package day06_ifElseStatement;

import java.util.Scanner;

public class c08_sinavnotu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen sinavnotunuzu giriniz");

        double sinavnotu = scanner.nextDouble();

        if (sinavnotu >= 50) {

            System.out.println("SINIFI GECTIN");
        } else {
            System.out.println("MAALESF KALDIN");

        }
    }
}
