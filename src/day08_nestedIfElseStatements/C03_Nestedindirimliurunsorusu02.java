package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C03_Nestedindirimliurunsorusu02 {
    public static void main(String[] args) {


        // Kullanicidan aldigi urun adedi ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin


        Scanner scanner=new Scanner(System.in);
        System.out.println(" Satin aldiginiz urun adedini giriniz ");

        int urunadedi=scanner.nextInt();

        System.out.println(" Satin aldiginiz urunUNN INDIRIMSIZ fiyatini giriniz ");
        double indirimsizFiyat=scanner.nextDouble();

        System.out.println(" Mustari kartiniz varmi E:Evet,H:Hayir ");

        char KartVarmi=scanner.next().toUpperCase().charAt(0);

        int indirimOrani=0;


       if (urunadedi>10){
       if (KartVarmi=='E'){
        indirimOrani=20;
       } else if (KartVarmi=='H') {
        indirimOrani=15;

      }


      } else if (urunadedi>0) {

      if (KartVarmi=='E'){

        indirimOrani=15;
      }else if (KartVarmi=='H'){
        indirimOrani=10;

      }else{

        System.out.println("Kart bilgisi hatali");
       }



      }else {
        System.out.println("Urun miktari hatali");

       }
        System.out.println(indirimOrani+"indirimli toplam fiyat:"+urunadedi*indirimsizFiyat*(100-indirimOrani)/100);










    }
}
