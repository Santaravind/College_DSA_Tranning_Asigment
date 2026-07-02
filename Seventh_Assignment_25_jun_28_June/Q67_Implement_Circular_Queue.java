package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Q67_Implement_Circular_Queue {
    public static void main(String[] args) {
//        Deque<Integer>queue=new ArrayDeque<>();
//
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
        ArrayList<Integer>list=new ArrayList<>(  3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        list.set(0,list.removeLast());
        System.out.println(list);
//        list.add(5);
//        list.add(8);
//        System.out.println(list);

    }
}
