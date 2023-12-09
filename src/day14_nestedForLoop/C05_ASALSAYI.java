package day14_nestedForLoop;

import java.util.Scanner;

public class C05_ASALSAYI {
    public static void main(String[] args) {

        /*


        Soru 11- Kullanicidan pozitif bir tamsayi isteyip,
        sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.


 */
        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen Pozitif bir tamsayi giriniz");

        int sayi = scanner.nextInt();

        int flag=10;

        for (int i = 2; i <sayi ; i++) {

            if (sayi%i==0){
                flag++;
                break;
            }

        }
        if (flag==10){
            System.out.println("Girilen sayi asal");
        }else{
            System.out.println("Girilen sayi asal degil");

        }



    }

}
