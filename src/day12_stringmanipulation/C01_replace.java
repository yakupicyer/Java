package day12_stringmanipulation;

public class C01_replace {
    public static void main(String[] args) {


       // String Str="Hava Candir";
       // Str.replace("H","J");
       // System.out.println(Str);

       // Str=Str.replace("Hava","Java").replace(".","");
       // System.out.println(Str);


       // System.out.println(Str.replaceFirst("a","A"));
       // System.out.println(Str.replace('a','A'));


       // System.out.println(Str.replace(" ",""));

       // Str ="Ali uzunkavaklaraltindayataruyumazoglu";
       // System.out.println(Str.replace('u', 'U'));



        String str = "Hava Candir.";
        System.out.println(str.replace("H", "J")); // Java Candir.
        System.out.println(str); // Hava Candir.

        str = str.replace("Hava","Java").replace(".","");
        System.out.println(str); // Java Candir
        System.out.println(str.replaceFirst("a", "A")); // JAva Candir
        System.out.println(str.replace('a', 'A')); // JAvA CAndir

        // boslugu yok edelim
        System.out.println(str.replace(" ", "")); // JavaCandir

        str = "Ali uzunkavaklaraltindayataruyumazoglu";
        System.out.println(str.replace('u', 'U')); // Ali UzUnkavaklaraltindayatarUyUmazoglU
        System.out.println(str.replace("l", "XYZ")); // AXYZi uzunkavakXYZaraXYZtindayataruyumazogXYZu


    }

}
