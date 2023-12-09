package day34_InheritanceConsCall;

public class C03_Child extends C02_Parent {
    C03_Child(){
        System.out.println("Child parametresiz constructor");
    }
    C03_Child(int sayi){
        System.out.println("Child int parametreli constructor");
    }
    C03_Child(String str){
        System.out.println("Child String parametreli constructor");
    }

}
