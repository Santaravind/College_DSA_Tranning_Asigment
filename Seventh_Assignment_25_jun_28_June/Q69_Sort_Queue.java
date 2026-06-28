package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q69_Sort_Queue {
    public static void main(String[] args) {
        Queue<Integer>queue=new ArrayDeque(List.of(5,3,4,2,1));


        Queue<Integer>stream=queue.stream()
                .sorted()
                .collect(Collectors.toCollection(ArrayDeque::new));
        
        System.out.println(stream);
    }
}
