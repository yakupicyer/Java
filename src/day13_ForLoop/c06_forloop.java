package day13_ForLoop;

import java.util.Scanner;

public class c06_forloop {
    public static void main(String[] args) {



       /* Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        Bitis degeri baslangic degerinden kucuk olsa da program calissin
        */


        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen baslangic ve bitis degeri icin pozitif tamayilar giriniz");


        int baslangic= scanner.nextInt();
        int bitis= scanner.nextInt();
        int toplam=0;

        if (baslangic<bitis){

            for (int i = baslangic; i <= bitis; i++) {
                toplam+=i;
            }

        }else {
            for (int i = bitis; i <= baslangic; i++) {
                toplam+=i;

            }


        }
        System.out.println("Girilen sayilarin arasindaki tüm sayilarin toplami:"+toplam);

    }
}
