package day05_Concatenation_operatorler;

import java.util.Scanner;

public class C03_And_Or {
    public static void main(String[] args) {
        //kULLANICIDAN NOT ISTEYIN GIRILEN NOT 0 ILE 100 ARASINDA ISE TRUE YOKSA FALSEY YAZDIRALIM

        Scanner scanner=new Scanner(System.in);
        System.out.println("LUTFEN NOTUNUZU GIRIN");


        int not= scanner.nextInt();
        System.out.println(not>=0 && not<=100);

        //not 50 den kucukse  ve 80 arasinda degilse true
        //arasinda ise false yazdirin

        System.out.println(not<50  );



    }
}
