package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q68_Reverse_First_K_Elements_of_Queue {
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList(List.of(1,2,3,4,5,6));
        int k=3;
        int j=0;
        System.out.println(queue);
        //remove first k element 
        while (j<k&&!queue.isEmpty()){
            queue.poll();
            j++;
        }

        System.out.println(queue);

    }
}
