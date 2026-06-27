package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashSet;
import java.util.List;

public class Q28_Check_if_Two_Sets_are_Equal {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet(List.of(1,2,3));
        HashSet<Integer>set2=new HashSet<>(List.of(1,3,2));

        System.out.println(set2.equals(set1));
    }
}
