package day09_Switchstatements;

import java.util.Scanner;

public class C04_ikiBasamakliSayYazdirma {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan 2 basamakli bir sayi alip,
        //        girilen sayiyi yazi ile yazdirin
        //  34 ==> 3 otuz, 4 dort


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen iki basamakli bir sayi GIRIN");

        int girilensayi=scanner.nextInt();

        int birlerbasamagi=girilensayi%10;
        int onlarbasamagi=girilensayi/10;


        switch  (onlarbasamagi) {
            case 1:
                System.out.println("ON");
                break;
            case 2:
                System.out.println("YIRMI");
                break;
            case 3:
                System.out.println("OTUZ");

                break;
            case 4:
                System.out.println("KIRK");
                break;
            case 5:
                System.out.println("ELLI");
                break;
            case 6:
                System.out.println("ALTMIS");
                break;
            case 7:
                System.out.println("YETMIS");
                break;
            case 8:
                System.out.println("SEKSEN");
                break;
            case 9:
                System.out.println("DOKSAN");
                break;
        }

            switch (birlerbasamagi) {
                case 0:
                    break;

                case 1:
                    System.out.println("BIR");
                    break;
                case 2:
                    System.out.println("IKI");
                    break;
                case 3:
                    System.out.println("UC");

                    break;
                case 4:
                    System.out.println("DORT");
                    break;
                case 5:
                    System.out.println("BES");
                    break;
                case 6:
                    System.out.println("ALTI");
                    break;
                case 7:
                    System.out.println("YEDI");
                    break;
                case 8:
                    System.out.println("SEKIZ");
                    break;
                case 9:
                    System.out.println("DOKUZ");
                    break;

            }








        }


    }

