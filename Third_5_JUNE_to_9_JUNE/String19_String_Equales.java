package Assigment.Third_5_JUNE_to_9_JUNE;

import java.util.SplittableRandom;

public class String19_String_Equales {
    public static void main(String[] args) {
        String st="Arvind Sant";
        String s="Sant";
        String s2=new String("Arvind Sant");


        System.out.println("Compare reference of the string : "+(st==s2));
        System.out.println("Compare value of the string : "+(st.equals(s2)));
    }
}
