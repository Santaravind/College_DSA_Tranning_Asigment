package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Q16_Reverse_a_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>(List.of(1, 2, 3, 4, 5));

        //using function
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(list.get(list.size()-1));

        

    }
}
