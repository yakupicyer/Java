package day07_ifelse_sorucozum;

import java.util.Scanner;

public class C05_BIRIMCEVIRME {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan mesafeyi kilometre olarak alin
        //        ve cevirmek istedigi birimi sorun,
        //        istedigi birim metre veya santimetre ise cevirip yazdirin,
        //        yoksa “istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen mesafeyi kilometre olarak girin");

        double mesafeKm= scanner.nextDouble();
        System.out.println("Lutfen cevirmek istediginiz birirmi giriniz");
        String birim=scanner.next();

        if (birim.equalsIgnoreCase("metre")){

            System.out.println("Girilrn mesafenin metre cinsinden degeri:"+mesafeKm*1000);

        }else if (birim.equalsIgnoreCase("santimetre")){

            System.out.println("Girilrn mesafenin santimetre cinsinden degeri:"+mesafeKm*10000);

        }else{

            System.out.println("sadece metre ve santimetreye ceviririm \n");
        }

    }
}
