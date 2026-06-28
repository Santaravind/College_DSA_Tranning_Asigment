package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.Arrays;
import java.util.Collections;

public class Q78_Sort_Strings_by_Length {
    public static void main(String[] args) {
        String st[]={"apple", "banana", "kiwi", "orange"};
        Arrays.sort(st,(a,b)->a.length()-b.length());
        for (String s:st) {
            System.out.println(s);
        }

    }
}
