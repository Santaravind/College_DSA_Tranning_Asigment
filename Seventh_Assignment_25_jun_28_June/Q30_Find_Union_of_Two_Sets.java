package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashSet;
import java.util.List;

public class Q30_Find_Union_of_Two_Sets {
    public static void main(String[] args) {
        HashSet<Integer>set1=new HashSet<>(List.of(1,23,4,6,5,7,88,9));
        HashSet<Integer>set2 =new HashSet(List.of(1,3,7,8,9,0));

        for (int v: set1){
            set2.add(v);
        }

        System.out.println("Union of two sets : " + set2);
    }
}
