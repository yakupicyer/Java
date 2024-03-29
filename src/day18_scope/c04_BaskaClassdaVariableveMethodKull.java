package day18_scope;

public class c04_BaskaClassdaVariableveMethodKull {
    public static void main(String[] args) {


        // baska class'dan static class uyesi kullanmak icin
        // classIsmi.staticUyeIsmi yazmaniz yeterlidir
        System.out.println(C03_Scope_ClassVariableKull.s); // null
        System.out.println(C03_Scope_ClassVariableKull.a); // 0
        C03_Scope_ClassVariableKull.method1(); // static method calisti
        // static olmayan uyelere ulasmak icin ise
        // kullanmak istedigimiz class'dan obje olusturmaliyiz
        C03_Scope_ClassVariableKull obj = new C03_Scope_ClassVariableKull();
        System.out.println(obj.chr); // hiclik
        System.out.println(obj.bl); // false
        obj.method2(); // static olmayan method calisti
        // static olan bir class uyesine
        // static olmayan yolla ulasmak istersek
        // java kullanmamiza itiraz etmez
        // ama intelliJ bizi uyarir
        // Static member 'day18_scope.C03_Scope_ClassVariableKullanim.s' accessed via instance reference
        // static bir class uyesine, static olmayan yontemle ulasiyorsun
        System.out.println(obj.s); // null
        System.out.println(obj.a); // 0
        obj.method1(); // static method calisti
    }
}
