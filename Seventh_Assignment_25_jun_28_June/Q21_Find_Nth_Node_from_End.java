package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.LinkedList;
import java.util.List;

public class Q21_Find_Nth_Node_from_End {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList(List.of(1,2,3,4,5));
        int nth=2;
        int n=list.size();

        System.out.println(list.get(list.size()-nth));
    }
}
