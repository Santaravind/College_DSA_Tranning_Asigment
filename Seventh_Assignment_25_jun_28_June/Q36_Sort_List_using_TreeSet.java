package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Q36_Sort_List_using_TreeSet {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList(List.of(2,4,5,3,1,7,8,7,9));


        TreeSet<Integer>set=new TreeSet<>();
        for (int n:list){
            set.add(n);
        }

        System.out.println("Sorted list : " +set);




    }
}
