package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.LinkedList;
import java.util.List;

public class Q18_Remove_First_and_Last_Element {
    public static void main(String[] args) {
        LinkedList<Integer>likend=new LinkedList(List.of(1,2,3,4,5));

        likend.removeFirst();
        likend.removeLast();
        System.out.println(likend);
    }
}
