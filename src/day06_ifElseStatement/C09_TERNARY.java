package day06_ifElseStatement;

import java.util.Scanner;

public class C09_TERNARY {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen 2 sayi Giriniz");

        double Sayi1= scanner.nextDouble();
        double Sayi2= scanner.nextDouble();
        System.out.println(Sayi1>Sayi2?""+Sayi2:Sayi1);








    }
}
