package day12_stringmanipulation;

public class C05_stringManipulations {
    public static void main(String[] args) {


        /*Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
                input1 : “15.30 €” , input2 : “11.40 €”
        output : 26.70 €

         */

        String fiyat1="15,35";
        String fiyat2="15,35";

        fiyat1=fiyat1.replaceAll("\\D","");
        fiyat2=fiyat2.replaceAll("\\D","");



    }
}
