package day14_nestedForLoop;

import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Satir sayisini giriniz");

        int Satir = scanner.nextInt();
        for (int i = 1; i <=Satir ; i++) {
            for (int j = 1; j <=i; j++) {

                System.out.print( "*" );

            }
            System.out.println("");
        }

    }
}
