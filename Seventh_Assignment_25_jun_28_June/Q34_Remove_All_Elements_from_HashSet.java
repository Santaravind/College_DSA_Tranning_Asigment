package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashSet;
import java.util.List;

public class Q34_Remove_All_Elements_from_HashSet {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet(List.of(1,34,5,6,7));

        System.out.println(set);
        set.clear();
        System.out.println(set);

    }
}
