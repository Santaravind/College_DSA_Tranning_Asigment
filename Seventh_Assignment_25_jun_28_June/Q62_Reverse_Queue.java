package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Q62_Reverse_Queue {
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>(List.of(1, 2, 3, 4, 5));

        Stack<Integer> stack = new Stack<>();


        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }


        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        System.out.println(queue);
    }
}
