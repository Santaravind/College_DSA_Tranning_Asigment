package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.List;
import java.util.TreeSet;

public class Q37_Find_First_and_Last_Element {
    public static void main(String[] args) {
        TreeSet<Integer>treeSet=new TreeSet(List.of(10,20,30,40,50));

        System.out.println("First element : " + treeSet.first());
        System.out.println("Last element : " + treeSet.last());
    }
}
