package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashSet;
import java.util.List;

public class Q29_Find_Intersection_of_Two_Sets {
    public static void main(String[] args) {
        HashSet<Integer>set1=new HashSet<>(List.of(1,23,4,6,5,7,88,9));
        HashSet<Integer>set2 =new HashSet(List.of(1,3,7,8,9,0));

        HashSet<Integer>result=new HashSet<>();

        for (int v: set1){
            if (set2.contains(v)){
                result.add(v);
            }
        }

        System.out.println("Intersection of sets : "+result);


    }
}
