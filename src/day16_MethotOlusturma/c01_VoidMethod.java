package day16_MethotOlusturma;

public class c01_VoidMethod {
    public static void main(String[] args) {



        /*
        INPUT OLARAK VERILEN ISIM SOYISIM VE KREDI KARTI BILGILERINI
        ASAGIDAKI FORMATTA YAZDIRAN BIR METHOD OLUSTURUN
        ISISM:Yak** Icy**
        KART NO:**** **** **** 1234


         */

    }

    public static void hesapBilgileriYazdir(String isim,String soyisim,String KrediKartiNo){


        System.out.println(

                "isim:"+isim.substring(0,1).toUpperCase()+
                        isim.substring(1,3).toLowerCase()+isim.substring(3).replaceAll("\\w","*")
                +
                        "\nkart no:"+
                        "**** **** ****"+KrediKartiNo.substring(KrediKartiNo.length()-4)

        );
    }
}
