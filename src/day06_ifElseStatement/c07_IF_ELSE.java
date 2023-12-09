package day06_ifElseStatement;

import java.util.Scanner;

public class c07_IF_ELSE {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("LUTFEN UCGENIN KENAR UZUNLUKLARINI GIRIN");

        Double kenar1=scanner.nextDouble();
        Double kenar2=scanner.nextDouble();
        Double kenar3=scanner.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0){
            System.out.println("ESKENAR UCGEN");
        } else {
            System.out.println("ESKENAR UCGEN DEGIL");

        }























    }
}
