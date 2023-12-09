package day16_MethotOlusturma;

public class c07_WileLoop {
    public static void main(String[] args) {

     // 1 DEN 20 YE KADAR OLAN SAYILARI TOPLAYIN



        int toplam=0;
        for (int i = 1; i <=20 ; i++) {
            toplam+=i;

        }
        System.out.println(toplam);

        toplam=0;
        int baslangic=1;
        while (baslangic<=20){

            toplam+=baslangic;
            baslangic++;
        }
        System.out.println(toplam);




    }
}
