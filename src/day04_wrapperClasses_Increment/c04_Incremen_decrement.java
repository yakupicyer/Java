package day04_wrapperClasses_Increment;

import static java.lang.System.*;

public class c04_Incremen_decrement {
    public static void main(String[] args) {

        int a=10; //A nin degerini olusturacagimiz bir b variablina atayin sonra a nin degerini 1 artirin
        int b=a;
        a++;
        out.println("a:"+a+",b:"+b);

        a=10;

        //anin degerini artirin
        //sonra a nin degerini b ye atayin

        out.println("a nin degeri:"+a);

        a++;
        b=a;
        out.println("a:"+a+",b:"+b);


    }
}
