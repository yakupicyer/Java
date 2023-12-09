package day04_wrapperClasses_Increment;

public class c05_preIncrement_postincrement {
    public static void main(String[] args) {
        int a=10;
        a++;
        System.out.println("a nin 11 satirdaki degeri:"+a);

         a=10;
         ++a;
        System.out.println("anin 19s SATIRDAKI DEGERI:"+a);

        int b=10;
        System.out.println("++b yazdigimda konsolda yazdirilan : " + ++b);
        //
        System.out.println("++b den 1 satir sonra konsola b degeri:" +b);


        int c=10;

        System.out.println("c++ yazdigimda konsolda yazdirilan:" + c++);
        //
        System.out.println("c++ den 1 satir sonra konsola b degeri:" +c);

        int x=10;
        int y=x++;
        System.out.println("x:"+x+",y:"+y);
    }





}
