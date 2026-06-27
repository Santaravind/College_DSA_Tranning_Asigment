package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Q40_Find_Floor_and_Ceiling {
    public static void main(String[] args) {
        TreeSet<Integer>set=new TreeSet<>(List.of(10,20,30,40,50,60));
 int target=25;
        System.out.println("Floor value or target : "+ set.floor(target));
        System.out.println("Floor value or target : "+ set.ceiling(target));



    }
}
