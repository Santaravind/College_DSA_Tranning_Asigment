package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q76_Find_Kth_Largest_Element {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(List.of(3, 2, 1, 5, 6, 4));
        int k=2;
        Collections.sort(list,(a,b)->b-a);
        System.out.println("Kth Largest Element is : "+ list.get(k-1));
    }
}
