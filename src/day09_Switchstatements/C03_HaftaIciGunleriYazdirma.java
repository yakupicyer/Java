package day09_Switchstatements;

import java.util.Scanner;

public class C03_HaftaIciGunleriYazdirma {
    public static void main(String[] args) {


         // Kullanicidan gun ismini isteyin
        // girilen gunun hafta ici veya hafta sonu oldugunu yazdirin



        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen gun ismini giriniz");

        String GünIsmi=scanner.next().toLowerCase();

        switch (GünIsmi) {

            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("HaftaSONU");
            default:
                System.out.println("Gun ismi yanlis");
        }




















    }
}
