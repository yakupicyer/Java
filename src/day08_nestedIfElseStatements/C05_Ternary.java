package day08_nestedIfElseStatements;

public class C05_Ternary {
    public static void main(String[] args) {

        // INPUT OLARAK VERILEN BIR TAMSAYI ICIN POZITIF VEYA POZITIF DEGIL YAZDIRIN
        //CIFT SAYI ISE 2 KATINA CIKARTIN



        int Input=56;
        if (Input>0){

            System.out.println("sayi pozitif");

        }else{

            System.out.println("SAYI POZITIF DEGIL");

        }


        System.out.println(Input>0?"SAYI POZITIF":"SAYI POZITIF DEGIL");




        if (Input%2==0){
            Input*=2;

        }else{
            Input+=10;

        }


    }
}
