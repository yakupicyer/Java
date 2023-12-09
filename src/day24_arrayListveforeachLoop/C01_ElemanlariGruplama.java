package day24_arrayListveforeachLoop;




// Verilen bir int array'de
// elemantleri 3'erli gruplar halinde toplayip
// bu toplamlari bir liste olarak yazdirin



        /*
         for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
            sayac++;
            if (sayac == 3){
                toplamlarListesi.add(toplam);
                toplam =0;
                sayac = 0;
            }
        }
        System.out.println(toplamlarListesi);
         */
        /*
        int[] arr ={3,1,2,3,4,56,7,8,9,-7,-6,45,34,2,1};
        List<Integer> yeni = new ArrayList<>();
        for (int i = 0; i < arr.length; i+=3) {
            int toplam = 0;
            toplam= arr[i]+arr[i+1]+arr[i+2];
            yeni.add(toplam);
        }
        System.out.println(yeni);
         */

import java.util.ArrayList;
import java.util.List;
        public class C01_ElemanlariGruplama {
            public static void main(String[] args) {
                // Verilen bir int array'de
                // elemantleri 3'erli gruplar halinde toplayip
                // bu toplamlari bir liste olarak yazdirin
                int[] arr = {3,6,1,9,2,0,6,3,-1,-5,9,11,1,2,3,5,6,7};
                // output ==> [10, 11, 8, 15, 6, 18]
                List<Integer> toplamlarListesi = new ArrayList<>();
                int toplam=0;
                int sayac =1;
                for (int i = 0; i < arr.length ; i++) {
                    if (sayac == 3){
                        toplam += arr[i];
                        toplamlarListesi.add(toplam);
                        toplam = 0;
                        sayac =1;
                    }else{
                        toplam += arr[i];
                        sayac++;
                    }
                }
                System.out.println(toplamlarListesi);

    }
}
