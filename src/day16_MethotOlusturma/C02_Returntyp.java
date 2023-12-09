package day16_MethotOlusturma;

public class C02_Returntyp {
    public static void main(String[] args) {

        //VERILEN ISIM VE SOYISMI
        //ISTENEN FORMATA CEVIRIP BIZE DÖNDÜREN BIR METHOD OLUSTURN
        //ORNEK OUTPUT:Y****** I********


        System.out.println(ISMIISTENENFORMATACEVIR("YAKUP SERDAR", "icyer"));


    }

    public static String ISMIISTENENFORMATACEVIR(String isim,String soyisim){

        String dönusmusIsim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\w","*")+
                " "+
                soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\w","*");

        return dönusmusIsim;


    }

}
