package day14_nestedForLoop;

import java.util.Scanner;

public class c03_StringTerstenYazdirma {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayilar giriniz");

        String metin= scanner.nextLine();//Java Candir
        for (int i = metin.length()-1; i>=0; i--) {
            System.out.print(metin.charAt(i));

        }



    }
}
