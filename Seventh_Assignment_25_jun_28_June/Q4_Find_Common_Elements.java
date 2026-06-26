package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q4_Find_Common_Elements {
    public static void main(String[] args) {
        ArrayList<String>list1=new ArrayList<>(List.of("apple", "banana", "orange", "grape"));
        ArrayList<String>list2=new ArrayList<>(List.of("banana", "kiwi", "apple", "melon"));

        HashSet<String>set=new HashSet<>();
        HashSet<String>set2=new HashSet<>();
        for (String s :list1){
            set.add(s);
        }
        for (String s :list2){
            if(!set.add(s)){
                set2.add(s);
            }
        }

        System.out.println("Common Element in list1 and list2 : "+set2);
    }
}
