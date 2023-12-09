package day12_stringmanipulation;

public class C04_Trim {
    public static void main(String[] args) {



        String str="      ALI    TOPA    VUR      ";


        str=str.trim();

        str=str.replaceAll("\\s+","");


        System.out.println(str);
    }
}
