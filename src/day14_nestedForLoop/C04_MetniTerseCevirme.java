package day14_nestedForLoop;

import java.util.Scanner;

public class C04_MetniTerseCevirme {
    public static void main(String[] args) {

        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scanner= new Scanner(System.in);

        System.out.println("lütfen pozitif bir tamsayilar giriniz");

         String metin= scanner.nextLine();

        for (int i = metin.length()-1; i >=0 ; i--) {
            System.out.print(metin.charAt(i));

        }



    }

    public static class c05 {
        public static void main(String[] args) {


            /*
            Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
             */
            Scanner scanner= new Scanner(System.in);

            System.out.println("lütfen BIR METIN giriniz");

            String Metin= scanner.nextLine();
            String tersmetin="";

            for (int i = Metin.length()-1; i >=0; i--) {
                tersmetin+=Metin.charAt(i);


            }
            System.out.println(tersmetin);



            if (Metin.equalsIgnoreCase(tersmetin)){

                System.out.println("Girilen metin palindrome");

            }else{
                System.out.println("Girilen metin palindrome degil");
            }





        }
    }
}
