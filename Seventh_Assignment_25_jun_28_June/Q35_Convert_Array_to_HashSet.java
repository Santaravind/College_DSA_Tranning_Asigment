package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashSet;
import java.util.List;

public class Q35_Convert_Array_to_HashSet {
    public static void main(String[] args) {
        String st[]={"apple", "banana", "apple", "orange"};
        HashSet<String>set=new HashSet(List.of(st));

        System.out.println(set);

//        oR

         HashSet<String>set1=new HashSet<>();
         for (String v:st){
             set1.add(v);
         }
        System.out.println(set1);
    }
}
