package day06_ifElseStatement;

import java.util.Scanner;

public class c03_if_statemens {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir sayi isteyin,
        //        sayiyi kontrol edip 5 ile bolunebiliyorsa
        //        “Sayi 5’in tam kati” yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("LUTFEN BIR TAM SAYI GIRINIZ");

        int sayi= scanner.nextInt();

        if (sayi%5==0){
            System.out.println("sayi 5 in kati");

        }
        if (sayi%3==0){
            System.out.println("sayi 3 in kati");


        }
    }
}
