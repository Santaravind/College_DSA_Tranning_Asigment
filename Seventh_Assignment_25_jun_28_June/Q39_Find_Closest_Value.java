package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.List;
import java.util.TreeSet;

public class Q39_Find_Closest_Value {
    public static void main(String[] args){
        TreeSet<Integer>set =new TreeSet<>(List.of(12,30,45,65,76,90));
        int target=27;
//      int n=set.floor(target);
//      int m=set.ceiling(target);

    int closer=(target-set.floor(target))<(set.ceiling(target)-target)?set.floor(target):set.ceiling(target);
        System.out.println("Closet value to target : " + closer);
    }
}
