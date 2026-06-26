package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q20_Remove_Duplicates_from_LinkedList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(List.of(1, 2, 2, 3, 4, 4, 5));
        HashSet<Integer>set=new HashSet<>();
        for (int v:list){
            set.add(v);
        }

        System.out.println(set);


    }
}
