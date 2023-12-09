package day25_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class C01_Objeler {
    public static void main(String[] args) {

        String str = new String("Java Candir");
        System.out.println(str.toUpperCase()); // JAVA CANDIR
        /*
            Burada esitligin sol tarafinda bulunan String  ==> kendisi bir class'dir
                    ==> str icin dusunursek String str'in olusturuldugu class
                        yani diger adiyla str'in data turudur.
            str String class'indan olusturulan bir obje(tum non primitive'lerin ortak adi)dir
            ve str String class'indaki tum ozelliklere (method'lar ve variable'lari) sahiptir
         */



        int arr[]=new int[5];
        ArrayList<Integer>list=new ArrayList<Integer>();
        for (int i = 1; i <= arr.length; i++) {
            list.add(i);

        }
        System.out.println(list);


    }
}
