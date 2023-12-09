package day11_stringManipulation;

import java.util.Scanner;

public class c03_indexOfSoru {
    public static void main(String[] args) {


        // Kullanicidan bir cumle ve cumlede aranacak metin isteyin
        // cumle ve metni karsilastirip
        // asagidaki 3 durumdan birini yazdirin
        // 1- verilen metin cumlede kullanilmamis
        // 2- verilen metin cumlede sadece 1 kere kullanilmis
        // 3- verilen metin cumlede 1'den fazla kere kullanilmis


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir cümle yaziniz");
        String cümle=scanner.nextLine();

        System.out.println("Lütfen cümlede aranacak metni giriniz");
        String metin=scanner.nextLine();

        if (!cümle.contains(metin)){
            System.out.println("Verilen metin cümlede kullanilmamis");
        } else if (cümle.indexOf(metin)==cümle.lastIndexOf(metin)) {
            System.out.println("Verilen metin cümlede sadece 1 kere kullanilmis");
        }else{
            System.out.println("verilen metin cümlede 1'den fazla kere kullanilmis");
        }
    }
}
