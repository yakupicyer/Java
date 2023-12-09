package day20_Arrays;

public class C05_CiftSayilariTopla {

    public static void main(String[] args) {


        // verilen int bir array'deki
        // cift sayilarin toplamini yazdirin

        int[] arr = {1,2,3,4,5,6,7,8,9,-8};
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                toplam += arr[i];
            }
        }
        System.out.println(toplam);
        }
    }



