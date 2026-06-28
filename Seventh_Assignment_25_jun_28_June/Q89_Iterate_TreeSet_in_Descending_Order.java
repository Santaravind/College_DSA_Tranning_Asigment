package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Q89_Iterate_TreeSet_in_Descending_Order {
    public static void main(String[] args) {
        TreeSet<Integer>treeSet=new TreeSet(Collections.reverseOrder());
       treeSet.add(1);
       treeSet.add(2);
       treeSet.add(3);
       treeSet.add(4);
       treeSet.add(5);
        System.out.println(treeSet);
    }
}
