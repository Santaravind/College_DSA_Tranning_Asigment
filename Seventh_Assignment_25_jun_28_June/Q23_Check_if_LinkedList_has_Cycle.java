package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Q23_Check_if_LinkedList_has_Cycle {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>(List.of(1,2,3,4,5,2));
        HashSet<Integer>set=new HashSet<>();
        for (int v:list){

            if (set.contains(v)){
                System.out.println("Linked List has a cycle !!! "+ true);
                break;
            }
            set.add(v);
        }

    }
}
