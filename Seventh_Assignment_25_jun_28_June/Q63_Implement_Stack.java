package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Q63_Implement_Stack {
    public static void main(String[] args) {
        Deque<Integer>stack=new LinkedList<>();

        stack.addFirst(1);
        stack.addFirst(2);
        stack.addFirst(3);
        stack.addFirst(18);
        stack.addFirst(14);

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
