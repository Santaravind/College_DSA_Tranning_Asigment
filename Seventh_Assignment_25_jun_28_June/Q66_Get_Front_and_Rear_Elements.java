package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.*;

public class Q66_Get_Front_and_Rear_Elements {
    public static void main(String[] args) {
        Deque<Integer>queue=new ArrayDeque<>(List.of(1, 2, 3, 4, 5));

        System.out.println("Front element : "+ queue.peekFirst());
        System.out.println("Rear Element : "+ queue.peekLast());


    }
}
