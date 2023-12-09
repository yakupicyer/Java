package day10_Stringmanipulation;

public class C02_equals {
    public static void main(String[] args) {

        String str1="Ahmet";
        String str2="AHMET";
        String str3="ahmet";
        String str4="AhMeT";
        String str5="Ahmet";
        String str6=new String("Ahmet");
        String str7="Ah";
        String str8="met";
        String str9=str7+str8;

        // == HEM METIN DEGERINE HEM DE REFERANSA BAKTIGI ICIN METNI AYNI OLAN FARKLI Strring ler icin farkli sonuclar verebilir

        // 1- String case sensitive'dir,
        // str1,str2,str3 ve str4'un degerleri birbirinden farklidir
        // str1, str5, str6 ve str9 'un degerleri ise aynidir
        // String'de karsilastirma icin == kullanirsaniz
        // metni ayni olan String'lerde bile false donebilir
        // == hem metin degerine hem de referansa baktigi icin
        // metni ayni olan farkli String'ler icin farkli sonuclar verebilir

        System.out.println(str1==str5);  //Ahmet==Ahmet TRUE
        System.out.println(str1==str6);  //Ahmet==Ahmet false

        System.out.println(str1=="Ahmet");  //Ahmet==Ahmet TRUE
        System.out.println(str1==str9);  //Ahmet==Ahmet false

        // Iki String'in Metin olarak ayni olup olmadigini kontrol etmek icin
        // SIMDILIK == kullanmayacagiz
        // String'lerde metin olarak ayni olmayi kontrol icin
        // equals() kullanilir
        // equals() ayni metinler icin true doner

        System.out.println(str1.equals(str5)); // Ahmet == Ahmet true
        System.out.println(str1.equals(str5));
        System.out.println(str1.equals(str6));
        System.out.println(str1.equals("Ahmet"));
        System.out.println(str1.equals(str9));


        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str4));

        // Eger buyuk-kucuk harf farkli yazimlari da esit kabul edelim dersek


        System.out.println(str1.equalsIgnoreCase(str2));// CASE SENSITIV DEGILSE KULLAN
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));



    }
}
