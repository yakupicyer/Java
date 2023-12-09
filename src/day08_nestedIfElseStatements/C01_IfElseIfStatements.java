package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {


    public static void main(String[] args) {


        // Kullanicidan aldigi urun adedi ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin


        Scanner scanner=new Scanner(System.in);
        System.out.println(" Satin aldiginiz urun adedini giriniz ");

        int urunadeti=scanner.nextInt();

        System.out.println(" Satin aldiginiz urunUNN INDIRIMSIZ fiyatini giriniz ");
        double indirimsizFiyat=scanner.nextDouble();

        System.out.println(" Mustari kartiniz varmi E:Evet,H:Hayir ");

        char KartVarmi=scanner.next().toUpperCase().charAt(0);
        double indirimsiztoplamsatisfiyati=urunadeti*indirimsizFiyat;


        if (KartVarmi=='E'&&urunadeti>10){


            System.out.println("%20 INDIRIMLI TOPLAM FIYAT:"+indirimsiztoplamsatisfiyati*80/100);

        } else if (KartVarmi=='E'&&urunadeti<=10) {
            System.out.println("%15 INDIRIMLI TOPLAM FIYAT:"+indirimsiztoplamsatisfiyati*85/100);



        } else if (KartVarmi=='H'&&urunadeti>10) {
            System.out.println("%15 INDIRIMLI TOPLAM FIYAT:"+indirimsiztoplamsatisfiyati*85/100);

        } else if (KartVarmi=='H'&&urunadeti<=10) {
            System.out.println("%10 INDIRIMLI TOPLAM FIYAT:"+indirimsiztoplamsatisfiyati*90/100);


        }else{

            System.out.println("Girilen degerlerde bir hata var");
        }


    }
}
