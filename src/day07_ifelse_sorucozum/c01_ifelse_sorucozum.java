package day07_ifelse_sorucozum;

import java.util.Scanner;

public class c01_ifelse_sorucozum {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in)  ;
        System.out.println("");

        char Karakter= scanner.next().charAt(0);

        if (Karakter>='A' && Karakter<='Z'){


            System.out.println("Girilen Karakter buyuk harf");

        }else{
            System.out.println("Girilen Karakter buyuk harf degil");


        }
    }






    }
