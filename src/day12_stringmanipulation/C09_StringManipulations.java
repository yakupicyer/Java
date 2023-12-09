package day12_stringmanipulation;

import java.util.Scanner;

public class C09_StringManipulations {
    public static void main(String[] args) {

// kullanicidan isim, soyisim ve kredi karti numarasini alin
// gorunurIsim olarak A****** N****** seklinde
// sadece ilk harfler buyuk harf olarak gorunsun, diger harfler * olsun
// gorunur kart no : **** ****


        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen adinizi giriniz");
        String adiniz= scanner.nextLine();
        System.out.println("Lütfen soyadinizi giriniz");
        String soyadiniz= scanner.nextLine();

        System.out.println("Lütfen kart numarinizi  bosluksuz 16 karakter olarak giriniz");
        String kkNO=scanner.nextLine();

        String gorunurAd=adiniz.substring(0,1).toUpperCase()
                + adiniz.substring(1).replaceAll("\\w","*")
                +" "
                +soyadiniz.substring(0,1).toUpperCase()
                +soyadiniz.substring(1).replaceAll("\\S","*");
        String gorunurkartNO="**** **** **** "+kkNO.substring(kkNO.length()-4);

        System.out.println(gorunurAd);
        System.out.println(gorunurkartNO);

    }
}
