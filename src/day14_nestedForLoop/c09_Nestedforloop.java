package day14_nestedForLoop;

import java.util.Scanner;

public class c09_Nestedforloop {
    public static void main(String[] args) {
        /*1
          12
          123
          1234
          12345
         */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Satir sayisini giriniz");
        int Satir = scanner.nextInt();

        for (int i = 1; i <=Satir ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");

            }
            System.out.println("");
        }


    }
}
