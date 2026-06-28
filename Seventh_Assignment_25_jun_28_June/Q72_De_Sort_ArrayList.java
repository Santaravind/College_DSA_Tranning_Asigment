package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q72_De_Sort_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList(List.of(5, 2, 8, 1, 9));
        System.out.println(list);
        Collections.sort(list,(a,b)->b-a);
        System.out.println("Sorted in reverse order list :" + list);

    }
}
