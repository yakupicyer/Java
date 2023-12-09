package day13_ForLoop;

public class C02_FORLOOP {
    public static void main(String[] args) {


        // 60 VE 23 DAHIL OLMAK UZERE 7 ILE BOLUNEBILEN SAYILARI 60 DAN GERIYE DOGRU YAZDIRIN.


        for (int i = 60; i >=23 ; i--) {

            if (i%7==0){

                System.out.println(i+" ");
            }

        }

        System.out.print(" ");

      // 3 BASAMAKLI POZITIF TÜM TAMSAYILARI TOPLAYIP SONUCU YAZDIRIN

        int toplam=0;

        for (int i =100; i <1000 ; i++) {

            toplam+=i;
        }

        System.out.println("SAYILARIN TOPLAMI:"+toplam);


        //-1000 ILE +1000 ARASINDA TUM TAMSAYILARI TOPLAYIN



        toplam=0;
        for (int i = -1000; i <=1000 ; i++) {

            toplam+=i;

        }
        System.out.println("-1000 ILE +1000 SAYI TOPLAMI:"+toplam);

    }
}
