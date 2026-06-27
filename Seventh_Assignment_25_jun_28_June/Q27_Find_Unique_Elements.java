package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashSet;

public class Q27_Find_Unique_Elements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,5,4,3,2};
        HashSet<Integer> set=new HashSet<>();

        for (int v: arr){
            set.add(v);
        }

        System.out.println("Unique Elements : "+set);
    }
}
