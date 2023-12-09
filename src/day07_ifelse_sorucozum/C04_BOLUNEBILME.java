package day07_ifelse_sorucozum;

import java.util.Scanner;

public class C04_BOLUNEBILME {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in) ;
        System.out.println("Lutfen pozitif bir tamsayi giriniz");



        int sayi= scanner.nextInt();

        if(sayi % 3==0 && sayi % 5==0) {
            System.out.println("SUPER SAYI");

        }else if (sayi%5==0){
            System.out.println("5'UN kATI");


        } else if (sayi%3==0){

            System.out.println("3'UN kATI");

        }


    }
}
