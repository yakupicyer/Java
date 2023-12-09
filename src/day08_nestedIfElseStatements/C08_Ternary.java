package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin,
        //        degilse “Eskenar degil” yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen Ucgenin Kenar Uzunluklarini Giriniz");

        double Kenar1= scanner.nextDouble();
        double Kenar2= scanner.nextDouble();
        double Kenar3= scanner.nextDouble();

        System.out.println(Kenar1==Kenar2 && Kenar1==Kenar3 && Kenar1>0?"UCGEN ESKENAR":"UCGEN ESKENAR DEGIL");

    }
}
