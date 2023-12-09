package day14_nestedForLoop;

import java.util.Scanner;

public class C08_Nesteforloop {
    public static void main(String[] args) {
        /*
           Kullanicidan satir ve sutun sayisini alip
           asagidaki sekilde tablo olusturun


           *****
           *****
           *****


         */


        Scanner scanner= new Scanner(System.in);

        System.out.println("Satir sayisini giriniz");
        int Satir=scanner.nextInt();

        System.out.println(" HER Satirda kac yildizolacagini  giriniz");
        int Sütun=scanner.nextInt();

        for (int i = 1; i <=Satir; i++) {//SATIRLARI

            for (int j = 1; j <=Sütun ; j++) {//STUNLARI
                System.out.print("* ");

            }
            System.out.println(" ");
        }
    }
}
