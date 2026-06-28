package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q77_Find_Kth_Smallest_Element {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(List.of(3, 2, 1, 5, 6, 4));
        int k=3;
        Collections.sort(list);
        System.out.println("Kth Smallest Element is : "+ list.get(k-1));

    }
}
