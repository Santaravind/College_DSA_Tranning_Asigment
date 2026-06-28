package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q90_Check_if_Iterator_has_Next {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList(List.of(1,2,3,4,5,6));

       Iterator<Integer>it= list.iterator();
        System.out.println(it.hasNext());
    }
}
