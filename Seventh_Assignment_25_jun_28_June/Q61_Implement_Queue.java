package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Q61_Implement_Queue {
    public static void main(String[] args) {
        Queue<Integer>queue= new ArrayDeque<>();

        queue.add(2);
        queue.add(8);
        queue.add(5);
        queue.add(4);
        queue.add(3);

        System.out.println("removed element : " +queue.remove());
        System.out.println("Peek element : "+ queue.peek());

    }
}
