package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Q31_Find_Difference_Between_Two_Sets {
    public static void main(String[] args) {
        HashSet<Integer>set1=new HashSet<>(List.of(1,2,3,4,5));
        HashSet<Integer>set2=new HashSet<>(List.of(3,4,5,6));

       Iterator<Integer>it= set2.iterator();
       while (it.hasNext()){
           set1.remove(it.next());
       }

        System.out.println(set1);
    }
}
