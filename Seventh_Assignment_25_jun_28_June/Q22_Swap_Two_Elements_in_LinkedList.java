package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.LinkedList;
import java.util.List;

public class Q22_Swap_Two_Elements_in_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>(List.of(1,2,3,4,5,6));
        int index=1;
        int endId=4;
        int n=list.get(index);
        System.out.println("Before replacing : " + list);
        list.set(index, list.get(endId));
        list.set(endId, n);

        System.out.println("After replacing index and endId : " +list);
    }
}
