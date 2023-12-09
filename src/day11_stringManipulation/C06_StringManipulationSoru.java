package day11_stringManipulation;

import java.util.Scanner;

public class C06_StringManipulationSoru {
    public static void main(String[] args) {

       /* Soru 1 : Kullanicidan bir cumle alin
        - cumlede ev geciyorsa, “home home sweet home” yazdirin
        - cumlede is geciyorsa, “calismak guzeldir”
        - ikisini de iceriyorsa “Hem ev lazim hem is”
        - hicbirini icermiyorsa “cok calisman lazim” yazdiri
        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfenn bir cümle giriniz");
        String cümle= scanner.nextLine();

        if (cümle.contains("ev")&&cümle.contains("is")){
            System.out.println("Hem ev lazim hem is");

        } else if (cümle.contains("ev")) {
            System.out.println("home home sweet home");

        } else if (cümle.contains("is")) {
            System.out.println("calismak güzeldir");

        }else{
            System.out.println("cak calismak lazim");
        }


    }

}
