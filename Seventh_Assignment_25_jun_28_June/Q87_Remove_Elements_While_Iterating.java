package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q87_Remove_Elements_While_Iterating {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList(List.of(1, 2, 3, 4, 5, 6));

        Iterator<Integer> iterator= list.iterator();
        System.out.println("Before remove even : "+ list);
        while (iterator.hasNext()){
            if (iterator.next()%2==0)
                iterator.remove();

        }

        System.out.println("After remove even : "+ list);
    }
}
