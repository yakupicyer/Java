package day15_MethodOlusturma;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {


        //Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        //Girilen sayinin pozitif tam bolenlerini yanyana yazdiran
        //bir method olusturun.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz");

        int sayi= scanner.nextInt();

        PozitifBölenleriYazdir(sayi);
        PozitifBölenleriYazdir(420);

        /*
            Method call'da kullanilan argument ile
            Method parametreleri uyumlu OLMALIDIR
            eger argument ve parametreler uyumlu olmazsa CTE olusur
            kod calismaz
         */
    }



    public static void PozitifBölenleriYazdir(int sayi){

        for (int i = 1; i <=sayi; i++) {
            if (sayi%i==0){
                System.out.print(i+ " ");

            }

        }
    }
}
