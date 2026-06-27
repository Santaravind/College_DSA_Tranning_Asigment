package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Q38_Find_Elements_Greater_Than_Value {
    public static void main(String[] args) {
        TreeSet<Integer>treeSet=new TreeSet<>(List.of(12,30,45,60,76,90));
        int target=35;
       Iterator<Integer>it= treeSet.iterator();
       while (it.hasNext()){
           if (it.next()<target){
               it.remove();
           }
       }
        System.out.println("Greater than target : "+ treeSet);
    }
}
