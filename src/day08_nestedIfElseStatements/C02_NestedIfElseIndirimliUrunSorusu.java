package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C02_NestedIfElseIndirimliUrunSorusu {
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

       int indirimOrani=0;


/* iF else ile soru cozerken degisken sayisi 1 den fazla ise ic ice if else cumlelerini kull.
ONCE DEGISKENLERDEN BIRISINI ASIL DEGISKEN SECIP YAPIYI ONA GORE KURALIM
BU CLASS DA MUSTERI KARTI ASIL DEGISKEN OLSUN

 */

        if (KartVarmi=='E'){
            if (urunadeti>10){
                indirimOrani=20;

            }else if (urunadeti>0){
                indirimOrani=15;

            }else{
                System.out.println("kART BILGISI HATALI");
            }


        } else if (KartVarmi=='H') {

            if (urunadeti>10){
                indirimOrani=15;
            } else if (urunadeti>0) {

            }else{

                System.out.println("Urun biktari HATALI");
            }

        }else{

            System.out.println("kART BILGISI HATALI");
        }
        if (indirimOrani>0){

                System.out.println(indirimOrani+"indirimli toplam fiyat:"+indirimsizFiyat*urunadeti*(100-indirimOrani));
        }


    }
}
